package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        int int14 = strComparableMyMap0.extend(strComparable12, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int20 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }
}

