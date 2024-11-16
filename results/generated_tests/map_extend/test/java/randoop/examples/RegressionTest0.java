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
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        java.lang.Class<?> wildcardClass5 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass4 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        examples.MyMap<java.lang.CharSequence, java.io.Serializable> charSequenceMyMap0 = new examples.MyMap<java.lang.CharSequence, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = charSequenceMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass3 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass4 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass6 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item(strComparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMyMap0.remove(strComparable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item(strComparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        examples.MyMap<java.lang.reflect.Type, java.lang.String> typeMyMap0 = new examples.MyMap<java.lang.reflect.Type, java.lang.String>();
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparable10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass2 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparable9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove(strComparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence> strComparableMyMapMyMap0 = new examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = strComparableMyMapMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        examples.MyMap<java.lang.Object, java.lang.String> objMyMap0 = new examples.MyMap<java.lang.Object, java.lang.String>();
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        examples.MyMap<java.lang.Object, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> objMyMap0 = new examples.MyMap<java.lang.Object, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item(strComparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass8 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item(strComparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
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
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.reflect.AnnotatedElement> strComparableMyMapMyMap0 = new examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item(strComparable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMyMap0 = new examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.String>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        examples.MyMap<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMyMap0 = new examples.MyMap<java.lang.Class<?>, java.lang.CharSequence>();
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationMyMap0 = new examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>();
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        examples.MyMap<java.lang.Class<?>, java.lang.Object> wildcardClassMyMap0 = new examples.MyMap<java.lang.Class<?>, java.lang.Object>();
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.io.Serializable> strComparableMyMapMyMap0 = new examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.io.Serializable>();
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMyMap0.hasValue(strComparable7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass7 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove(strComparable9);
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
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass5 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMyMap0.remove(strComparable14);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass8 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Object>();
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.Comparable<java.lang.String>> strComparableMyMapMyMap0 = new examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = strComparableMyMapMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        examples.MyMap<java.lang.String, java.lang.CharSequence> strMyMap0 = new examples.MyMap<java.lang.String, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = strMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
            int int21 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        examples.MyMap<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMyMap0 = new examples.MyMap<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass8 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMyMap0.remove(strComparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable9);
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
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
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item(strComparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass8 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparable14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.String>();
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
            int int21 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        examples.MyMap<java.lang.String, java.io.Serializable> strMyMap0 = new examples.MyMap<java.lang.String, java.io.Serializable>();
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasKey(strComparable11);
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>();
        java.lang.Class<?> wildcardClass1 = strComparableMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparable10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparable13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.Class<?>> strComparableMyMapMyMap0 = new examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.Class<?>>();
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
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
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
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
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        examples.MyMap<java.lang.Class<?>, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> wildcardClassMyMap0 = new examples.MyMap<java.lang.Class<?>, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        boolean boolean14 = strComparableMyMap0.hasValue(strComparable13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
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
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass20 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "" + "'", strComparable19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMyMap0.hasValue(strComparable7);
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
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
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int21 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass8 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int21 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
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
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparable13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        examples.MyMap<java.lang.reflect.GenericDeclaration, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> genericDeclarationMyMap0 = new examples.MyMap<java.lang.reflect.GenericDeclaration, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item(strComparable11);
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.lang.Class<?> wildcardClass20 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementMyMap0 = new examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        examples.MyMap<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMyMap0 = new examples.MyMap<java.io.Serializable, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "" + "'", strComparable19, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparable18.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "" + "'", strComparable18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass6 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMyMap0.hasValue(strComparable7);
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementMyMap0 = new examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.Object>();
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass5 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMyMap0.hasValue(strComparable7);
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        java.lang.Class<?> wildcardClass20 = strComparableMyMap0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        examples.MyMap<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeMyMap0 = new examples.MyMap<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int21 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
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
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item(strComparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        examples.MyMap<java.io.Serializable, java.lang.reflect.Type> serializableMyMap0 = new examples.MyMap<java.io.Serializable, java.lang.reflect.Type>();
        java.lang.Class<?> wildcardClass1 = serializableMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMyMap0.item(strComparable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        boolean boolean21 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass22 = strComparableMyMap0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass7 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        examples.MyMap<java.lang.Object, java.lang.Comparable<java.lang.String>> objMyMap0 = new examples.MyMap<java.lang.Object, java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = objMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int19 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        int int13 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable11);
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        examples.MyMap<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableMyMap0 = new examples.MyMap<java.io.Serializable, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable9);
        int int11 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass12 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration> strComparableMyMapMyMap0 = new examples.MyMap<examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        boolean boolean21 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMyMap0.hasKey(strComparable11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        boolean boolean23 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.count();
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMyMap0.remove(strComparable14);
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
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMyMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        examples.MyMap<java.io.Serializable, java.lang.String> serializableMyMap0 = new examples.MyMap<java.io.Serializable, java.lang.String>();
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        examples.MyMap<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeMyMap0 = new examples.MyMap<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        boolean boolean16 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        examples.MyMap<java.lang.Object, java.lang.Class<?>> objMyMap0 = new examples.MyMap<java.lang.Object, java.lang.Class<?>>();
        java.lang.Class<?> wildcardClass1 = objMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationMyMap0 = new examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>();
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMyMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        examples.MyMap<java.lang.reflect.AnnotatedElement, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> annotatedElementMyMap0 = new examples.MyMap<java.lang.reflect.AnnotatedElement, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        examples.MyMap<java.lang.Object, java.lang.Object> objMyMap0 = new examples.MyMap<java.lang.Object, java.lang.Object>();
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.io.Serializable>();
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMyMap0.hasValue(strComparable7);
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.lang.Class<?> wildcardClass21 = strComparableMyMap0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        examples.MyMap<java.lang.String, java.lang.reflect.GenericDeclaration> strMyMap0 = new examples.MyMap<java.lang.String, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass6 = strComparable5.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        int int21 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "" + "'", strComparable17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        int int17 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        boolean boolean7 = strComparableMyMap0.hasKey(strComparable6);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        int int12 = strComparableMyMap0.count();
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        int int9 = strComparableMyMap0.count();
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove(strComparable13);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMyMap0.count();
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMyMap0.hasValue(strComparable7);
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.count();
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementMyMap0 = new examples.MyMap<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>();
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.count();
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        boolean boolean15 = strComparableMyMap0.hasValue(strComparable14);
        int int16 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        boolean boolean10 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMyMap0.count();
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
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
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        int int16 = strComparableMyMap0.extend(strComparable14, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        examples.MyMap<java.io.Serializable, java.lang.Class<?>> serializableMyMap0 = new examples.MyMap<java.io.Serializable, java.lang.Class<?>>();
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparable12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "" + "'", strComparable12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        boolean boolean7 = strComparableMyMap0.hasKey(strComparable6);
        int int10 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        boolean boolean19 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        boolean boolean3 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.count();
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMyMap0.count();
        int int18 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        examples.MyMap<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceMyMap0 = new examples.MyMap<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        examples.MyMap<java.lang.reflect.Type, java.lang.Class<?>> typeMyMap0 = new examples.MyMap<java.lang.reflect.Type, java.lang.Class<?>>();
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        boolean boolean14 = strComparableMyMap0.hasValue(strComparable13);
        java.lang.Class<?> wildcardClass15 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
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
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparable13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "" + "'", strComparable13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMyMap0.remove(strComparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMyMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMyMap0.count();
        int int8 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int3 = strComparableMyMap0.count();
        boolean boolean5 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        boolean boolean7 = strComparableMyMap0.hasKey(strComparable6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMyMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMyMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        examples.MyMap<java.lang.String, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strMyMap0 = new examples.MyMap<java.lang.String, examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.lang.Class<?> wildcardClass1 = strMyMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        int int5 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMyMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableMyMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationMyMap0 = new examples.MyMap<java.lang.reflect.GenericDeclaration, java.lang.Object>();
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        examples.MyMap<java.lang.Object, java.io.Serializable> objMyMap0 = new examples.MyMap<java.lang.Object, java.io.Serializable>();
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMyMap0 = new examples.MyMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMyMap0.count();
        int int2 = strComparableMyMap0.count();
        boolean boolean4 = strComparableMyMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMyMap0.count();
        int int11 = strComparableMyMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }
}

