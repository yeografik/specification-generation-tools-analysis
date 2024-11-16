package lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, true);
        int int54 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass55 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(false, true);
        int int51 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass52 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(false, true);
        int int54 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass55 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, true);
        int int54 = booleanUtils0.compare(true, false);
        int int57 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, true);
        int int51 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass52 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, true);
        int int54 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass55 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(false, true);
        int int51 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, true);
        int int54 = booleanUtils0.compare(false, true);
        int int57 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass58 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(true, false);
        int int51 = booleanUtils0.compare(false, true);
        int int54 = booleanUtils0.compare(false, true);
        int int57 = booleanUtils0.compare(false, false);
        int int60 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(true, true);
        int int51 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass52 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass52 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(false, true);
        int int51 = booleanUtils0.compare(true, false);
        int int54 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass55 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(false, false);
        int int54 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, true);
        int int54 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass55 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(true, false);
        int int51 = booleanUtils0.compare(false, true);
        int int54 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, true);
        int int51 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass52 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass52 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass52 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass52 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(false, true);
        int int54 = booleanUtils0.compare(false, false);
        int int57 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, true);
        int int54 = booleanUtils0.compare(false, true);
        int int57 = booleanUtils0.compare(true, true);
        int int60 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }
}

