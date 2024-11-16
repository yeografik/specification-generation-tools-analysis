package lang3;

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
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(true, true);
        int int51 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        int int45 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        int int36 = booleanUtils0.compare(false, false);
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
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        int int48 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        int int30 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
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
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        int int42 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
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
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        int int36 = booleanUtils0.compare(true, true);
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
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        int int33 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        int int30 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        int int51 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        int int30 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        int int39 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        int int51 = booleanUtils0.compare(false, false);
        int int54 = booleanUtils0.compare(false, false);
        int int57 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        int int30 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        int int30 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        int int54 = booleanUtils0.compare(true, false);
        int int57 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        int int45 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        int int48 = booleanUtils0.compare(true, false);
        int int51 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass52 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
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
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        int int42 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
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
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        int int42 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
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
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        int int57 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        int int30 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        int int33 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        int int57 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        int int51 = booleanUtils0.compare(false, false);
        int int54 = booleanUtils0.compare(false, false);
        int int57 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        int int42 = booleanUtils0.compare(false, false);
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
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        int int45 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        int int39 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
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
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        int int48 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        int int51 = booleanUtils0.compare(false, false);
        int int54 = booleanUtils0.compare(true, false);
        int int57 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        int int48 = booleanUtils0.compare(true, false);
        int int51 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
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
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
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
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
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
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        int int30 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
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
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        int int30 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        int int30 = booleanUtils0.compare(false, false);
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
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
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
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        int int45 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
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
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        int int39 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        int int30 = booleanUtils0.compare(false, false);
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
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
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
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        int int57 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        int int48 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        int int48 = booleanUtils0.compare(true, false);
        int int51 = booleanUtils0.compare(false, true);
        int int54 = booleanUtils0.compare(false, true);
        int int57 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        int int51 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        int int54 = booleanUtils0.compare(true, false);
        int int57 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(true, true);
        int int51 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        int int54 = booleanUtils0.compare(true, true);
        int int57 = booleanUtils0.compare(true, true);
        int int60 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        int int33 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        int int30 = booleanUtils0.compare(false, false);
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
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        int int48 = booleanUtils0.compare(false, false);
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
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        int int54 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass55 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        int int39 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
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
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
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
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
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
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }
}

