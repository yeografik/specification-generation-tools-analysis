package DataStructures;

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
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.String str3 = overflow0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DataStructures.Overflow" + "'", str3, "DataStructures.Overflow");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Class<?> wildcardClass1 = underflow0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        java.lang.String str2 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DataStructures.Underflow" + "'", str2, "DataStructures.Underflow");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) underflow7);
        java.lang.String str10 = underflow7.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DataStructures.Underflow" + "'", str10, "DataStructures.Underflow");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 2.7d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Class<?> wildcardClass4 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj4);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.String str1 = underflow0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DataStructures.Underflow" + "'", str1, "DataStructures.Underflow");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 7.1d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.String str12 = overflow7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DataStructures.Overflow" + "'", str12, "DataStructures.Overflow");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(0);
        java.lang.Object obj6 = stackAr5.topAndPop();
        java.lang.Object obj7 = stackAr5.top();
        stackAr5.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (-7));
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        java.lang.String str16 = underflow2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DataStructures.Underflow" + "'", str16, "DataStructures.Underflow");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 9.6d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) "DataStructures.Underflow");
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(0);
        java.lang.Object obj10 = stackAr9.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        java.lang.String str4 = overflow1.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DataStructures.Overflow" + "'", str4, "DataStructures.Overflow");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        underflow16.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray22 = overflow19.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow23);
        overflow7.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.String str27 = underflow23.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DataStructures.Underflow" + "'", str27, "DataStructures.Underflow");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        java.lang.Throwable[] throwableArray9 = overflow5.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        overflow5.addSuppressed((java.lang.Throwable) overflow10);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        underflow11.addSuppressed((java.lang.Throwable) overflow14);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        overflow14.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Class<?> wildcardClass23 = overflow14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow14);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        underflow6.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray19 = underflow6.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        underflow6.addSuppressed((java.lang.Throwable) overflow21);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) underflow6);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(0);
        boolean boolean6 = stackAr5.isFull();
        stackAr5.makeEmpty();
        java.lang.Object obj8 = stackAr5.topAndPop();
        stackAr5.makeEmpty();
        boolean boolean10 = stackAr5.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (-5L));
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(0);
        java.lang.Object obj6 = stackAr5.topAndPop();
        java.lang.Object obj7 = stackAr5.top();
        stackAr5.makeEmpty();
        boolean boolean9 = stackAr5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Class<?> wildcardClass12 = overflow7.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.Class<?> wildcardClass1 = overflow0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.String str5 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DataStructures.Overflow" + "'", str5, "DataStructures.Overflow");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        underflow16.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray22 = overflow19.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow23);
        overflow7.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.String str27 = overflow7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DataStructures.Overflow" + "'", str27, "DataStructures.Overflow");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr4.top();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(2);
        // The following exception was thrown during execution in test generation
        try {
            stackAr4.push((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) underflow9);
        java.lang.String str13 = underflow9.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DataStructures.Underflow" + "'", str13, "DataStructures.Underflow");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Class<?> wildcardClass7 = overflow4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow4);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow16);
        underflow7.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray20 = underflow7.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow22.getSuppressed();
        underflow7.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray26 = underflow7.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) throwableArray26);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow17);
        underflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow6.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        underflow8.addSuppressed((java.lang.Throwable) overflow22);
        underflow0.addSuppressed((java.lang.Throwable) underflow8);
        java.lang.String str33 = underflow8.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DataStructures.Underflow" + "'", str33, "DataStructures.Underflow");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        boolean boolean2 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow1.getSuppressed();
        java.lang.String str5 = overflow1.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DataStructures.Overflow" + "'", str5, "DataStructures.Overflow");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.String str28 = overflow7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DataStructures.Overflow" + "'", str28, "DataStructures.Overflow");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        underflow24.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray30 = overflow27.getSuppressed();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow31);
        underflow22.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray35 = underflow22.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray39 = overflow37.getSuppressed();
        underflow22.addSuppressed((java.lang.Throwable) overflow37);
        overflow0.addSuppressed((java.lang.Throwable) underflow22);
        java.lang.Class<?> wildcardClass42 = underflow22.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray11 = overflow9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = overflow9.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr4.push((java.lang.Object) throwableArray12);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        overflow0.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        underflow16.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray22 = overflow19.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow23);
        underflow14.addSuppressed((java.lang.Throwable) overflow19);
        underflow12.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.String str28 = underflow12.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DataStructures.Underflow" + "'", str28, "DataStructures.Underflow");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Class<?> wildcardClass8 = stackAr4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow17);
        underflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow6.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        underflow8.addSuppressed((java.lang.Throwable) overflow22);
        underflow0.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        underflow37.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray43 = overflow40.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow40);
        underflow8.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Class<?> wildcardClass46 = underflow8.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(7);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow17);
        underflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow6.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        underflow8.addSuppressed((java.lang.Throwable) overflow22);
        underflow0.addSuppressed((java.lang.Throwable) underflow8);
        java.lang.String str33 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DataStructures.Underflow" + "'", str33, "DataStructures.Underflow");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow23.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.String str43 = overflow37.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "DataStructures.Overflow" + "'", str43, "DataStructures.Overflow");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray13 = overflow10.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow10.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        underflow19.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        overflow10.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray32 = overflow10.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr4.push((java.lang.Object) overflow10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (-7.3d));
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray11 = overflow8.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        overflow8.addSuppressed((java.lang.Throwable) underflow20);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        underflow24.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray30 = overflow27.getSuppressed();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow31);
        underflow22.addSuppressed((java.lang.Throwable) overflow27);
        underflow20.addSuppressed((java.lang.Throwable) overflow27);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow27);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr4.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr4.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(0);
        java.lang.Object obj8 = stackAr7.topAndPop();
        java.lang.Object obj9 = stackAr7.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow17);
        underflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow6.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        underflow8.addSuppressed((java.lang.Throwable) overflow22);
        underflow0.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        underflow37.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray43 = overflow40.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow40);
        underflow8.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.String str46 = overflow33.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "DataStructures.Overflow" + "'", str46, "DataStructures.Overflow");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 2.7d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray13 = underflow0.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow15.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.String str19 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DataStructures.Underflow" + "'", str19, "DataStructures.Underflow");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        overflow0.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Class<?> wildcardClass14 = underflow12.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.String str9 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DataStructures.Overflow" + "'", str9, "DataStructures.Overflow");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow2.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        underflow30.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        overflow33.addSuppressed((java.lang.Throwable) overflow38);
        underflow2.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Class<?> wildcardClass43 = overflow33.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow22.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        underflow25.addSuppressed((java.lang.Throwable) overflow28);
        overflow22.addSuppressed((java.lang.Throwable) overflow28);
        overflow12.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        java.lang.Throwable[] throwableArray40 = overflow37.getSuppressed();
        java.lang.Throwable[] throwableArray41 = overflow37.getSuppressed();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        overflow42.addSuppressed((java.lang.Throwable) overflow43);
        overflow37.addSuppressed((java.lang.Throwable) overflow42);
        overflow33.addSuppressed((java.lang.Throwable) overflow42);
        overflow28.addSuppressed((java.lang.Throwable) overflow42);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow42);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.String str10 = overflow5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DataStructures.Overflow" + "'", str10, "DataStructures.Overflow");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray22 = overflow0.getSuppressed();
        java.lang.String str23 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DataStructures.Overflow" + "'", str23, "DataStructures.Overflow");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        java.lang.Throwable[] throwableArray16 = underflow2.getSuppressed();
        java.lang.String str17 = underflow2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DataStructures.Underflow" + "'", str17, "DataStructures.Underflow");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow2.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        underflow30.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        overflow33.addSuppressed((java.lang.Throwable) overflow38);
        underflow2.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.String str43 = overflow33.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "DataStructures.Overflow" + "'", str43, "DataStructures.Overflow");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isFull();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray9 = overflow6.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        overflow13.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow23.getSuppressed();
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        underflow26.addSuppressed((java.lang.Throwable) overflow29);
        overflow23.addSuppressed((java.lang.Throwable) overflow29);
        overflow13.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray37 = overflow34.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray41 = overflow38.getSuppressed();
        java.lang.Throwable[] throwableArray42 = overflow38.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        overflow38.addSuppressed((java.lang.Throwable) overflow43);
        overflow34.addSuppressed((java.lang.Throwable) overflow43);
        overflow29.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        underflow49.addSuppressed((java.lang.Throwable) overflow52);
        java.lang.Throwable[] throwableArray55 = overflow52.getSuppressed();
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow56);
        overflow43.addSuppressed((java.lang.Throwable) underflow56);
        java.lang.Throwable[] throwableArray60 = overflow43.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) throwableArray60);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) underflow7);
        java.lang.Throwable[] throwableArray10 = underflow7.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        underflow7.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.String str17 = underflow7.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DataStructures.Underflow" + "'", str17, "DataStructures.Underflow");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        overflow0.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray14 = underflow12.getSuppressed();
        java.lang.Class<?> wildcardClass15 = throwableArray14.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        underflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow25);
        underflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow14.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        underflow16.addSuppressed((java.lang.Throwable) underflow31);
        java.lang.String str33 = underflow16.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DataStructures.Underflow" + "'", str33, "DataStructures.Underflow");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.Throwable[] throwableArray12 = overflow9.getSuppressed();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        underflow13.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow16);
        overflow5.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.String str22 = overflow5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DataStructures.Overflow" + "'", str22, "DataStructures.Overflow");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass3 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.String str22 = overflow17.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DataStructures.Overflow" + "'", str22, "DataStructures.Overflow");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr8);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow17);
        underflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow6.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        underflow8.addSuppressed((java.lang.Throwable) overflow22);
        underflow0.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        underflow37.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray43 = overflow40.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow40);
        underflow8.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray46 = overflow33.getSuppressed();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        java.lang.Throwable[] throwableArray50 = overflow47.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow47.getSuppressed();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        overflow52.addSuppressed((java.lang.Throwable) overflow53);
        java.lang.Throwable[] throwableArray55 = overflow52.getSuppressed();
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        overflow58.addSuppressed((java.lang.Throwable) overflow59);
        underflow56.addSuppressed((java.lang.Throwable) overflow59);
        java.lang.Throwable[] throwableArray62 = overflow59.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) overflow59);
        DataStructures.Overflow overflow64 = new DataStructures.Overflow();
        DataStructures.Overflow overflow65 = new DataStructures.Overflow();
        overflow64.addSuppressed((java.lang.Throwable) overflow65);
        overflow59.addSuppressed((java.lang.Throwable) overflow64);
        overflow47.addSuppressed((java.lang.Throwable) overflow64);
        DataStructures.Underflow underflow69 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray70 = underflow69.getSuppressed();
        DataStructures.Underflow underflow71 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray72 = underflow71.getSuppressed();
        DataStructures.Underflow underflow73 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray74 = underflow73.getSuppressed();
        DataStructures.Overflow overflow75 = new DataStructures.Overflow();
        DataStructures.Overflow overflow76 = new DataStructures.Overflow();
        overflow75.addSuppressed((java.lang.Throwable) overflow76);
        underflow73.addSuppressed((java.lang.Throwable) overflow76);
        java.lang.Throwable[] throwableArray79 = overflow76.getSuppressed();
        DataStructures.Underflow underflow80 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray81 = underflow80.getSuppressed();
        overflow76.addSuppressed((java.lang.Throwable) underflow80);
        underflow71.addSuppressed((java.lang.Throwable) overflow76);
        underflow69.addSuppressed((java.lang.Throwable) underflow71);
        overflow64.addSuppressed((java.lang.Throwable) underflow71);
        DataStructures.Overflow overflow86 = new DataStructures.Overflow();
        DataStructures.Overflow overflow87 = new DataStructures.Overflow();
        overflow86.addSuppressed((java.lang.Throwable) overflow87);
        java.lang.Throwable[] throwableArray89 = overflow87.getSuppressed();
        DataStructures.Underflow underflow90 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray91 = underflow90.getSuppressed();
        DataStructures.Overflow overflow92 = new DataStructures.Overflow();
        DataStructures.Overflow overflow93 = new DataStructures.Overflow();
        overflow92.addSuppressed((java.lang.Throwable) overflow93);
        underflow90.addSuppressed((java.lang.Throwable) overflow93);
        overflow87.addSuppressed((java.lang.Throwable) overflow93);
        underflow71.addSuppressed((java.lang.Throwable) overflow93);
        overflow33.addSuppressed((java.lang.Throwable) overflow93);
        java.lang.String str99 = overflow93.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "DataStructures.Overflow" + "'", str99, "DataStructures.Overflow");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.String str13 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DataStructures.Underflow" + "'", str13, "DataStructures.Underflow");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = underflow0.getSuppressed();
        java.lang.String str7 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DataStructures.Underflow" + "'", str7, "DataStructures.Underflow");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray12 = overflow7.getSuppressed();
        java.lang.String str13 = overflow7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DataStructures.Overflow" + "'", str13, "DataStructures.Overflow");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        boolean boolean4 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(1);
        stackAr6.makeEmpty();
        boolean boolean8 = stackAr6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr6);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj6);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(0);
        boolean boolean9 = stackAr8.isFull();
        stackAr8.makeEmpty();
        java.lang.Object obj11 = stackAr8.topAndPop();
        stackAr8.makeEmpty();
        stackAr8.makeEmpty();
        boolean boolean14 = stackAr8.isFull();
        stackAr8.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr8);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray13 = overflow10.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow14.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        overflow14.addSuppressed((java.lang.Throwable) overflow19);
        overflow10.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        overflow10.addSuppressed((java.lang.Throwable) overflow25);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.Class<?> wildcardClass29 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.String str6 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DataStructures.Underflow" + "'", str6, "DataStructures.Underflow");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow11);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(0);
        java.lang.Object obj10 = stackAr9.top();
        boolean boolean11 = stackAr9.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(0);
        boolean boolean10 = stackAr9.isFull();
        java.lang.Object obj11 = stackAr9.top();
        java.lang.Object obj12 = stackAr9.topAndPop();
        boolean boolean13 = stackAr9.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackAr9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        underflow11.addSuppressed((java.lang.Throwable) overflow14);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        overflow14.addSuppressed((java.lang.Throwable) underflow18);
        underflow9.addSuppressed((java.lang.Throwable) overflow14);
        java.lang.Throwable[] throwableArray22 = underflow9.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) underflow9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        overflow1.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.String str11 = overflow1.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DataStructures.Overflow" + "'", str11, "DataStructures.Overflow");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray11 = overflow8.getSuppressed();
        java.lang.Throwable[] throwableArray12 = overflow8.getSuppressed();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow13);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow13);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray16 = overflow7.getSuppressed();
        java.lang.String str17 = overflow7.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DataStructures.Overflow" + "'", str17, "DataStructures.Overflow");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        underflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow25);
        underflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow14.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        underflow16.addSuppressed((java.lang.Throwable) underflow31);
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        underflow33.addSuppressed((java.lang.Throwable) overflow36);
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        underflow43.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray49 = overflow46.getSuppressed();
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow50);
        underflow41.addSuppressed((java.lang.Throwable) overflow46);
        underflow39.addSuppressed((java.lang.Throwable) underflow41);
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        overflow55.addSuppressed((java.lang.Throwable) overflow56);
        java.lang.Throwable[] throwableArray58 = overflow55.getSuppressed();
        java.lang.Throwable[] throwableArray59 = overflow55.getSuppressed();
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        overflow60.addSuppressed((java.lang.Throwable) overflow61);
        overflow55.addSuppressed((java.lang.Throwable) overflow60);
        underflow41.addSuppressed((java.lang.Throwable) overflow55);
        underflow33.addSuppressed((java.lang.Throwable) underflow41);
        DataStructures.Overflow overflow66 = new DataStructures.Overflow();
        DataStructures.Overflow overflow67 = new DataStructures.Overflow();
        overflow66.addSuppressed((java.lang.Throwable) overflow67);
        java.lang.Throwable[] throwableArray69 = overflow66.getSuppressed();
        DataStructures.Underflow underflow70 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray71 = underflow70.getSuppressed();
        DataStructures.Overflow overflow72 = new DataStructures.Overflow();
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        overflow72.addSuppressed((java.lang.Throwable) overflow73);
        underflow70.addSuppressed((java.lang.Throwable) overflow73);
        java.lang.Throwable[] throwableArray76 = overflow73.getSuppressed();
        overflow66.addSuppressed((java.lang.Throwable) overflow73);
        underflow41.addSuppressed((java.lang.Throwable) overflow66);
        java.lang.Throwable[] throwableArray79 = overflow66.getSuppressed();
        underflow16.addSuppressed((java.lang.Throwable) overflow66);
        java.lang.String str81 = overflow66.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "DataStructures.Overflow" + "'", str81, "DataStructures.Overflow");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        overflow0.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.String str18 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DataStructures.Overflow" + "'", str18, "DataStructures.Overflow");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        stackAr4.makeEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(0);
        boolean boolean6 = stackAr5.isFull();
        stackAr5.makeEmpty();
        java.lang.Object obj8 = stackAr5.topAndPop();
        stackAr5.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        underflow6.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray12 = overflow9.getSuppressed();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow13);
        java.lang.Throwable[] throwableArray16 = underflow13.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) underflow13);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        overflow1.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray26 = overflow23.getSuppressed();
        overflow16.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        overflow23.addSuppressed((java.lang.Throwable) overflow28);
        overflow11.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        underflow35.addSuppressed((java.lang.Throwable) overflow38);
        java.lang.Throwable[] throwableArray41 = overflow38.getSuppressed();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        overflow38.addSuppressed((java.lang.Throwable) underflow42);
        underflow33.addSuppressed((java.lang.Throwable) overflow38);
        java.lang.Throwable[] throwableArray46 = underflow33.getSuppressed();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        java.lang.Throwable[] throwableArray50 = overflow48.getSuppressed();
        underflow33.addSuppressed((java.lang.Throwable) overflow48);
        overflow11.addSuppressed((java.lang.Throwable) underflow33);
        java.lang.Throwable[] throwableArray53 = overflow11.getSuppressed();
        overflow1.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable throwable55 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow11.addSuppressed(throwable55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray53);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        overflow11.addSuppressed((java.lang.Throwable) overflow16);
        overflow0.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.String str21 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DataStructures.Overflow" + "'", str21, "DataStructures.Overflow");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        boolean boolean2 = stackAr1.isFull();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Class<?> wildcardClass6 = overflow3.getClass();
        stackAr1.push((java.lang.Object) overflow3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        underflow5.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable[] throwableArray11 = overflow8.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow12);
        underflow3.addSuppressed((java.lang.Throwable) underflow12);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) underflow12);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(0);
        stackAr10.makeEmpty();
        boolean boolean12 = stackAr10.isEmpty();
        boolean boolean13 = stackAr10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr(0);
        java.lang.Object obj4 = stackAr3.topAndPop();
        java.lang.Object obj5 = stackAr3.top();
        stackAr3.makeEmpty();
        boolean boolean7 = stackAr3.isEmpty();
        stackAr3.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr3);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (-100L));
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray13 = underflow0.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow15.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow19.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        underflow23.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow0.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.String str36 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DataStructures.Underflow" + "'", str36, "DataStructures.Underflow");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.top();
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr(0);
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.topAndPop();
        java.lang.Object obj15 = stackAr12.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj15);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow6.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow6.addSuppressed((java.lang.Throwable) overflow12);
        overflow0.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray17 = overflow12.getSuppressed();
        java.lang.String str18 = overflow12.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DataStructures.Overflow" + "'", str18, "DataStructures.Overflow");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray5 = overflow2.getSuppressed();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        underflow6.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray12 = overflow9.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        overflow9.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray21 = overflow19.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        underflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow19.addSuppressed((java.lang.Throwable) overflow25);
        overflow9.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray33 = overflow30.getSuppressed();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray37 = overflow34.getSuppressed();
        java.lang.Throwable[] throwableArray38 = overflow34.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        overflow34.addSuppressed((java.lang.Throwable) overflow39);
        overflow30.addSuppressed((java.lang.Throwable) overflow39);
        overflow25.addSuppressed((java.lang.Throwable) overflow39);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow39);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(2);
        boolean boolean11 = stackAr10.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(0);
        java.lang.Object obj8 = stackAr7.topAndPop();
        boolean boolean9 = stackAr7.isEmpty();
        boolean boolean10 = stackAr7.isEmpty();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isEmpty();
        boolean boolean13 = stackAr7.isFull();
        boolean boolean14 = stackAr7.isFull();
        stackAr1.push((java.lang.Object) stackAr7);
        DataStructures.StackAr stackAr17 = new DataStructures.StackAr(0);
        java.lang.Object obj18 = stackAr17.topAndPop();
        java.lang.Object obj19 = stackAr17.top();
        stackAr17.makeEmpty();
        boolean boolean21 = stackAr17.isEmpty();
        stackAr17.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr17);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(3);
        java.lang.Object obj2 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow19);
        underflow10.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray23 = underflow10.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray27 = overflow25.getSuppressed();
        underflow10.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.String str31 = overflow5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DataStructures.Overflow" + "'", str31, "DataStructures.Overflow");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        java.lang.Throwable[] throwableArray16 = underflow2.getSuppressed();
        java.lang.Class<?> wildcardClass17 = underflow2.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        underflow6.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray19 = underflow6.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        underflow6.addSuppressed((java.lang.Throwable) overflow21);
        underflow0.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.String str26 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DataStructures.Underflow" + "'", str26, "DataStructures.Underflow");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(0);
        java.lang.Object obj11 = stackAr10.top();
        boolean boolean12 = stackAr10.isFull();
        boolean boolean13 = stackAr10.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        overflow11.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        underflow24.addSuppressed((java.lang.Throwable) overflow27);
        overflow21.addSuppressed((java.lang.Throwable) overflow27);
        overflow11.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray39 = overflow36.getSuppressed();
        java.lang.Throwable[] throwableArray40 = overflow36.getSuppressed();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        overflow36.addSuppressed((java.lang.Throwable) overflow41);
        overflow32.addSuppressed((java.lang.Throwable) overflow41);
        overflow27.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        underflow47.addSuppressed((java.lang.Throwable) overflow50);
        java.lang.Throwable[] throwableArray53 = overflow50.getSuppressed();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow54);
        overflow41.addSuppressed((java.lang.Throwable) underflow54);
        overflow0.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.String str59 = overflow41.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "DataStructures.Overflow" + "'", str59, "DataStructures.Overflow");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        underflow26.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray32 = overflow29.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        underflow36.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray42 = overflow39.getSuppressed();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow43);
        underflow34.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray47 = overflow39.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) overflow39);
        overflow17.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.String str50 = overflow17.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "DataStructures.Overflow" + "'", str50, "DataStructures.Overflow");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        underflow22.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = underflow29.getSuppressed();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow33.getSuppressed();
        underflow29.addSuppressed((java.lang.Throwable) overflow33);
        overflow17.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.String str40 = overflow17.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "DataStructures.Overflow" + "'", str40, "DataStructures.Overflow");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        stackAr1.push(obj3);
        stackAr1.push((java.lang.Object) (short) -1);
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(7);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        overflow0.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        underflow16.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray22 = overflow19.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow23);
        underflow14.addSuppressed((java.lang.Throwable) overflow19);
        underflow12.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Class<?> wildcardClass28 = overflow19.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(0);
        java.lang.Object obj9 = stackAr8.topAndPop();
        java.lang.Object obj10 = stackAr8.top();
        boolean boolean11 = stackAr8.isEmpty();
        boolean boolean12 = stackAr8.isEmpty();
        stackAr8.makeEmpty();
        java.lang.Object obj14 = stackAr8.topAndPop();
        boolean boolean15 = stackAr8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        underflow16.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray22 = overflow19.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) underflow23);
        underflow14.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.Throwable[] throwableArray27 = underflow23.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.String str29 = underflow23.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DataStructures.Underflow" + "'", str29, "DataStructures.Underflow");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow2.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.String str26 = underflow2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DataStructures.Underflow" + "'", str26, "DataStructures.Underflow");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow23.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray43 = overflow37.getSuppressed();
        java.lang.String str44 = overflow37.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DataStructures.Overflow" + "'", str44, "DataStructures.Overflow");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(0);
        java.lang.Object obj9 = stackAr8.topAndPop();
        boolean boolean10 = stackAr8.isEmpty();
        java.lang.Object obj11 = stackAr8.topAndPop();
        boolean boolean12 = stackAr8.isEmpty();
        boolean boolean13 = stackAr8.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr8);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        java.lang.String str7 = overflow3.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DataStructures.Overflow" + "'", str7, "DataStructures.Overflow");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        underflow15.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow22);
        underflow13.addSuppressed((java.lang.Throwable) overflow18);
        overflow5.addSuppressed((java.lang.Throwable) underflow13);
        java.lang.String str27 = underflow13.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DataStructures.Underflow" + "'", str27, "DataStructures.Underflow");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        underflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow25);
        underflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow14.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) underflow16);
        java.lang.String str31 = overflow9.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DataStructures.Overflow" + "'", str31, "DataStructures.Overflow");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        underflow6.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray19 = underflow6.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        underflow6.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray25 = underflow6.getSuppressed();
        java.lang.Class<?> wildcardClass26 = throwableArray25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.String str28 = overflow23.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DataStructures.Overflow" + "'", str28, "DataStructures.Overflow");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj8);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (-7));
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray20 = overflow17.getSuppressed();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow21);
        underflow12.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray25 = overflow17.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray27 = overflow7.getSuppressed();
        java.lang.Class<?> wildcardClass28 = overflow7.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        underflow30.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) underflow37);
        underflow28.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        underflow43.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray49 = overflow46.getSuppressed();
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow50);
        underflow41.addSuppressed((java.lang.Throwable) overflow46);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        overflow58.addSuppressed((java.lang.Throwable) overflow59);
        underflow56.addSuppressed((java.lang.Throwable) overflow59);
        java.lang.Throwable[] throwableArray62 = overflow59.getSuppressed();
        DataStructures.Underflow underflow63 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray64 = underflow63.getSuppressed();
        overflow59.addSuppressed((java.lang.Throwable) underflow63);
        underflow54.addSuppressed((java.lang.Throwable) overflow59);
        overflow46.addSuppressed((java.lang.Throwable) underflow54);
        underflow28.addSuppressed((java.lang.Throwable) underflow54);
        overflow23.addSuppressed((java.lang.Throwable) underflow54);
        java.lang.String str70 = underflow54.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "DataStructures.Underflow" + "'", str70, "DataStructures.Underflow");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow6.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow6.addSuppressed((java.lang.Throwable) overflow12);
        overflow0.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.String str17 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DataStructures.Overflow" + "'", str17, "DataStructures.Overflow");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow14.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow14);
        java.lang.String str21 = overflow14.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DataStructures.Overflow" + "'", str21, "DataStructures.Overflow");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow2.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow26.getSuppressed();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        java.lang.Throwable[] throwableArray34 = overflow31.getSuppressed();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        underflow35.addSuppressed((java.lang.Throwable) overflow38);
        java.lang.Throwable[] throwableArray41 = overflow38.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) overflow38);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        overflow38.addSuppressed((java.lang.Throwable) overflow43);
        overflow26.addSuppressed((java.lang.Throwable) overflow43);
        underflow2.addSuppressed((java.lang.Throwable) overflow43);
        java.lang.String str49 = underflow2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "DataStructures.Underflow" + "'", str49, "DataStructures.Underflow");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        java.lang.Throwable[] throwableArray16 = underflow0.getSuppressed();
        java.lang.Class<?> wildcardClass17 = throwableArray16.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        overflow11.addSuppressed((java.lang.Throwable) overflow16);
        overflow0.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.String str21 = overflow16.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DataStructures.Overflow" + "'", str21, "DataStructures.Overflow");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.String str14 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DataStructures.Overflow" + "'", str14, "DataStructures.Overflow");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 10);
        java.lang.Object obj2 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow23.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        underflow43.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray49 = overflow46.getSuppressed();
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow50);
        overflow37.addSuppressed((java.lang.Throwable) underflow50);
        java.lang.Throwable[] throwableArray54 = overflow37.getSuppressed();
        java.lang.String str55 = overflow37.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "DataStructures.Overflow" + "'", str55, "DataStructures.Overflow");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(0);
        boolean boolean8 = stackAr7.isFull();
        java.lang.Object obj9 = stackAr7.top();
        stackAr7.makeEmpty();
        java.lang.Object obj11 = stackAr7.top();
        boolean boolean12 = stackAr7.isEmpty();
        java.lang.Object obj13 = stackAr7.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj13);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = underflow0.getSuppressed();
        java.lang.String str3 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DataStructures.Underflow" + "'", str3, "DataStructures.Underflow");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(0);
        boolean boolean11 = stackAr10.isFull();
        stackAr10.makeEmpty();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        stackAr10.makeEmpty();
        stackAr10.makeEmpty();
        java.lang.Object obj17 = stackAr10.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj17);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow14.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        overflow25.addSuppressed((java.lang.Throwable) overflow30);
        overflow21.addSuppressed((java.lang.Throwable) overflow30);
        overflow14.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.String str36 = overflow14.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DataStructures.Overflow" + "'", str36, "DataStructures.Overflow");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        underflow15.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow22);
        underflow13.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        underflow28.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray34 = overflow31.getSuppressed();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow35);
        underflow26.addSuppressed((java.lang.Throwable) overflow31);
        overflow18.addSuppressed((java.lang.Throwable) underflow26);
        underflow0.addSuppressed((java.lang.Throwable) underflow26);
        java.lang.Throwable[] throwableArray41 = underflow0.getSuppressed();
        java.lang.String str42 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "DataStructures.Underflow" + "'", str42, "DataStructures.Underflow");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr4.isEmpty();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(0);
        java.lang.Object obj11 = stackAr10.topAndPop();
        boolean boolean12 = stackAr10.isEmpty();
        boolean boolean13 = stackAr10.isEmpty();
        boolean boolean14 = stackAr10.isFull();
        java.lang.Object obj15 = stackAr10.topAndPop();
        boolean boolean16 = stackAr10.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr4.push((java.lang.Object) stackAr10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.String str22 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DataStructures.Overflow" + "'", str22, "DataStructures.Overflow");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow23.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        underflow43.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray49 = overflow46.getSuppressed();
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow50);
        overflow37.addSuppressed((java.lang.Throwable) underflow50);
        java.lang.Throwable[] throwableArray54 = overflow37.getSuppressed();
        java.lang.Class<?> wildcardClass55 = overflow37.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(1);
        java.lang.Object obj7 = stackAr6.top();
        boolean boolean8 = stackAr6.isFull();
        stackAr6.makeEmpty();
        java.lang.Object obj10 = stackAr6.top();
        java.lang.Object obj11 = stackAr6.topAndPop();
        boolean boolean12 = stackAr6.isEmpty();
        DataStructures.StackAr stackAr14 = new DataStructures.StackAr(100);
        stackAr14.push((java.lang.Object) 8L);
        stackAr6.push((java.lang.Object) stackAr14);
        java.lang.Object obj18 = stackAr14.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr14);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 8L + "'", obj18, 8L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        underflow15.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow22);
        underflow13.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        underflow28.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray34 = overflow31.getSuppressed();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow35);
        underflow26.addSuppressed((java.lang.Throwable) overflow31);
        overflow18.addSuppressed((java.lang.Throwable) underflow26);
        underflow0.addSuppressed((java.lang.Throwable) underflow26);
        java.lang.Throwable[] throwableArray41 = underflow0.getSuppressed();
        java.lang.Class<?> wildcardClass42 = throwableArray41.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray13 = underflow0.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow15.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow19.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        underflow23.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow0.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.String str36 = overflow26.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DataStructures.Overflow" + "'", str36, "DataStructures.Overflow");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Class<?> wildcardClass8 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow6.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow6.addSuppressed((java.lang.Throwable) overflow12);
        overflow0.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.String str17 = overflow12.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DataStructures.Overflow" + "'", str17, "DataStructures.Overflow");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj11);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray13 = underflow0.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow15.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray19 = overflow15.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow20.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray27 = overflow24.getSuppressed();
        java.lang.Throwable[] throwableArray28 = overflow24.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        overflow24.addSuppressed((java.lang.Throwable) overflow29);
        overflow20.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray37 = overflow34.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray41 = overflow38.getSuppressed();
        java.lang.Throwable[] throwableArray42 = overflow38.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        overflow38.addSuppressed((java.lang.Throwable) overflow43);
        overflow34.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        overflow48.addSuppressed((java.lang.Throwable) overflow49);
        overflow34.addSuppressed((java.lang.Throwable) overflow49);
        overflow20.addSuppressed((java.lang.Throwable) overflow34);
        overflow15.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.String str54 = overflow34.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "DataStructures.Overflow" + "'", str54, "DataStructures.Overflow");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow17);
        underflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow6.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        underflow8.addSuppressed((java.lang.Throwable) overflow22);
        underflow0.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        underflow37.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray43 = overflow40.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow40);
        underflow8.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray46 = overflow33.getSuppressed();
        java.lang.Class<?> wildcardClass47 = overflow33.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 7.1d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isEmpty();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        underflow16.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray22 = overflow19.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        overflow19.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray32 = overflow28.getSuppressed();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        underflow37.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray43 = overflow40.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        overflow40.addSuppressed((java.lang.Throwable) overflow45);
        overflow28.addSuppressed((java.lang.Throwable) overflow45);
        java.lang.Throwable[] throwableArray50 = overflow28.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow28.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) overflow28);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow24);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow23.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray46 = overflow43.getSuppressed();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        java.lang.Throwable[] throwableArray50 = overflow47.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow47.getSuppressed();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        overflow52.addSuppressed((java.lang.Throwable) overflow53);
        overflow47.addSuppressed((java.lang.Throwable) overflow52);
        overflow43.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        overflow57.addSuppressed((java.lang.Throwable) overflow58);
        java.lang.Throwable[] throwableArray60 = overflow57.getSuppressed();
        java.lang.Throwable[] throwableArray61 = overflow57.getSuppressed();
        java.lang.Throwable[] throwableArray62 = overflow57.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) overflow57);
        overflow23.addSuppressed((java.lang.Throwable) overflow57);
        java.lang.String str65 = overflow57.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "DataStructures.Overflow" + "'", str65, "DataStructures.Overflow");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        underflow24.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray30 = overflow27.getSuppressed();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow31);
        underflow22.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray35 = underflow22.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray39 = overflow37.getSuppressed();
        underflow22.addSuppressed((java.lang.Throwable) overflow37);
        overflow0.addSuppressed((java.lang.Throwable) underflow22);
        java.lang.String str42 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "DataStructures.Overflow" + "'", str42, "DataStructures.Overflow");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(1);
        stackAr8.makeEmpty();
        boolean boolean10 = stackAr8.isEmpty();
        java.lang.Object obj11 = stackAr8.top();
        boolean boolean12 = stackAr8.isEmpty();
        DataStructures.StackAr stackAr14 = new DataStructures.StackAr(0);
        java.lang.Object obj15 = stackAr14.topAndPop();
        java.lang.Object obj16 = stackAr14.top();
        stackAr14.makeEmpty();
        boolean boolean18 = stackAr14.isEmpty();
        boolean boolean19 = stackAr14.isEmpty();
        stackAr14.makeEmpty();
        stackAr8.push((java.lang.Object) stackAr14);
        boolean boolean22 = stackAr8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr8);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        overflow0.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray14 = underflow12.getSuppressed();
        java.lang.String str15 = underflow12.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DataStructures.Underflow" + "'", str15, "DataStructures.Underflow");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 100);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        underflow25.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        overflow28.addSuppressed((java.lang.Throwable) overflow33);
        overflow16.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray38 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray39 = overflow16.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.String str41 = overflow16.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "DataStructures.Overflow" + "'", str41, "DataStructures.Overflow");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(0);
        boolean boolean8 = stackAr7.isFull();
        stackAr7.makeEmpty();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.makeEmpty();
        stackAr7.makeEmpty();
        boolean boolean13 = stackAr7.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isFull();
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        underflow15.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        overflow18.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray30 = overflow28.getSuppressed();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        underflow31.addSuppressed((java.lang.Throwable) overflow34);
        overflow28.addSuppressed((java.lang.Throwable) overflow34);
        overflow18.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray42 = overflow39.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray46 = overflow43.getSuppressed();
        java.lang.Throwable[] throwableArray47 = overflow43.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        overflow48.addSuppressed((java.lang.Throwable) overflow49);
        overflow43.addSuppressed((java.lang.Throwable) overflow48);
        overflow39.addSuppressed((java.lang.Throwable) overflow48);
        overflow34.addSuppressed((java.lang.Throwable) overflow48);
        java.lang.Throwable[] throwableArray54 = overflow48.getSuppressed();
        java.lang.Throwable[] throwableArray55 = overflow48.getSuppressed();
        java.lang.Throwable[] throwableArray56 = overflow48.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) throwableArray56);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow19);
        underflow10.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray23 = underflow10.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray27 = overflow25.getSuppressed();
        underflow10.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable throwable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow5.addSuppressed(throwable31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        stackAr1.push((java.lang.Object) 1.0f);
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(0);
        stackAr5.makeEmpty();
        java.lang.Object obj7 = stackAr5.topAndPop();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isFull();
        java.lang.Object obj10 = stackAr5.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        underflow15.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow22);
        underflow13.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        underflow28.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray34 = overflow31.getSuppressed();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow35);
        underflow26.addSuppressed((java.lang.Throwable) overflow31);
        overflow18.addSuppressed((java.lang.Throwable) underflow26);
        underflow0.addSuppressed((java.lang.Throwable) underflow26);
        java.lang.Throwable[] throwableArray41 = underflow26.getSuppressed();
        java.lang.Class<?> wildcardClass42 = underflow26.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.StackAr stackAr11 = new DataStructures.StackAr(1);
        java.lang.Object obj12 = stackAr11.top();
        boolean boolean13 = stackAr11.isFull();
        java.lang.Object obj14 = stackAr11.top();
        java.lang.Object obj15 = stackAr11.top();
        DataStructures.StackAr stackAr17 = new DataStructures.StackAr(0);
        java.lang.Object obj18 = stackAr17.topAndPop();
        boolean boolean19 = stackAr17.isEmpty();
        boolean boolean20 = stackAr17.isEmpty();
        boolean boolean21 = stackAr17.isFull();
        boolean boolean22 = stackAr17.isEmpty();
        boolean boolean23 = stackAr17.isFull();
        boolean boolean24 = stackAr17.isFull();
        stackAr11.push((java.lang.Object) stackAr17);
        stackAr11.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr11);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow23.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray46 = overflow43.getSuppressed();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        java.lang.Throwable[] throwableArray50 = overflow47.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow47.getSuppressed();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        overflow52.addSuppressed((java.lang.Throwable) overflow53);
        overflow47.addSuppressed((java.lang.Throwable) overflow52);
        overflow43.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        overflow57.addSuppressed((java.lang.Throwable) overflow58);
        java.lang.Throwable[] throwableArray60 = overflow57.getSuppressed();
        java.lang.Throwable[] throwableArray61 = overflow57.getSuppressed();
        java.lang.Throwable[] throwableArray62 = overflow57.getSuppressed();
        overflow43.addSuppressed((java.lang.Throwable) overflow57);
        overflow23.addSuppressed((java.lang.Throwable) overflow57);
        java.lang.String str65 = overflow23.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "DataStructures.Overflow" + "'", str65, "DataStructures.Overflow");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow23.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.String str43 = overflow23.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "DataStructures.Overflow" + "'", str43, "DataStructures.Overflow");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        java.lang.Object obj2 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray13 = overflow5.getSuppressed();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        underflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow25);
        underflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow14.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray33 = overflow30.getSuppressed();
        java.lang.Throwable[] throwableArray34 = overflow30.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        overflow30.addSuppressed((java.lang.Throwable) overflow35);
        underflow16.addSuppressed((java.lang.Throwable) overflow30);
        overflow5.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.String str41 = overflow5.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "DataStructures.Overflow" + "'", str41, "DataStructures.Overflow");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(1);
        stackAr8.push((java.lang.Object) 1.0f);
        boolean boolean11 = stackAr8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray9 = overflow6.getSuppressed();
        java.lang.Throwable[] throwableArray10 = overflow6.getSuppressed();
        java.lang.Throwable[] throwableArray11 = overflow6.getSuppressed();
        java.lang.Throwable[] throwableArray12 = overflow6.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow6);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(7);
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr(0);
        java.lang.Object obj4 = stackAr3.topAndPop();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.top();
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        stackAr1.push(obj8);
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) underflow9);
        java.lang.Class<?> wildcardClass13 = underflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = underflow0.getSuppressed();
        java.lang.String str5 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DataStructures.Underflow" + "'", str5, "DataStructures.Underflow");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr((int) (short) 100);
        boolean boolean11 = stackAr10.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.String str3 = overflow1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DataStructures.Overflow" + "'", str3, "DataStructures.Overflow");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(9);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        java.lang.Throwable[] throwableArray11 = overflow7.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        overflow3.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        underflow21.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Throwable[] throwableArray27 = overflow24.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow28);
        underflow19.addSuppressed((java.lang.Throwable) overflow24);
        underflow17.addSuppressed((java.lang.Throwable) underflow19);
        overflow12.addSuppressed((java.lang.Throwable) underflow19);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        underflow19.addSuppressed((java.lang.Throwable) underflow34);
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        underflow34.addSuppressed((java.lang.Throwable) underflow36);
        stackAr1.push((java.lang.Object) underflow36);
        stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(1);
        java.lang.Object obj5 = stackAr4.top();
        boolean boolean6 = stackAr4.isFull();
        boolean boolean7 = stackAr4.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr4);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray20 = overflow17.getSuppressed();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow21);
        underflow12.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray25 = overflow17.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray27 = overflow17.getSuppressed();
        java.lang.Throwable[] throwableArray28 = overflow17.getSuppressed();
        java.lang.String str29 = overflow17.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DataStructures.Overflow" + "'", str29, "DataStructures.Overflow");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.top();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        underflow16.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray22 = overflow19.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        overflow19.addSuppressed((java.lang.Throwable) overflow24);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow19);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 1.2d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(0);
        boolean boolean8 = stackAr7.isFull();
        stackAr7.makeEmpty();
        boolean boolean10 = stackAr7.isFull();
        java.lang.Object obj11 = stackAr7.topAndPop();
        stackAr7.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        underflow24.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray30 = overflow27.getSuppressed();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow31);
        underflow22.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray35 = underflow22.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray39 = overflow37.getSuppressed();
        underflow22.addSuppressed((java.lang.Throwable) overflow37);
        overflow0.addSuppressed((java.lang.Throwable) underflow22);
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        underflow44.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray50 = overflow47.getSuppressed();
        java.lang.Throwable[] throwableArray51 = overflow47.getSuppressed();
        underflow42.addSuppressed((java.lang.Throwable) overflow47);
        overflow0.addSuppressed((java.lang.Throwable) underflow42);
        java.lang.Class<?> wildcardClass54 = underflow42.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray13 = underflow0.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow15.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray19 = underflow0.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        underflow28.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray34 = overflow31.getSuppressed();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow35);
        underflow26.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray39 = underflow26.getSuppressed();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray43 = overflow41.getSuppressed();
        underflow26.addSuppressed((java.lang.Throwable) overflow41);
        underflow20.addSuppressed((java.lang.Throwable) overflow41);
        underflow0.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.String str47 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "DataStructures.Underflow" + "'", str47, "DataStructures.Underflow");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr11 = new DataStructures.StackAr(0);
        java.lang.Object obj12 = stackAr11.top();
        boolean boolean13 = stackAr11.isFull();
        stackAr11.makeEmpty();
        java.lang.Object obj15 = stackAr11.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj15);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Class<?> wildcardClass11 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow17);
        underflow8.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        underflow23.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow30);
        underflow21.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        underflow36.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray42 = overflow39.getSuppressed();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow43);
        underflow34.addSuppressed((java.lang.Throwable) overflow39);
        overflow26.addSuppressed((java.lang.Throwable) underflow34);
        underflow8.addSuppressed((java.lang.Throwable) underflow34);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) underflow34);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.String str4 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DataStructures.Overflow" + "'", str4, "DataStructures.Overflow");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        java.lang.Object obj10 = stackAr4.top();
        java.lang.Class<?> wildcardClass11 = stackAr4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        stackAr1.push((java.lang.Object) 8L);
        stackAr1.push((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        overflow11.addSuppressed((java.lang.Throwable) overflow16);
        overflow0.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray21 = overflow0.getSuppressed();
        java.lang.String str22 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DataStructures.Overflow" + "'", str22, "DataStructures.Overflow");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(5);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow2.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.String str26 = overflow16.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DataStructures.Overflow" + "'", str26, "DataStructures.Overflow");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        underflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow25);
        underflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow14.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        underflow16.addSuppressed((java.lang.Throwable) underflow31);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow34.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        underflow41.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray47 = overflow44.getSuppressed();
        DataStructures.Underflow underflow48 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray49 = underflow48.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) underflow48);
        underflow39.addSuppressed((java.lang.Throwable) overflow44);
        underflow37.addSuppressed((java.lang.Throwable) underflow39);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        overflow53.addSuppressed((java.lang.Throwable) overflow54);
        java.lang.Throwable[] throwableArray56 = overflow53.getSuppressed();
        java.lang.Throwable[] throwableArray57 = overflow53.getSuppressed();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        overflow58.addSuppressed((java.lang.Throwable) overflow59);
        overflow53.addSuppressed((java.lang.Throwable) overflow58);
        underflow39.addSuppressed((java.lang.Throwable) overflow53);
        overflow34.addSuppressed((java.lang.Throwable) overflow53);
        underflow16.addSuppressed((java.lang.Throwable) overflow53);
        java.lang.Throwable[] throwableArray65 = underflow16.getSuppressed();
        java.lang.Class<?> wildcardClass66 = throwableArray65.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        underflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow25);
        underflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow14.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        underflow16.addSuppressed((java.lang.Throwable) underflow31);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow34.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        underflow41.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray47 = overflow44.getSuppressed();
        DataStructures.Underflow underflow48 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray49 = underflow48.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) underflow48);
        underflow39.addSuppressed((java.lang.Throwable) overflow44);
        underflow37.addSuppressed((java.lang.Throwable) underflow39);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        overflow53.addSuppressed((java.lang.Throwable) overflow54);
        java.lang.Throwable[] throwableArray56 = overflow53.getSuppressed();
        java.lang.Throwable[] throwableArray57 = overflow53.getSuppressed();
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        overflow58.addSuppressed((java.lang.Throwable) overflow59);
        overflow53.addSuppressed((java.lang.Throwable) overflow58);
        underflow39.addSuppressed((java.lang.Throwable) overflow53);
        overflow34.addSuppressed((java.lang.Throwable) overflow53);
        underflow16.addSuppressed((java.lang.Throwable) overflow53);
        java.lang.Throwable[] throwableArray65 = underflow16.getSuppressed();
        java.lang.String str66 = underflow16.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "DataStructures.Underflow" + "'", str66, "DataStructures.Underflow");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) underflow7);
        java.lang.Throwable[] throwableArray10 = underflow7.getSuppressed();
        java.lang.Throwable[] throwableArray11 = underflow7.getSuppressed();
        java.lang.String str12 = underflow7.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DataStructures.Underflow" + "'", str12, "DataStructures.Underflow");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isFull();
        java.lang.Object obj10 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        DataStructures.Underflow underflow3 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray4 = underflow3.getSuppressed();
        DataStructures.Underflow underflow5 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        underflow5.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable[] throwableArray11 = overflow8.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) underflow12);
        underflow3.addSuppressed((java.lang.Throwable) overflow8);
        underflow1.addSuppressed((java.lang.Throwable) underflow3);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray20 = overflow17.getSuppressed();
        java.lang.Throwable[] throwableArray21 = overflow17.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow22);
        underflow3.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray27 = underflow3.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow3);
        java.lang.String str29 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DataStructures.Overflow" + "'", str29, "DataStructures.Overflow");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(0);
        java.lang.Object obj8 = stackAr7.topAndPop();
        java.lang.Object obj9 = stackAr7.top();
        stackAr7.makeEmpty();
        boolean boolean11 = stackAr7.isEmpty();
        boolean boolean12 = stackAr7.isEmpty();
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        java.lang.Object obj15 = stackAr1.top();
        boolean boolean16 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr18 = new DataStructures.StackAr(0);
        java.lang.Object obj19 = stackAr18.topAndPop();
        java.lang.Object obj20 = stackAr18.top();
        stackAr18.makeEmpty();
        boolean boolean22 = stackAr18.isEmpty();
        boolean boolean23 = stackAr18.isEmpty();
        java.lang.Object obj24 = stackAr18.top();
        java.lang.Object obj25 = stackAr18.topAndPop();
        boolean boolean26 = stackAr18.isEmpty();
        boolean boolean27 = stackAr18.isFull();
        java.lang.Object obj28 = stackAr18.topAndPop();
        boolean boolean29 = stackAr18.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr18);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr(3);
        java.lang.Object obj9 = stackAr8.topAndPop();
        boolean boolean10 = stackAr8.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        underflow6.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray19 = underflow6.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        underflow6.addSuppressed((java.lang.Throwable) overflow21);
        underflow0.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Class<?> wildcardClass26 = overflow21.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass11 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow17);
        underflow8.addSuppressed((java.lang.Throwable) overflow13);
        underflow6.addSuppressed((java.lang.Throwable) underflow8);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow22.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        overflow22.addSuppressed((java.lang.Throwable) overflow27);
        underflow8.addSuppressed((java.lang.Throwable) overflow22);
        underflow0.addSuppressed((java.lang.Throwable) underflow8);
        java.lang.Class<?> wildcardClass33 = underflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow19);
        underflow10.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        underflow25.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow32);
        underflow23.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        underflow38.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray44 = overflow41.getSuppressed();
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray46 = underflow45.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow45);
        underflow36.addSuppressed((java.lang.Throwable) overflow41);
        overflow28.addSuppressed((java.lang.Throwable) underflow36);
        underflow10.addSuppressed((java.lang.Throwable) underflow36);
        java.lang.Throwable[] throwableArray51 = underflow36.getSuppressed();
        DataStructures.Underflow underflow52 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray53 = underflow52.getSuppressed();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        DataStructures.Overflow overflow56 = new DataStructures.Overflow();
        DataStructures.Overflow overflow57 = new DataStructures.Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow57);
        underflow54.addSuppressed((java.lang.Throwable) overflow57);
        java.lang.Throwable[] throwableArray60 = overflow57.getSuppressed();
        DataStructures.Underflow underflow61 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray62 = underflow61.getSuppressed();
        overflow57.addSuppressed((java.lang.Throwable) underflow61);
        underflow52.addSuppressed((java.lang.Throwable) overflow57);
        DataStructures.Underflow underflow65 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray66 = underflow65.getSuppressed();
        DataStructures.Underflow underflow67 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray68 = underflow67.getSuppressed();
        DataStructures.Overflow overflow69 = new DataStructures.Overflow();
        DataStructures.Overflow overflow70 = new DataStructures.Overflow();
        overflow69.addSuppressed((java.lang.Throwable) overflow70);
        underflow67.addSuppressed((java.lang.Throwable) overflow70);
        java.lang.Throwable[] throwableArray73 = overflow70.getSuppressed();
        DataStructures.Underflow underflow74 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray75 = underflow74.getSuppressed();
        overflow70.addSuppressed((java.lang.Throwable) underflow74);
        underflow65.addSuppressed((java.lang.Throwable) overflow70);
        DataStructures.Underflow underflow78 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray79 = underflow78.getSuppressed();
        DataStructures.Underflow underflow80 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray81 = underflow80.getSuppressed();
        DataStructures.Overflow overflow82 = new DataStructures.Overflow();
        DataStructures.Overflow overflow83 = new DataStructures.Overflow();
        overflow82.addSuppressed((java.lang.Throwable) overflow83);
        underflow80.addSuppressed((java.lang.Throwable) overflow83);
        java.lang.Throwable[] throwableArray86 = overflow83.getSuppressed();
        DataStructures.Underflow underflow87 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray88 = underflow87.getSuppressed();
        overflow83.addSuppressed((java.lang.Throwable) underflow87);
        underflow78.addSuppressed((java.lang.Throwable) overflow83);
        overflow70.addSuppressed((java.lang.Throwable) underflow78);
        underflow52.addSuppressed((java.lang.Throwable) underflow78);
        underflow36.addSuppressed((java.lang.Throwable) underflow52);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) underflow36);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass3 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(0);
        boolean boolean10 = stackAr9.isFull();
        java.lang.Object obj11 = stackAr9.top();
        stackAr9.makeEmpty();
        java.lang.Object obj13 = stackAr9.top();
        boolean boolean14 = stackAr9.isEmpty();
        boolean boolean15 = stackAr9.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow14.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        underflow23.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow30);
        underflow21.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        underflow36.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray42 = overflow39.getSuppressed();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow43);
        underflow34.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        DataStructures.Underflow underflow49 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray50 = underflow49.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        underflow49.addSuppressed((java.lang.Throwable) overflow52);
        java.lang.Throwable[] throwableArray55 = overflow52.getSuppressed();
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        overflow52.addSuppressed((java.lang.Throwable) underflow56);
        underflow47.addSuppressed((java.lang.Throwable) overflow52);
        overflow39.addSuppressed((java.lang.Throwable) underflow47);
        underflow21.addSuppressed((java.lang.Throwable) underflow47);
        java.lang.Throwable[] throwableArray62 = underflow21.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) underflow21);
        java.lang.Throwable[] throwableArray64 = underflow21.getSuppressed();
        java.lang.String str65 = underflow21.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "DataStructures.Underflow" + "'", str65, "DataStructures.Underflow");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = underflow0.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.String str13 = overflow5.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DataStructures.Overflow" + "'", str13, "DataStructures.Overflow");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray20 = overflow17.getSuppressed();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow21);
        underflow12.addSuppressed((java.lang.Throwable) overflow17);
        underflow10.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow26.getSuppressed();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow12.addSuppressed((java.lang.Throwable) overflow26);
        underflow4.addSuppressed((java.lang.Throwable) underflow12);
        java.lang.Throwable[] throwableArray37 = underflow4.getSuppressed();
        java.lang.Class<?> wildcardClass38 = underflow4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow14.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        overflow25.addSuppressed((java.lang.Throwable) overflow30);
        overflow21.addSuppressed((java.lang.Throwable) overflow30);
        overflow14.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.String str36 = overflow30.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DataStructures.Overflow" + "'", str36, "DataStructures.Overflow");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        java.lang.String str16 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DataStructures.Underflow" + "'", str16, "DataStructures.Underflow");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        underflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow25);
        underflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow14.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        underflow16.addSuppressed((java.lang.Throwable) underflow31);
        java.lang.Throwable throwable33 = null;
        // The following exception was thrown during execution in test generation
        try {
            underflow31.addSuppressed(throwable33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        java.lang.Object obj2 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow2.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        underflow30.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        overflow33.addSuppressed((java.lang.Throwable) overflow38);
        underflow2.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray43 = overflow33.getSuppressed();
        java.lang.String str44 = overflow33.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DataStructures.Overflow" + "'", str44, "DataStructures.Overflow");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        underflow26.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray32 = overflow29.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        underflow36.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray42 = overflow39.getSuppressed();
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        overflow39.addSuppressed((java.lang.Throwable) underflow43);
        underflow34.addSuppressed((java.lang.Throwable) overflow39);
        java.lang.Throwable[] throwableArray47 = overflow39.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) overflow39);
        overflow17.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray50 = overflow29.getSuppressed();
        java.lang.Class<?> wildcardClass51 = throwableArray50.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Class<?> wildcardClass8 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        underflow0.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) underflow7);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray13 = overflow10.getSuppressed();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray20 = overflow17.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        overflow10.addSuppressed((java.lang.Throwable) underflow22);
        overflow3.addSuppressed((java.lang.Throwable) underflow22);
        java.lang.Class<?> wildcardClass25 = overflow3.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(0);
        boolean boolean10 = stackAr9.isFull();
        stackAr9.makeEmpty();
        java.lang.Object obj12 = stackAr9.topAndPop();
        stackAr9.makeEmpty();
        boolean boolean14 = stackAr9.isFull();
        boolean boolean15 = stackAr9.isEmpty();
        java.lang.Object obj16 = stackAr9.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj16);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.String str1 = overflow0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DataStructures.Overflow" + "'", str1, "DataStructures.Overflow");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.String str10 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DataStructures.Overflow" + "'", str10, "DataStructures.Overflow");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray14 = overflow9.getSuppressed();
        java.lang.Class<?> wildcardClass15 = overflow9.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray13 = overflow10.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow14.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        overflow14.addSuppressed((java.lang.Throwable) overflow19);
        overflow10.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        overflow10.addSuppressed((java.lang.Throwable) overflow25);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.String str29 = overflow10.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DataStructures.Overflow" + "'", str29, "DataStructures.Overflow");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        underflow22.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = underflow29.getSuppressed();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow33.getSuppressed();
        underflow29.addSuppressed((java.lang.Throwable) overflow33);
        overflow17.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray40 = overflow17.getSuppressed();
        java.lang.String str41 = overflow17.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "DataStructures.Overflow" + "'", str41, "DataStructures.Overflow");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) underflow16);
        underflow7.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Underflow underflow30 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        underflow30.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        overflow33.addSuppressed((java.lang.Throwable) underflow37);
        underflow28.addSuppressed((java.lang.Throwable) overflow33);
        underflow26.addSuppressed((java.lang.Throwable) underflow28);
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        overflow42.addSuppressed((java.lang.Throwable) overflow43);
        java.lang.Throwable[] throwableArray45 = overflow42.getSuppressed();
        java.lang.Throwable[] throwableArray46 = overflow42.getSuppressed();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow48);
        overflow42.addSuppressed((java.lang.Throwable) overflow47);
        underflow28.addSuppressed((java.lang.Throwable) overflow42);
        underflow20.addSuppressed((java.lang.Throwable) underflow28);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        overflow53.addSuppressed((java.lang.Throwable) overflow54);
        java.lang.Throwable[] throwableArray56 = overflow53.getSuppressed();
        DataStructures.Underflow underflow57 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray58 = underflow57.getSuppressed();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        overflow59.addSuppressed((java.lang.Throwable) overflow60);
        underflow57.addSuppressed((java.lang.Throwable) overflow60);
        java.lang.Throwable[] throwableArray63 = overflow60.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) overflow60);
        underflow28.addSuppressed((java.lang.Throwable) overflow53);
        underflow7.addSuppressed((java.lang.Throwable) overflow53);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow53);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray63);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        DataStructures.StackAr stackAr11 = new DataStructures.StackAr(10);
        stackAr11.makeEmpty();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr11);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        boolean boolean8 = stackAr4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr4.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(0);
        java.lang.Object obj10 = stackAr9.topAndPop();
        boolean boolean11 = stackAr9.isEmpty();
        boolean boolean12 = stackAr9.isEmpty();
        boolean boolean13 = stackAr9.isFull();
        java.lang.Object obj14 = stackAr9.topAndPop();
        boolean boolean15 = stackAr9.isFull();
        java.lang.Object obj16 = stackAr9.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(1);
        java.lang.Object obj8 = stackAr7.top();
        boolean boolean9 = stackAr7.isFull();
        stackAr7.makeEmpty();
        java.lang.Object obj11 = stackAr7.top();
        java.lang.Object obj12 = stackAr7.topAndPop();
        DataStructures.StackAr stackAr14 = new DataStructures.StackAr(0);
        boolean boolean15 = stackAr14.isFull();
        stackAr14.makeEmpty();
        boolean boolean17 = stackAr14.isFull();
        java.lang.Object obj18 = stackAr14.top();
        boolean boolean19 = stackAr14.isEmpty();
        stackAr7.push((java.lang.Object) stackAr14);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        overflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow2.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray26 = underflow2.getSuppressed();
        java.lang.Throwable throwable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            underflow2.addSuppressed(throwable27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray13 = overflow5.getSuppressed();
        java.lang.String str14 = overflow5.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DataStructures.Overflow" + "'", str14, "DataStructures.Overflow");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Underflow underflow11 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) underflow11);
        underflow2.addSuppressed((java.lang.Throwable) overflow7);
        underflow0.addSuppressed((java.lang.Throwable) underflow2);
        java.lang.Throwable[] throwableArray16 = underflow2.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray20 = overflow17.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow21.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        overflow21.addSuppressed((java.lang.Throwable) overflow26);
        overflow17.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        underflow33.addSuppressed((java.lang.Throwable) overflow36);
        java.lang.Throwable[] throwableArray39 = overflow36.getSuppressed();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow40);
        underflow31.addSuppressed((java.lang.Throwable) underflow40);
        java.lang.Throwable[] throwableArray44 = underflow40.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) underflow40);
        underflow2.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.String str47 = underflow2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "DataStructures.Underflow" + "'", str47, "DataStructures.Underflow");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow23.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray44 = underflow43.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        underflow43.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray49 = overflow46.getSuppressed();
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) underflow50);
        overflow37.addSuppressed((java.lang.Throwable) underflow50);
        java.lang.String str54 = underflow50.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "DataStructures.Underflow" + "'", str54, "DataStructures.Underflow");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
        DataStructures.Underflow underflow18 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray19 = underflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        underflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) underflow25);
        underflow16.addSuppressed((java.lang.Throwable) overflow21);
        underflow14.addSuppressed((java.lang.Throwable) underflow16);
        overflow9.addSuppressed((java.lang.Throwable) underflow16);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        underflow16.addSuppressed((java.lang.Throwable) underflow31);
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        underflow31.addSuppressed((java.lang.Throwable) underflow33);
        java.lang.String str35 = underflow33.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "DataStructures.Underflow" + "'", str35, "DataStructures.Underflow");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow19);
        underflow10.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray23 = underflow10.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray27 = overflow25.getSuppressed();
        underflow10.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray33 = overflow30.getSuppressed();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray37 = overflow34.getSuppressed();
        java.lang.Throwable[] throwableArray38 = overflow34.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        overflow34.addSuppressed((java.lang.Throwable) overflow39);
        overflow30.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow44.addSuppressed((java.lang.Throwable) overflow45);
        java.lang.Throwable[] throwableArray47 = overflow44.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        overflow48.addSuppressed((java.lang.Throwable) overflow49);
        java.lang.Throwable[] throwableArray51 = overflow48.getSuppressed();
        java.lang.Throwable[] throwableArray52 = overflow48.getSuppressed();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        overflow53.addSuppressed((java.lang.Throwable) overflow54);
        overflow48.addSuppressed((java.lang.Throwable) overflow53);
        overflow44.addSuppressed((java.lang.Throwable) overflow53);
        DataStructures.Overflow overflow58 = new DataStructures.Overflow();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        overflow58.addSuppressed((java.lang.Throwable) overflow59);
        overflow44.addSuppressed((java.lang.Throwable) overflow59);
        overflow30.addSuppressed((java.lang.Throwable) overflow44);
        overflow25.addSuppressed((java.lang.Throwable) overflow44);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow44);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        java.lang.Throwable[] throwableArray11 = overflow7.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        overflow3.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        underflow21.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Throwable[] throwableArray27 = overflow24.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow28);
        underflow19.addSuppressed((java.lang.Throwable) overflow24);
        underflow17.addSuppressed((java.lang.Throwable) underflow19);
        overflow12.addSuppressed((java.lang.Throwable) underflow19);
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        underflow19.addSuppressed((java.lang.Throwable) underflow34);
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        underflow34.addSuppressed((java.lang.Throwable) underflow36);
        stackAr1.push((java.lang.Object) underflow36);
        java.lang.String str39 = underflow36.toString();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "DataStructures.Underflow" + "'", str39, "DataStructures.Underflow");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass8 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow19);
        underflow10.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        underflow25.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        overflow28.addSuppressed((java.lang.Throwable) underflow32);
        underflow23.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Underflow underflow36 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray37 = underflow36.getSuppressed();
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        underflow38.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray44 = overflow41.getSuppressed();
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray46 = underflow45.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) underflow45);
        underflow36.addSuppressed((java.lang.Throwable) overflow41);
        overflow28.addSuppressed((java.lang.Throwable) underflow36);
        underflow10.addSuppressed((java.lang.Throwable) underflow36);
        java.lang.Throwable[] throwableArray51 = underflow36.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) underflow36);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        underflow26.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray32 = overflow29.getSuppressed();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        overflow29.addSuppressed((java.lang.Throwable) underflow33);
        underflow24.addSuppressed((java.lang.Throwable) overflow29);
        underflow22.addSuppressed((java.lang.Throwable) underflow24);
        overflow17.addSuppressed((java.lang.Throwable) underflow24);
        java.lang.String str39 = underflow24.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "DataStructures.Underflow" + "'", str39, "DataStructures.Underflow");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.topAndPop();
        boolean boolean10 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(0);
        java.lang.Object obj6 = stackAr5.topAndPop();
        boolean boolean7 = stackAr5.isEmpty();
        boolean boolean8 = stackAr5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        underflow6.addSuppressed((java.lang.Throwable) overflow11);
        underflow4.addSuppressed((java.lang.Throwable) underflow6);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        overflow20.addSuppressed((java.lang.Throwable) overflow25);
        underflow6.addSuppressed((java.lang.Throwable) overflow20);
        overflow1.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.String str31 = overflow20.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DataStructures.Overflow" + "'", str31, "DataStructures.Overflow");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        underflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) underflow17);
        underflow8.addSuppressed((java.lang.Throwable) underflow17);
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        underflow21.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Underflow underflow27 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray28 = underflow27.getSuppressed();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        underflow31.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray37 = overflow34.getSuppressed();
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) underflow38);
        underflow29.addSuppressed((java.lang.Throwable) overflow34);
        underflow27.addSuppressed((java.lang.Throwable) underflow29);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray46 = overflow43.getSuppressed();
        java.lang.Throwable[] throwableArray47 = overflow43.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        overflow48.addSuppressed((java.lang.Throwable) overflow49);
        overflow43.addSuppressed((java.lang.Throwable) overflow48);
        underflow29.addSuppressed((java.lang.Throwable) overflow43);
        underflow21.addSuppressed((java.lang.Throwable) underflow29);
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        overflow54.addSuppressed((java.lang.Throwable) overflow55);
        java.lang.Throwable[] throwableArray57 = overflow54.getSuppressed();
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray59 = underflow58.getSuppressed();
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        overflow60.addSuppressed((java.lang.Throwable) overflow61);
        underflow58.addSuppressed((java.lang.Throwable) overflow61);
        java.lang.Throwable[] throwableArray64 = overflow61.getSuppressed();
        overflow54.addSuppressed((java.lang.Throwable) overflow61);
        underflow29.addSuppressed((java.lang.Throwable) overflow54);
        underflow8.addSuppressed((java.lang.Throwable) overflow54);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) underflow8);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) underflow19);
        underflow10.addSuppressed((java.lang.Throwable) overflow15);
        underflow8.addSuppressed((java.lang.Throwable) underflow10);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray27 = overflow24.getSuppressed();
        java.lang.Throwable[] throwableArray28 = overflow24.getSuppressed();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        overflow24.addSuppressed((java.lang.Throwable) overflow29);
        underflow10.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Throwable[] throwableArray34 = underflow10.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) underflow10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        java.lang.Object obj10 = stackAr4.top();
        stackAr4.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr4.push((java.lang.Object) 7.1d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow23.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Underflow underflow43 = new DataStructures.Underflow();
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        underflow43.addSuppressed((java.lang.Throwable) underflow44);
        java.lang.Throwable[] throwableArray47 = underflow43.getSuppressed();
        java.lang.Throwable[] throwableArray48 = underflow43.getSuppressed();
        overflow23.addSuppressed((java.lang.Throwable) underflow43);
        java.lang.Class<?> wildcardClass50 = overflow23.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow14);
        java.lang.Throwable[] throwableArray16 = overflow13.getSuppressed();
        java.lang.Throwable[] throwableArray17 = overflow13.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        underflow22.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        overflow25.addSuppressed((java.lang.Throwable) overflow30);
        overflow13.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow40);
        underflow37.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray43 = overflow40.getSuppressed();
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) underflow44);
        underflow35.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray48 = underflow35.getSuppressed();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        java.lang.Throwable[] throwableArray52 = overflow50.getSuppressed();
        underflow35.addSuppressed((java.lang.Throwable) overflow50);
        overflow13.addSuppressed((java.lang.Throwable) underflow35);
        overflow5.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Class<?> wildcardClass56 = overflow13.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.topAndPop();
        boolean boolean10 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean12 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass13 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(5);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = null;
        stackAr1.push(obj3);
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.StackAr stackAr11 = new DataStructures.StackAr(0);
        java.lang.Object obj12 = stackAr11.topAndPop();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isEmpty();
        stackAr11.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr11);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr11 = new DataStructures.StackAr(0);
        java.lang.Object obj12 = stackAr11.topAndPop();
        boolean boolean13 = stackAr11.isEmpty();
        boolean boolean14 = stackAr11.isEmpty();
        boolean boolean15 = stackAr11.isFull();
        boolean boolean16 = stackAr11.isEmpty();
        java.lang.Object obj17 = stackAr11.topAndPop();
        boolean boolean18 = stackAr11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        underflow22.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        DataStructures.Underflow underflow29 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        overflow25.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = underflow29.getSuppressed();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow33.getSuppressed();
        underflow29.addSuppressed((java.lang.Throwable) overflow33);
        overflow17.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray43 = overflow40.getSuppressed();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        overflow44.addSuppressed((java.lang.Throwable) overflow45);
        java.lang.Throwable[] throwableArray47 = overflow44.getSuppressed();
        java.lang.Throwable[] throwableArray48 = overflow44.getSuppressed();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        overflow44.addSuppressed((java.lang.Throwable) overflow49);
        overflow40.addSuppressed((java.lang.Throwable) overflow49);
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        DataStructures.Underflow underflow56 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray57 = underflow56.getSuppressed();
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray59 = underflow58.getSuppressed();
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        overflow60.addSuppressed((java.lang.Throwable) overflow61);
        underflow58.addSuppressed((java.lang.Throwable) overflow61);
        java.lang.Throwable[] throwableArray64 = overflow61.getSuppressed();
        DataStructures.Underflow underflow65 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray66 = underflow65.getSuppressed();
        overflow61.addSuppressed((java.lang.Throwable) underflow65);
        underflow56.addSuppressed((java.lang.Throwable) overflow61);
        underflow54.addSuppressed((java.lang.Throwable) underflow56);
        overflow49.addSuppressed((java.lang.Throwable) underflow56);
        java.lang.Throwable[] throwableArray71 = underflow56.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow56);
        java.lang.Throwable[] throwableArray73 = overflow17.getSuppressed();
        java.lang.String str74 = overflow17.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "DataStructures.Overflow" + "'", str74, "DataStructures.Overflow");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        overflow11.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        underflow24.addSuppressed((java.lang.Throwable) overflow27);
        overflow21.addSuppressed((java.lang.Throwable) overflow27);
        overflow11.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray39 = overflow36.getSuppressed();
        java.lang.Throwable[] throwableArray40 = overflow36.getSuppressed();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        overflow36.addSuppressed((java.lang.Throwable) overflow41);
        overflow32.addSuppressed((java.lang.Throwable) overflow41);
        overflow27.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        underflow47.addSuppressed((java.lang.Throwable) overflow50);
        java.lang.Throwable[] throwableArray53 = overflow50.getSuppressed();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow54);
        overflow41.addSuppressed((java.lang.Throwable) underflow54);
        overflow0.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Class<?> wildcardClass59 = overflow41.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(10);
        java.lang.Object obj11 = stackAr10.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj11);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        DataStructures.Underflow underflow1 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray2 = underflow1.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) underflow1);
        java.lang.Throwable[] throwableArray4 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray6 = underflow0.getSuppressed();
        java.lang.Class<?> wildcardClass7 = underflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        boolean boolean10 = stackAr1.isFull();
        boolean boolean11 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        underflow15.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow22);
        underflow13.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        underflow28.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray34 = overflow31.getSuppressed();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow35);
        underflow26.addSuppressed((java.lang.Throwable) overflow31);
        overflow18.addSuppressed((java.lang.Throwable) underflow26);
        underflow0.addSuppressed((java.lang.Throwable) underflow26);
        java.lang.Throwable[] throwableArray41 = underflow26.getSuppressed();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        underflow44.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray50 = overflow47.getSuppressed();
        DataStructures.Underflow underflow51 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray52 = underflow51.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) underflow51);
        underflow42.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Underflow underflow55 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray56 = underflow55.getSuppressed();
        DataStructures.Underflow underflow57 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray58 = underflow57.getSuppressed();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        overflow59.addSuppressed((java.lang.Throwable) overflow60);
        underflow57.addSuppressed((java.lang.Throwable) overflow60);
        java.lang.Throwable[] throwableArray63 = overflow60.getSuppressed();
        DataStructures.Underflow underflow64 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray65 = underflow64.getSuppressed();
        overflow60.addSuppressed((java.lang.Throwable) underflow64);
        underflow55.addSuppressed((java.lang.Throwable) overflow60);
        DataStructures.Underflow underflow68 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray69 = underflow68.getSuppressed();
        DataStructures.Underflow underflow70 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray71 = underflow70.getSuppressed();
        DataStructures.Overflow overflow72 = new DataStructures.Overflow();
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        overflow72.addSuppressed((java.lang.Throwable) overflow73);
        underflow70.addSuppressed((java.lang.Throwable) overflow73);
        java.lang.Throwable[] throwableArray76 = overflow73.getSuppressed();
        DataStructures.Underflow underflow77 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray78 = underflow77.getSuppressed();
        overflow73.addSuppressed((java.lang.Throwable) underflow77);
        underflow68.addSuppressed((java.lang.Throwable) overflow73);
        overflow60.addSuppressed((java.lang.Throwable) underflow68);
        underflow42.addSuppressed((java.lang.Throwable) underflow68);
        underflow26.addSuppressed((java.lang.Throwable) underflow42);
        java.lang.Throwable[] throwableArray84 = underflow42.getSuppressed();
        java.lang.Class<?> wildcardClass85 = underflow42.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(0);
        boolean boolean10 = stackAr9.isFull();
        stackAr9.makeEmpty();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.top();
        boolean boolean14 = stackAr9.isFull();
        stackAr9.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = underflow0.getSuppressed();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        DataStructures.Underflow underflow7 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        underflow7.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.Throwable[] throwableArray13 = overflow10.getSuppressed();
        overflow3.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        overflow3.addSuppressed((java.lang.Throwable) underflow15);
        java.lang.Throwable[] throwableArray17 = underflow15.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        underflow22.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        overflow25.addSuppressed((java.lang.Throwable) overflow30);
        underflow15.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray35 = underflow15.getSuppressed();
        java.lang.Throwable[] throwableArray36 = underflow15.getSuppressed();
        java.lang.Throwable[] throwableArray37 = underflow15.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        underflow15.addSuppressed((java.lang.Throwable) overflow38);
        underflow0.addSuppressed((java.lang.Throwable) underflow15);
        java.lang.String str43 = underflow15.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "DataStructures.Underflow" + "'", str43, "DataStructures.Underflow");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray11 = overflow8.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray27 = overflow25.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        underflow28.addSuppressed((java.lang.Throwable) overflow31);
        overflow25.addSuppressed((java.lang.Throwable) overflow31);
        overflow15.addSuppressed((java.lang.Throwable) overflow31);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray39 = overflow36.getSuppressed();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        java.lang.Throwable[] throwableArray43 = overflow40.getSuppressed();
        java.lang.Throwable[] throwableArray44 = overflow40.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        overflow40.addSuppressed((java.lang.Throwable) overflow45);
        overflow36.addSuppressed((java.lang.Throwable) overflow45);
        overflow31.addSuppressed((java.lang.Throwable) overflow45);
        DataStructures.Underflow underflow51 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray52 = underflow51.getSuppressed();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        overflow53.addSuppressed((java.lang.Throwable) overflow54);
        underflow51.addSuppressed((java.lang.Throwable) overflow54);
        java.lang.Throwable[] throwableArray57 = overflow54.getSuppressed();
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray59 = underflow58.getSuppressed();
        overflow54.addSuppressed((java.lang.Throwable) underflow58);
        overflow45.addSuppressed((java.lang.Throwable) underflow58);
        java.lang.Throwable[] throwableArray62 = overflow45.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow45);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        overflow11.addSuppressed((java.lang.Throwable) overflow16);
        overflow0.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray21 = overflow16.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        java.lang.Throwable[] throwableArray25 = overflow22.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow26.getSuppressed();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        overflow22.addSuppressed((java.lang.Throwable) overflow31);
        overflow16.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable throwable37 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow16.addSuppressed(throwable37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Class<?> wildcardClass16 = overflow12.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(0);
        java.lang.Object obj6 = stackAr5.topAndPop();
        java.lang.Object obj7 = stackAr5.top();
        stackAr5.makeEmpty();
        boolean boolean9 = stackAr5.isEmpty();
        boolean boolean10 = stackAr5.isEmpty();
        stackAr5.makeEmpty();
        java.lang.Object obj12 = stackAr5.top();
        java.lang.Class<?> wildcardClass13 = stackAr5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass10 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        underflow15.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow22);
        underflow13.addSuppressed((java.lang.Throwable) overflow18);
        overflow5.addSuppressed((java.lang.Throwable) underflow13);
        java.lang.String str27 = overflow5.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DataStructures.Overflow" + "'", str27, "DataStructures.Overflow");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 4.8d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        overflow3.addSuppressed((java.lang.Throwable) overflow4);
        java.lang.Throwable[] throwableArray6 = overflow3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = overflow3.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray11 = overflow8.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        underflow12.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        overflow8.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        overflow3.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray25 = overflow3.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow3.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray26);
        java.lang.Class<?> wildcardClass28 = throwableArray26.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray10 = overflow0.getSuppressed();
        java.lang.String str11 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DataStructures.Overflow" + "'", str11, "DataStructures.Overflow");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow15);
        underflow6.addSuppressed((java.lang.Throwable) overflow11);
        underflow4.addSuppressed((java.lang.Throwable) underflow6);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray24 = overflow20.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        overflow20.addSuppressed((java.lang.Throwable) overflow25);
        underflow6.addSuppressed((java.lang.Throwable) overflow20);
        overflow1.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        DataStructures.Underflow underflow33 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray34 = underflow33.getSuppressed();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        overflow35.addSuppressed((java.lang.Throwable) overflow36);
        underflow33.addSuppressed((java.lang.Throwable) overflow36);
        java.lang.Throwable[] throwableArray39 = overflow36.getSuppressed();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) underflow40);
        underflow31.addSuppressed((java.lang.Throwable) overflow36);
        java.lang.Throwable[] throwableArray44 = underflow31.getSuppressed();
        DataStructures.Overflow overflow45 = new DataStructures.Overflow();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray48 = overflow46.getSuppressed();
        underflow31.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray50 = underflow31.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) underflow31);
        java.lang.Class<?> wildcardClass52 = overflow20.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.Underflow underflow20 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        underflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow23);
        overflow7.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow23.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray43 = overflow37.getSuppressed();
        java.lang.Class<?> wildcardClass44 = throwableArray43.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(0);
        java.lang.Object obj8 = stackAr7.topAndPop();
        boolean boolean9 = stackAr7.isEmpty();
        boolean boolean10 = stackAr7.isEmpty();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isEmpty();
        boolean boolean13 = stackAr7.isFull();
        boolean boolean14 = stackAr7.isFull();
        stackAr1.push((java.lang.Object) stackAr7);
        java.lang.Class<?> wildcardClass16 = stackAr7.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow14.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow20.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        underflow23.addSuppressed((java.lang.Throwable) overflow26);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        overflow14.addSuppressed((java.lang.Throwable) overflow26);
        overflow9.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.String str32 = overflow9.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DataStructures.Overflow" + "'", str32, "DataStructures.Overflow");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.Underflow underflow10 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray11 = underflow10.getSuppressed();
        DataStructures.Underflow underflow12 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray20 = overflow17.getSuppressed();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) underflow21);
        underflow12.addSuppressed((java.lang.Throwable) overflow17);
        underflow10.addSuppressed((java.lang.Throwable) underflow12);
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow26.getSuppressed();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow12.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray39 = overflow36.getSuppressed();
        DataStructures.Underflow underflow40 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray41 = underflow40.getSuppressed();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        overflow42.addSuppressed((java.lang.Throwable) overflow43);
        underflow40.addSuppressed((java.lang.Throwable) overflow43);
        java.lang.Throwable[] throwableArray46 = overflow43.getSuppressed();
        overflow36.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        overflow48.addSuppressed((java.lang.Throwable) overflow49);
        overflow43.addSuppressed((java.lang.Throwable) overflow48);
        underflow12.addSuppressed((java.lang.Throwable) overflow43);
        java.lang.Throwable[] throwableArray53 = overflow43.getSuppressed();
        java.lang.Class<?> wildcardClass54 = overflow43.getClass();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) wildcardClass54);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        overflow12.addSuppressed((java.lang.Throwable) overflow17);
        overflow0.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        underflow24.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray30 = overflow27.getSuppressed();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) underflow31);
        underflow22.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray35 = underflow22.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray39 = overflow37.getSuppressed();
        underflow22.addSuppressed((java.lang.Throwable) overflow37);
        overflow0.addSuppressed((java.lang.Throwable) underflow22);
        java.lang.Class<?> wildcardClass42 = overflow0.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        boolean boolean11 = stackAr1.isFull();
        boolean boolean12 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow6.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        underflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow6.addSuppressed((java.lang.Throwable) overflow12);
        overflow0.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray17 = overflow0.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        underflow22.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        overflow25.addSuppressed((java.lang.Throwable) overflow30);
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        DataStructures.Overflow overflow35 = new DataStructures.Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow35);
        java.lang.Throwable[] throwableArray37 = overflow35.getSuppressed();
        DataStructures.Underflow underflow38 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray39 = underflow38.getSuppressed();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        overflow40.addSuppressed((java.lang.Throwable) overflow41);
        underflow38.addSuppressed((java.lang.Throwable) overflow41);
        overflow35.addSuppressed((java.lang.Throwable) overflow41);
        overflow25.addSuppressed((java.lang.Throwable) overflow41);
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray49 = overflow46.getSuppressed();
        DataStructures.Underflow underflow50 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray51 = underflow50.getSuppressed();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        overflow52.addSuppressed((java.lang.Throwable) overflow53);
        underflow50.addSuppressed((java.lang.Throwable) overflow53);
        java.lang.Throwable[] throwableArray56 = overflow53.getSuppressed();
        overflow46.addSuppressed((java.lang.Throwable) overflow53);
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray59 = underflow58.getSuppressed();
        DataStructures.Underflow underflow60 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray61 = underflow60.getSuppressed();
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        overflow62.addSuppressed((java.lang.Throwable) overflow63);
        underflow60.addSuppressed((java.lang.Throwable) overflow63);
        java.lang.Throwable[] throwableArray66 = overflow63.getSuppressed();
        DataStructures.Underflow underflow67 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray68 = underflow67.getSuppressed();
        overflow63.addSuppressed((java.lang.Throwable) underflow67);
        underflow58.addSuppressed((java.lang.Throwable) overflow63);
        java.lang.Throwable[] throwableArray71 = overflow63.getSuppressed();
        overflow53.addSuppressed((java.lang.Throwable) overflow63);
        java.lang.Throwable[] throwableArray73 = overflow53.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow53);
        overflow0.addSuppressed((java.lang.Throwable) overflow53);
        java.lang.String str76 = overflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "DataStructures.Overflow" + "'", str76, "DataStructures.Overflow");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        overflow5.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow15.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow20.getSuppressed();
        DataStructures.Underflow underflow24 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray25 = underflow24.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow27);
        underflow24.addSuppressed((java.lang.Throwable) overflow27);
        java.lang.Throwable[] throwableArray30 = overflow27.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) overflow27);
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        overflow27.addSuppressed((java.lang.Throwable) overflow32);
        overflow15.addSuppressed((java.lang.Throwable) overflow32);
        DataStructures.Underflow underflow37 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray38 = underflow37.getSuppressed();
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        DataStructures.Overflow overflow41 = new DataStructures.Overflow();
        DataStructures.Overflow overflow42 = new DataStructures.Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow42);
        underflow39.addSuppressed((java.lang.Throwable) overflow42);
        java.lang.Throwable[] throwableArray45 = overflow42.getSuppressed();
        DataStructures.Underflow underflow46 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray47 = underflow46.getSuppressed();
        overflow42.addSuppressed((java.lang.Throwable) underflow46);
        underflow37.addSuppressed((java.lang.Throwable) overflow42);
        java.lang.Throwable[] throwableArray50 = underflow37.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        DataStructures.Overflow overflow52 = new DataStructures.Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow52);
        java.lang.Throwable[] throwableArray54 = overflow52.getSuppressed();
        underflow37.addSuppressed((java.lang.Throwable) overflow52);
        overflow15.addSuppressed((java.lang.Throwable) underflow37);
        java.lang.Throwable[] throwableArray57 = overflow15.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) overflow15);
        stackAr1.push((java.lang.Object) overflow15);
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        overflow60.addSuppressed((java.lang.Throwable) overflow61);
        java.lang.Throwable[] throwableArray63 = overflow61.getSuppressed();
        overflow15.addSuppressed((java.lang.Throwable) overflow61);
        java.lang.Class<?> wildcardClass65 = overflow61.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        java.lang.Object obj11 = stackAr1.top();
        java.lang.Class<?> wildcardClass12 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.top();
        java.lang.Object obj12 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr14 = new DataStructures.StackAr(0);
        java.lang.Object obj15 = stackAr14.topAndPop();
        java.lang.Object obj16 = stackAr14.top();
        stackAr14.makeEmpty();
        boolean boolean18 = stackAr14.isEmpty();
        boolean boolean19 = stackAr14.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr14);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray10 = overflow0.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Throwable[] throwableArray18 = overflow15.getSuppressed();
        java.lang.Throwable[] throwableArray19 = overflow15.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        overflow15.addSuppressed((java.lang.Throwable) overflow20);
        overflow11.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray28 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray29 = overflow25.getSuppressed();
        java.lang.Throwable[] throwableArray30 = overflow25.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.Underflow underflow32 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray33 = underflow32.getSuppressed();
        DataStructures.Underflow underflow34 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray35 = underflow34.getSuppressed();
        DataStructures.Overflow overflow36 = new DataStructures.Overflow();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        overflow36.addSuppressed((java.lang.Throwable) overflow37);
        underflow34.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray40 = overflow37.getSuppressed();
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        overflow37.addSuppressed((java.lang.Throwable) underflow41);
        underflow32.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.Underflow underflow45 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray46 = underflow45.getSuppressed();
        DataStructures.Underflow underflow47 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray48 = underflow47.getSuppressed();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        DataStructures.Overflow overflow50 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow50);
        underflow47.addSuppressed((java.lang.Throwable) overflow50);
        java.lang.Throwable[] throwableArray53 = overflow50.getSuppressed();
        DataStructures.Underflow underflow54 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray55 = underflow54.getSuppressed();
        overflow50.addSuppressed((java.lang.Throwable) underflow54);
        underflow45.addSuppressed((java.lang.Throwable) overflow50);
        DataStructures.Underflow underflow58 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray59 = underflow58.getSuppressed();
        DataStructures.Underflow underflow60 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray61 = underflow60.getSuppressed();
        DataStructures.Overflow overflow62 = new DataStructures.Overflow();
        DataStructures.Overflow overflow63 = new DataStructures.Overflow();
        overflow62.addSuppressed((java.lang.Throwable) overflow63);
        underflow60.addSuppressed((java.lang.Throwable) overflow63);
        java.lang.Throwable[] throwableArray66 = overflow63.getSuppressed();
        DataStructures.Underflow underflow67 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray68 = underflow67.getSuppressed();
        overflow63.addSuppressed((java.lang.Throwable) underflow67);
        underflow58.addSuppressed((java.lang.Throwable) overflow63);
        overflow50.addSuppressed((java.lang.Throwable) underflow58);
        underflow32.addSuppressed((java.lang.Throwable) underflow58);
        java.lang.Throwable[] throwableArray73 = underflow32.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray75 = overflow11.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.String str77 = overflow11.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "DataStructures.Overflow" + "'", str77, "DataStructures.Overflow");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr(0);
        java.lang.Object obj8 = stackAr7.topAndPop();
        boolean boolean9 = stackAr7.isEmpty();
        boolean boolean10 = stackAr7.isEmpty();
        boolean boolean11 = stackAr7.isFull();
        boolean boolean12 = stackAr7.isEmpty();
        boolean boolean13 = stackAr7.isFull();
        boolean boolean14 = stackAr7.isFull();
        stackAr1.push((java.lang.Object) stackAr7);
        boolean boolean16 = stackAr1.isEmpty();
        DataStructures.Underflow underflow17 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray18 = underflow17.getSuppressed();
        DataStructures.Underflow underflow19 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        underflow21.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Throwable[] throwableArray27 = overflow24.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        overflow24.addSuppressed((java.lang.Throwable) underflow28);
        underflow19.addSuppressed((java.lang.Throwable) overflow24);
        underflow17.addSuppressed((java.lang.Throwable) underflow19);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow33.getSuppressed();
        java.lang.Throwable[] throwableArray37 = overflow33.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        DataStructures.Overflow overflow39 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow39);
        overflow33.addSuppressed((java.lang.Throwable) overflow38);
        underflow19.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray46 = overflow43.getSuppressed();
        java.lang.Throwable[] throwableArray47 = overflow43.getSuppressed();
        DataStructures.Overflow overflow48 = new DataStructures.Overflow();
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        overflow48.addSuppressed((java.lang.Throwable) overflow49);
        java.lang.Throwable[] throwableArray51 = overflow48.getSuppressed();
        DataStructures.Underflow underflow52 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray53 = underflow52.getSuppressed();
        DataStructures.Overflow overflow54 = new DataStructures.Overflow();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        overflow54.addSuppressed((java.lang.Throwable) overflow55);
        underflow52.addSuppressed((java.lang.Throwable) overflow55);
        java.lang.Throwable[] throwableArray58 = overflow55.getSuppressed();
        overflow48.addSuppressed((java.lang.Throwable) overflow55);
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        overflow60.addSuppressed((java.lang.Throwable) overflow61);
        overflow55.addSuppressed((java.lang.Throwable) overflow60);
        overflow43.addSuppressed((java.lang.Throwable) overflow60);
        underflow19.addSuppressed((java.lang.Throwable) overflow60);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow60);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        underflow6.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray12 = overflow9.getSuppressed();
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) underflow13);
        java.lang.Throwable[] throwableArray16 = underflow13.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray20 = overflow17.getSuppressed();
        java.lang.Throwable[] throwableArray21 = overflow17.getSuppressed();
        underflow13.addSuppressed((java.lang.Throwable) overflow17);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow17);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 100);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        java.lang.Object obj5 = stackAr4.topAndPop();
        java.lang.Object obj6 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        java.lang.Object obj10 = stackAr4.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr4.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow14.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow20.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        underflow23.addSuppressed((java.lang.Throwable) overflow26);
        overflow20.addSuppressed((java.lang.Throwable) overflow26);
        overflow14.addSuppressed((java.lang.Throwable) overflow26);
        overflow9.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.String str32 = overflow26.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DataStructures.Overflow" + "'", str32, "DataStructures.Overflow");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        java.lang.Throwable[] throwableArray9 = overflow5.getSuppressed();
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.String str11 = underflow0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DataStructures.Underflow" + "'", str11, "DataStructures.Underflow");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow4.getSuppressed();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow10);
        overflow4.addSuppressed((java.lang.Throwable) overflow9);
        overflow0.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        java.lang.Throwable[] throwableArray22 = overflow18.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        overflow18.addSuppressed((java.lang.Throwable) overflow23);
        overflow14.addSuppressed((java.lang.Throwable) overflow23);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        overflow14.addSuppressed((java.lang.Throwable) overflow29);
        overflow0.addSuppressed((java.lang.Throwable) overflow14);
        java.lang.Throwable throwable33 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow14.addSuppressed(throwable33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow8);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        java.lang.Throwable[] throwableArray15 = overflow11.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        overflow11.addSuppressed((java.lang.Throwable) overflow16);
        overflow7.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow21.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow21.getSuppressed();
        overflow7.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow32.getSuppressed();
        java.lang.Throwable[] throwableArray36 = overflow32.getSuppressed();
        DataStructures.Overflow overflow37 = new DataStructures.Overflow();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow38);
        overflow32.addSuppressed((java.lang.Throwable) overflow37);
        overflow28.addSuppressed((java.lang.Throwable) overflow37);
        overflow21.addSuppressed((java.lang.Throwable) overflow37);
        java.lang.Throwable[] throwableArray43 = overflow21.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) throwableArray43);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Underflow underflow2 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray3 = underflow2.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        underflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        DataStructures.Underflow underflow9 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        overflow5.addSuppressed((java.lang.Throwable) underflow9);
        underflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Underflow underflow13 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray14 = underflow13.getSuppressed();
        DataStructures.Underflow underflow15 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray16 = underflow15.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        underflow15.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray21 = overflow18.getSuppressed();
        DataStructures.Underflow underflow22 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray23 = underflow22.getSuppressed();
        overflow18.addSuppressed((java.lang.Throwable) underflow22);
        underflow13.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.Underflow underflow26 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray27 = underflow26.getSuppressed();
        DataStructures.Underflow underflow28 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray29 = underflow28.getSuppressed();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow31);
        underflow28.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray34 = overflow31.getSuppressed();
        DataStructures.Underflow underflow35 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray36 = underflow35.getSuppressed();
        overflow31.addSuppressed((java.lang.Throwable) underflow35);
        underflow26.addSuppressed((java.lang.Throwable) overflow31);
        overflow18.addSuppressed((java.lang.Throwable) underflow26);
        underflow0.addSuppressed((java.lang.Throwable) underflow26);
        java.lang.Throwable[] throwableArray41 = underflow26.getSuppressed();
        DataStructures.Underflow underflow42 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray43 = underflow42.getSuppressed();
        DataStructures.Underflow underflow44 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray45 = underflow44.getSuppressed();
        DataStructures.Overflow overflow46 = new DataStructures.Overflow();
        DataStructures.Overflow overflow47 = new DataStructures.Overflow();
        overflow46.addSuppressed((java.lang.Throwable) overflow47);
        underflow44.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray50 = overflow47.getSuppressed();
        DataStructures.Underflow underflow51 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray52 = underflow51.getSuppressed();
        overflow47.addSuppressed((java.lang.Throwable) underflow51);
        underflow42.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.Underflow underflow55 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray56 = underflow55.getSuppressed();
        DataStructures.Underflow underflow57 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray58 = underflow57.getSuppressed();
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        DataStructures.Overflow overflow60 = new DataStructures.Overflow();
        overflow59.addSuppressed((java.lang.Throwable) overflow60);
        underflow57.addSuppressed((java.lang.Throwable) overflow60);
        java.lang.Throwable[] throwableArray63 = overflow60.getSuppressed();
        DataStructures.Underflow underflow64 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray65 = underflow64.getSuppressed();
        overflow60.addSuppressed((java.lang.Throwable) underflow64);
        underflow55.addSuppressed((java.lang.Throwable) overflow60);
        DataStructures.Underflow underflow68 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray69 = underflow68.getSuppressed();
        DataStructures.Underflow underflow70 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray71 = underflow70.getSuppressed();
        DataStructures.Overflow overflow72 = new DataStructures.Overflow();
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        overflow72.addSuppressed((java.lang.Throwable) overflow73);
        underflow70.addSuppressed((java.lang.Throwable) overflow73);
        java.lang.Throwable[] throwableArray76 = overflow73.getSuppressed();
        DataStructures.Underflow underflow77 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray78 = underflow77.getSuppressed();
        overflow73.addSuppressed((java.lang.Throwable) underflow77);
        underflow68.addSuppressed((java.lang.Throwable) overflow73);
        overflow60.addSuppressed((java.lang.Throwable) underflow68);
        underflow42.addSuppressed((java.lang.Throwable) underflow68);
        underflow26.addSuppressed((java.lang.Throwable) underflow42);
        java.lang.String str84 = underflow42.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "DataStructures.Underflow" + "'", str84, "DataStructures.Underflow");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr(0);
        stackAr1.push((java.lang.Object) 0);
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.pop();
        java.lang.Object obj7 = stackAr1.top();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Underflow underflow4 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray5 = underflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        underflow4.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray10 = overflow7.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow7);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        DataStructures.Overflow overflow13 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow13);
        overflow7.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = overflow16.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow21.getSuppressed();
        DataStructures.Underflow underflow25 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray26 = underflow25.getSuppressed();
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        underflow25.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray31 = overflow28.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        overflow28.addSuppressed((java.lang.Throwable) overflow33);
        overflow16.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray38 = overflow16.getSuppressed();
        java.lang.Throwable[] throwableArray39 = overflow16.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow16);
        java.lang.Class<?> wildcardClass41 = overflow16.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr(0);
        java.lang.Object obj11 = stackAr10.topAndPop();
        boolean boolean12 = stackAr10.isEmpty();
        boolean boolean13 = stackAr10.isEmpty();
        stackAr10.makeEmpty();
        java.lang.Object obj15 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow1.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        java.lang.Throwable[] throwableArray9 = overflow5.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray13 = overflow10.getSuppressed();
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow17);
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray20 = overflow17.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow23);
        overflow17.addSuppressed((java.lang.Throwable) overflow22);
        overflow5.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow27 = new DataStructures.Overflow();
        DataStructures.Overflow overflow28 = new DataStructures.Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray30 = overflow27.getSuppressed();
        DataStructures.Underflow underflow31 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        DataStructures.Overflow overflow33 = new DataStructures.Overflow();
        DataStructures.Overflow overflow34 = new DataStructures.Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow34);
        underflow31.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray37 = overflow34.getSuppressed();
        overflow27.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.Underflow underflow39 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray40 = underflow39.getSuppressed();
        DataStructures.Underflow underflow41 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray42 = underflow41.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        DataStructures.Overflow overflow44 = new DataStructures.Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow44);
        underflow41.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray47 = overflow44.getSuppressed();
        DataStructures.Underflow underflow48 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray49 = underflow48.getSuppressed();
        overflow44.addSuppressed((java.lang.Throwable) underflow48);
        underflow39.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray52 = overflow44.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) overflow44);
        overflow22.addSuppressed((java.lang.Throwable) overflow34);
        overflow1.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.String str56 = overflow1.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "DataStructures.Overflow" + "'", str56, "DataStructures.Overflow");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        boolean boolean10 = stackAr1.isFull();
        java.lang.Object obj11 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isFull();
        boolean boolean10 = stackAr1.isFull();
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr(1);
        java.lang.Object obj13 = stackAr12.top();
        boolean boolean14 = stackAr12.isFull();
        stackAr12.makeEmpty();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.topAndPop();
        DataStructures.StackAr stackAr19 = new DataStructures.StackAr(0);
        boolean boolean20 = stackAr19.isFull();
        stackAr19.makeEmpty();
        boolean boolean22 = stackAr19.isFull();
        java.lang.Object obj23 = stackAr19.top();
        boolean boolean24 = stackAr19.isEmpty();
        stackAr12.push((java.lang.Object) stackAr19);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr12);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
        DataStructures.Underflow underflow8 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        underflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray14 = overflow11.getSuppressed();
        overflow4.addSuppressed((java.lang.Throwable) overflow11);
        DataStructures.Underflow underflow16 = new DataStructures.Underflow();
        overflow4.addSuppressed((java.lang.Throwable) underflow16);
        java.lang.Throwable[] throwableArray18 = underflow16.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow19.getSuppressed();
        DataStructures.Underflow underflow23 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray24 = underflow23.getSuppressed();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow26);
        underflow23.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray29 = overflow26.getSuppressed();
        overflow19.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow31 = new DataStructures.Overflow();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow32);
        overflow26.addSuppressed((java.lang.Throwable) overflow31);
        underflow16.addSuppressed((java.lang.Throwable) overflow26);
        overflow0.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray37 = overflow26.getSuppressed();
        java.lang.String str38 = overflow26.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "DataStructures.Overflow" + "'", str38, "DataStructures.Overflow");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        DataStructures.Overflow overflow7 = new DataStructures.Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow7);
        java.lang.Throwable[] throwableArray9 = overflow6.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray13 = overflow10.getSuppressed();
        java.lang.Throwable[] throwableArray14 = overflow10.getSuppressed();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow16);
        overflow10.addSuppressed((java.lang.Throwable) overflow15);
        overflow6.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow21);
        overflow6.addSuppressed((java.lang.Throwable) overflow21);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) overflow6);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        stackAr1.push((java.lang.Object) 1.0f);
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        DataStructures.Underflow underflow0 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray1 = underflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        DataStructures.Overflow overflow3 = new DataStructures.Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow3);
        java.lang.Throwable[] throwableArray5 = overflow2.getSuppressed();
        DataStructures.Underflow underflow6 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        DataStructures.Overflow overflow9 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow9);
        underflow6.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray12 = overflow9.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.Underflow underflow14 = new DataStructures.Underflow();
        overflow2.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.Throwable[] throwableArray16 = underflow14.getSuppressed();
        DataStructures.Overflow overflow17 = new DataStructures.Overflow();
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray20 = overflow17.getSuppressed();
        DataStructures.Underflow underflow21 = new DataStructures.Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        DataStructures.Overflow overflow23 = new DataStructures.Overflow();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        overflow23.addSuppressed((java.lang.Throwable) overflow24);
        underflow21.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Throwable[] throwableArray27 = overflow24.getSuppressed();
        overflow17.addSuppressed((java.lang.Throwable) overflow24);
        DataStructures.Overflow overflow29 = new DataStructures.Overflow();
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        overflow29.addSuppressed((java.lang.Throwable) overflow30);
        overflow24.addSuppressed((java.lang.Throwable) overflow29);
        underflow14.addSuppressed((java.lang.Throwable) overflow24);
        underflow0.addSuppressed((java.lang.Throwable) underflow14);
        java.lang.String str35 = underflow14.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "DataStructures.Underflow" + "'", str35, "DataStructures.Underflow");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr13 = new DataStructures.StackAr(1);
        java.lang.Object obj14 = stackAr13.top();
        boolean boolean15 = stackAr13.isFull();
        stackAr13.makeEmpty();
        java.lang.Object obj17 = stackAr13.top();
        java.lang.Object obj18 = stackAr13.topAndPop();
        DataStructures.StackAr stackAr20 = new DataStructures.StackAr(0);
        boolean boolean21 = stackAr20.isFull();
        stackAr20.makeEmpty();
        boolean boolean23 = stackAr20.isFull();
        java.lang.Object obj24 = stackAr20.top();
        boolean boolean25 = stackAr20.isEmpty();
        stackAr13.push((java.lang.Object) stackAr20);
        java.lang.Object obj27 = stackAr13.topAndPop();
        java.lang.Class<?> wildcardClass28 = stackAr13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr13);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        DataStructures.Overflow overflow1 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow1);
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        DataStructures.Overflow overflow5 = new DataStructures.Overflow();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow5.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        DataStructures.Overflow overflow11 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray13 = overflow10.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        DataStructures.Overflow overflow15 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow15);
        java.lang.Throwable[] throwableArray17 = overflow14.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow14.getSuppressed();
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow20);
        overflow14.addSuppressed((java.lang.Throwable) overflow19);
        overflow10.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        DataStructures.Overflow overflow25 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow25);
        overflow10.addSuppressed((java.lang.Throwable) overflow25);
        overflow0.addSuppressed((java.lang.Throwable) overflow10);
        java.lang.Class<?> wildcardClass29 = overflow10.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        boolean boolean8 = stackAr1.isFull();
        java.lang.Object obj9 = stackAr1.topAndPop();
        boolean boolean10 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }
}

