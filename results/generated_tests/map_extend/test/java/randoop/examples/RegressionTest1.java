package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int24 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparable19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "" + "'", strComparable19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        boolean boolean15 = strComparableMyMap0.hasKey(strComparable14);
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove(strComparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        examples.MyMap<java.lang.String, java.lang.Class<?>> strMyMap0 = new examples.MyMap<java.lang.String, java.lang.Class<?>>();
        java.lang.Class<?> wildcardClass1 = strMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementMyMap0 = new examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        examples.MyMap<java.lang.reflect.Type, java.io.Serializable> typeMyMap0 = new examples.MyMap<java.lang.reflect.Type, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = typeMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "" + "'", strComparable19, "");
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "" + "'", strComparable21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        int int15 = strComparableMyMap0.extend(strComparable13, (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        examples.MyMap<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassMyMap0 = new examples.MyMap<java.lang.Class<?>, java.lang.reflect.Type>();
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        int int20 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable19);
        boolean boolean22 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean24 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass25 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        int int21 = strComparableMyMap0.extend(strComparable19, (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = strComparableMyMap0.remove(strComparable18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationMyMap0 = new examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        int int20 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable19);
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18, "hi!");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableMyMap0.hasValue(strComparable12);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int19 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.count();
        boolean boolean19 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int24 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable26 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.count();
        int int6 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasValue(strComparable11);
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        examples.MyMap<java.lang.reflect.Type, java.lang.reflect.Type> typeMyMap0 = new examples.MyMap<java.lang.reflect.Type, java.lang.reflect.Type>();
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasKey(strComparable11);
        int int13 = strComparableMyMap0.count();
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int19 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.count();
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.count();
        int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableMyMap0.item(strComparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int19 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        boolean boolean20 = strComparableMyMap0.hasKey(strComparable19);
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.count();
        int int17 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableMyMap0.hasValue(strComparable12);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableMyMapMyMap0 = new examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.lang.Class<?> wildcardClass1 = strComparableMyMapMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasValue(strComparable11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableMyMap0.hasValue(strComparable12);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int19 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        boolean boolean15 = strComparableMyMap0.hasKey(strComparable14);
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        examples.MyMap<java.lang.String, java.lang.Comparable<java.lang.String>> strMyMap0 = new examples.MyMap<java.lang.String, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasValue(strComparable11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableMyMap0.hasValue(strComparable12);
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int19 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass20 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        int int15 = strComparableMyMap0.extend(strComparable13, (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.count();
        int int17 = strComparableMyMap0.count();
        int int18 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMyMap0.hasValue(strComparable7);
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item(strComparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        int int13 = strComparableMyMap0.extend(strComparable11, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.String> strComparableMyMapMyMap0 = new examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.String>();
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.count();
        int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int22 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "" + "'", strComparable19, "");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int20 = strComparableMyMap0.count();
        int int21 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass22 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMyMap0 = new examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item(strComparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.count();
        int int13 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        int int13 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.count();
        int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean22 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = strComparableMyMap0.remove(strComparable20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "" + "'", strComparable22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparable18.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        examples.MyMap<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceMyMap0 = new examples.MyMap<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        examples.MyMap<java.lang.CharSequence, java.lang.Object> charSequenceMyMap0 = new examples.MyMap<java.lang.CharSequence, java.lang.Object>();
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparable18.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.count();
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.count();
        int int17 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        boolean boolean15 = strComparableMyMap0.hasKey(strComparable14);
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        boolean boolean20 = strComparableMyMap0.hasKey(strComparable19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.count();
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove(strComparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasKey(strComparable11);
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int20 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int24 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "hi!" + "'", strComparable22, "hi!");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean22 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        int int25 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable24);
        int int27 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasKey(strComparable11);
        int int13 = strComparableMyMap0.count();
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        examples.MyMap<java.lang.Comparable<java.lang.String>, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.lang.Class<?> wildcardClass1 = strComparableMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18, "hi!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMyMap0.hasValue(strComparable7);
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        examples.MyMap<java.lang.String, java.lang.reflect.Type> strMyMap0 = new examples.MyMap<java.lang.String, java.lang.reflect.Type>();
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationMyMap0 = new examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass9 = strComparable8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "" + "'", strComparable8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMyMap0 = new examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.String>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        examples.MyMap<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMyMap0 = new examples.MyMap<java.io.Serializable, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = serializableMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item(strComparable19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        boolean boolean16 = strComparableMyMap0.hasKey(strComparable15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int23 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int26 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + strComparable28 + "' != '" + "hi!" + "'", strComparable28, "hi!");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        int int13 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean26 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int28 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "hi!" + "'", strComparable21, "hi!");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasValue(strComparable11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        examples.MyMap<java.lang.Class<?>, java.io.Serializable> wildcardClassMyMap0 = new examples.MyMap<java.lang.Class<?>, java.io.Serializable>();
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMyMap0.remove(strComparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMyMap0.hasValue(strComparable7);
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove(strComparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        int int6 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass7 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasValue(strComparable11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        boolean boolean7 = strComparableMyMap0.hasKey(strComparable6);
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item(strComparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        boolean boolean11 = strComparableMyMap0.hasKey(strComparable10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable18);
        int int21 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(strComparable23);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.count();
        int int18 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = strComparableMyMap0.remove(strComparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        boolean boolean15 = strComparableMyMap0.hasKey(strComparable14);
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        int int19 = strComparableMyMap0.extend(strComparable17, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int21 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.count();
        int int16 = strComparableMyMap0.count();
        boolean boolean18 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int19 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        int int20 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable19);
        boolean boolean22 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int23 = strComparableMyMap0.count();
        int int25 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean27 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean29 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable31 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + strComparable31 + "' != '" + "" + "'", strComparable31, "");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.count();
        int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass24 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "" + "'", strComparable19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "" + "'", strComparable23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        int int22 = strComparableMyMap0.extend(strComparable20, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableMyMap0.item(strComparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        int int13 = strComparableMyMap0.count();
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int19 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item(strComparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        boolean boolean16 = strComparableMyMap0.hasValue(strComparable15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean25 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean27 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable29 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.count();
        int int6 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.count();
        int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        boolean boolean15 = strComparableMyMap0.hasValue(strComparable14);
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        examples.MyMap<java.lang.String, java.lang.Object> strMyMap0 = new examples.MyMap<java.lang.String, java.lang.Object>();
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasValue(strComparable11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        int int13 = strComparableMyMap0.extend(strComparable11, (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparable18.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableMyMap0.hasValue(strComparable12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        examples.MyMap<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassMyMap0 = new examples.MyMap<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = wildcardClassMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item(strComparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable11);
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int6 = strComparableMyMap0.count();
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable23 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "" + "'", strComparable19, "");
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "" + "'", strComparable21, "");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        int int13 = strComparableMyMap0.extend(strComparable11, (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        examples.MyMap<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMyMap0 = new examples.MyMap<java.lang.reflect.GenericDeclaration, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable22 = strComparableMyMap0.item(strComparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.count();
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove(strComparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18, "hi!");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.count();
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMyMap0.count();
        int int23 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        int int20 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable19);
        boolean boolean22 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int24 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int26 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int19 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        boolean boolean11 = strComparableMyMap0.hasValue(strComparable10);
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.count();
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int21 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableMyMap0.hasValue(strComparable12);
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableMyMap0.hasValue(strComparable12);
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item(strComparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.count();
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        int int15 = strComparableMyMap0.extend(strComparable13, (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable13);
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        examples.MyMap<java.lang.String, java.lang.reflect.AnnotatedElement> strMyMap0 = new examples.MyMap<java.lang.String, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = strMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int22 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.count();
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        examples.MyMap<java.lang.reflect.Type, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> typeMyMap0 = new examples.MyMap<java.lang.reflect.Type, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        boolean boolean17 = strComparableMyMap0.hasValue(strComparable16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableMyMap0.count();
        boolean boolean23 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean25 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        int int6 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item(strComparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        int int20 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable19);
        boolean boolean22 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int23 = strComparableMyMap0.count();
        int int25 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean27 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean29 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean31 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable33 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.count();
        boolean boolean20 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.count();
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int26 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean23 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        int int13 = strComparableMyMap0.extend(strComparable11, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean25 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass26 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int20 = strComparableMyMap0.count();
        boolean boolean22 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable24 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasKey(strComparable11);
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int6 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass7 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean24 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "" + "'", strComparable20, "");
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "" + "'", strComparable22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.count();
        boolean boolean20 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableMyMap0.count();
        int int26 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int27 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        boolean boolean17 = strComparableMyMap0.hasValue(strComparable16);
        int int18 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        int int6 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationMyMap0 = new examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>();
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.count();
        int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int19 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int19 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable9);
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int19 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "" + "'", strComparable21, "");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableMyMap0.count();
        int int22 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        boolean boolean15 = strComparableMyMap0.hasKey(strComparable14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        boolean boolean9 = strComparableMyMap0.hasKey(strComparable8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable9);
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable15);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.count();
        boolean boolean21 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        boolean boolean16 = strComparableMyMap0.hasValue(strComparable15);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove(strComparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }
}

