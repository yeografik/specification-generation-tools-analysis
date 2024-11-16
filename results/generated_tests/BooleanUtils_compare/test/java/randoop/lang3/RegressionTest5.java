package lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        int int54 = booleanUtils0.compare(false, false);
        int int57 = booleanUtils0.compare(false, false);
        int int60 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass61 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, true);
        int int51 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        int int48 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        int int48 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
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
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        int int45 = booleanUtils0.compare(true, true);
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
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
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
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
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
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        int int30 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        int int39 = booleanUtils0.compare(false, false);
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
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        int int42 = booleanUtils0.compare(false, false);
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
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        int int33 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        int int30 = booleanUtils0.compare(false, true);
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
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
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
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        int int51 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        int int54 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        int int30 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        int int45 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        int int30 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        int int57 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        int int51 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass52 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        int int57 = booleanUtils0.compare(true, true);
        int int60 = booleanUtils0.compare(true, true);
        int int63 = booleanUtils0.compare(false, true);
        int int66 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
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
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        int int45 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        int int30 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        int int30 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        int int51 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
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
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
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
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
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
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        int int54 = booleanUtils0.compare(false, true);
        int int57 = booleanUtils0.compare(false, false);
        int int60 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
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
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
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
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
        int int30 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        int int30 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
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
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        int int30 = booleanUtils0.compare(false, false);
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
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
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
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        int int30 = booleanUtils0.compare(false, false);
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
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        int int54 = booleanUtils0.compare(true, true);
        int int57 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
        int int48 = booleanUtils0.compare(true, true);
        int int51 = booleanUtils0.compare(true, false);
        int int54 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        int int48 = booleanUtils0.compare(false, false);
        int int51 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
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
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
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
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        int int42 = booleanUtils0.compare(true, true);
        int int45 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
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
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        int int30 = booleanUtils0.compare(true, true);
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
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
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
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
        int int33 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        int int30 = booleanUtils0.compare(true, true);
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
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
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
        int int30 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
        int int30 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        int int30 = booleanUtils0.compare(false, false);
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
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
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
        int int39 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
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
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
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
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
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
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
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
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        int int45 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        int int33 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
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
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
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
        int int57 = booleanUtils0.compare(true, true);
        int int60 = booleanUtils0.compare(true, true);
        int int63 = booleanUtils0.compare(false, true);
        int int66 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
        int int36 = booleanUtils0.compare(true, true);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
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
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        int int36 = booleanUtils0.compare(false, false);
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
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
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
        int int54 = booleanUtils0.compare(true, false);
        int int57 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass58 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
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
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        int int45 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass46 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
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
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
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
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
        int int36 = booleanUtils0.compare(true, false);
        int int39 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
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
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        int int33 = booleanUtils0.compare(true, true);
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
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
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
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass43 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }
}

