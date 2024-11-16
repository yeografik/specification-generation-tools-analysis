package lang3;

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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        int int48 = booleanUtils0.compare(true, false);
        int int51 = booleanUtils0.compare(true, false);
        int int54 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        int int42 = booleanUtils0.compare(true, true);
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        int int48 = booleanUtils0.compare(true, true);
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        int int39 = booleanUtils0.compare(false, true);
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
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        int int36 = booleanUtils0.compare(false, false);
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
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, false);
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        int int48 = booleanUtils0.compare(true, true);
        int int51 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        int int45 = booleanUtils0.compare(false, false);
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        int int48 = booleanUtils0.compare(false, true);
        int int51 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
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
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
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
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        int int51 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
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
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        int int39 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        int int33 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        int int36 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
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
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        int int33 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        int int33 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        int int51 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        int int39 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        int int30 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
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
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
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
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        int int48 = booleanUtils0.compare(false, true);
        int int51 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        int int57 = booleanUtils0.compare(true, false);
        int int60 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
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
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        int int45 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        int int54 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        int int36 = booleanUtils0.compare(false, true);
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        int int39 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        int int30 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        int int36 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        int int30 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
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
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
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
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        int int51 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
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
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        int int33 = booleanUtils0.compare(true, true);
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
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        int int45 = booleanUtils0.compare(false, false);
        int int48 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        int int30 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        int int39 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        int int36 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        int int33 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        int int48 = booleanUtils0.compare(false, false);
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
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
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
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        int int45 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, true);
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
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        int int54 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        int int45 = booleanUtils0.compare(true, false);
        int int48 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        int int57 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass58 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        int int54 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        int int30 = booleanUtils0.compare(false, false);
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
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        int int30 = booleanUtils0.compare(false, false);
        int int33 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        int int48 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        int int54 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        int int42 = booleanUtils0.compare(false, false);
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        int int54 = booleanUtils0.compare(true, true);
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
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
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
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        int int48 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        int int33 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        int int30 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
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
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, false);
        int int42 = booleanUtils0.compare(true, false);
        int int45 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        int int30 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        int int30 = booleanUtils0.compare(true, false);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
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
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        int int48 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        int int48 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        int int42 = booleanUtils0.compare(false, false);
        int int45 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
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
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        int int45 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        int int33 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, false);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        java.lang.Class<?> wildcardClass49 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
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
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        int int48 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(false, true);
        int int45 = booleanUtils0.compare(true, true);
        int int48 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        int int39 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        int int30 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
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
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
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
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        int int33 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        int int33 = booleanUtils0.compare(true, true);
        int int36 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass37 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        int int33 = booleanUtils0.compare(false, true);
        int int36 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        int int33 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass34 = booleanUtils0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        int int39 = booleanUtils0.compare(true, true);
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        int int36 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        int int39 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        int int39 = booleanUtils0.compare(false, false);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
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
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
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
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        int int33 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
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
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        int int42 = booleanUtils0.compare(false, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
        int int57 = booleanUtils0.compare(true, true);
        int int60 = booleanUtils0.compare(true, true);
        int int63 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        int int30 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        int int36 = booleanUtils0.compare(false, false);
        int int39 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass40 = booleanUtils0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        int int39 = booleanUtils0.compare(false, true);
        int int42 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        int int36 = booleanUtils0.compare(true, true);
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
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
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
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        int int39 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
        int int42 = booleanUtils0.compare(false, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        int int30 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        int int33 = booleanUtils0.compare(true, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        int int45 = booleanUtils0.compare(false, true);
        int int48 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(false, false);
        int int27 = booleanUtils0.compare(true, true);
        int int30 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, false);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        int int42 = booleanUtils0.compare(true, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, true);
        int int18 = booleanUtils0.compare(false, false);
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
}

