package examples;

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
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.capacity();
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int14 = charSequenceRingBuffer1.capacity();
        int int15 = charSequenceRingBuffer1.dataCount();
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        boolean boolean17 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass18 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int8 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.capacity();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        int int14 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(6);
        int int2 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int17 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        int int16 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        int int14 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj17 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(9);
        java.lang.Class<?> wildcardClass2 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        int int14 = charSequenceRingBuffer1.count();
        int int15 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int10 = charSequenceRingBuffer1.dataCount();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int12 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceRingBuffer1.isEmpty();
        int int19 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        int int17 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int20 = charSequenceRingBuffer1.capacity();
        boolean boolean21 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        boolean boolean23 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        int int16 = charSequenceRingBuffer1.capacity();
        int int17 = charSequenceRingBuffer1.dataCount();
        int int18 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        int int13 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int14 = charSequenceRingBuffer1.capacity();
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (byte) 10);
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.capacity();
        int int10 = charSequenceRingBuffer1.count();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.count();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        int int16 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int18 = charSequenceRingBuffer1.count();
        int int19 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass20 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.capacity();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        int int16 = charSequenceRingBuffer1.dataCount();
        boolean boolean17 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.count();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        int int10 = charSequenceRingBuffer1.count();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int16 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj17 = charSequenceRingBuffer1.item();
        int int18 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence19 = null;
        charSequenceRingBuffer1.extend(charSequence19);
        int int21 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int14 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        boolean boolean2 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(6);
        int int2 = charSequenceRingBuffer1.count();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.count();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 100);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.count();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 100);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        int int14 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int8 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int18 = charSequenceRingBuffer1.dataCount();
        int int19 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        boolean boolean21 = charSequenceRingBuffer1.isFull();
        boolean boolean22 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int15 = charSequenceRingBuffer1.count();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        boolean boolean17 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        int int11 = charSequenceRingBuffer1.count();
        int int12 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.count();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int17 = charSequenceRingBuffer1.count();
        int int18 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        int int12 = charSequenceRingBuffer1.count();
        int int13 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(6);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int12 = charSequenceRingBuffer1.capacity();
        int int13 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj19 = charSequenceRingBuffer1.item();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        boolean boolean17 = charSequenceRingBuffer1.isFull();
        int int18 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.capacity();
        int int10 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        int int17 = charSequenceRingBuffer1.capacity();
        int int18 = charSequenceRingBuffer1.capacity();
        int int19 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        int int14 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.count();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        int int15 = charSequenceRingBuffer1.capacity();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        int int17 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        int int14 = charSequenceRingBuffer1.capacity();
        int int15 = charSequenceRingBuffer1.capacity();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.dataCount();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        java.lang.Class<?> wildcardClass16 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.dataCount();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        int int13 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        int int13 = charSequenceRingBuffer1.count();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.count();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        int int17 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.count();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        int int15 = charSequenceRingBuffer1.count();
        int int16 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        charSequenceRingBuffer1.remove();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.dataCount();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        int int16 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int18 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.count();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.remove();
        int int12 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        examples.RingBuffer<java.lang.reflect.AnnotatedElement> annotatedElementRingBuffer1 = new examples.RingBuffer<java.lang.reflect.AnnotatedElement>(4);
        java.lang.Class<?> wildcardClass2 = annotatedElementRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        int int5 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.capacity();
        int int11 = charSequenceRingBuffer1.dataCount();
        int int12 = charSequenceRingBuffer1.count();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.capacity();
        int int14 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass17 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(9);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.count();
        int int14 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int12 = charSequenceRingBuffer1.count();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int14 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.dataCount();
        int int12 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        int int16 = charSequenceRingBuffer1.dataCount();
        boolean boolean17 = charSequenceRingBuffer1.isFull();
        boolean boolean18 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.count();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        int int15 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(6);
        int int2 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass3 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.count();
        int int12 = charSequenceRingBuffer1.count();
        int int13 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        int int15 = charSequenceRingBuffer1.capacity();
        int int16 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int11 = charSequenceRingBuffer1.capacity();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (byte) 10);
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        boolean boolean2 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int11 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        int int16 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(6);
        int int2 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.capacity();
        int int14 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        int int10 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.dataCount();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(1);
        int int2 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass3 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.count();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int16 = charSequenceRingBuffer1.capacity();
        boolean boolean17 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass18 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.dataCount();
        int int14 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.count();
        int int12 = charSequenceRingBuffer1.count();
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int12 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.count();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.count();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.capacity();
        int int14 = charSequenceRingBuffer1.dataCount();
        int int15 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass16 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int9 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        int int13 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        int int16 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        int int15 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass16 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int9 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        examples.RingBuffer<java.lang.reflect.GenericDeclaration> genericDeclarationRingBuffer1 = new examples.RingBuffer<java.lang.reflect.GenericDeclaration>((int) (short) 10);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceRingBuffer1.isEmpty();
        int int19 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int12 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        boolean boolean2 = charSequenceRingBuffer1.isFull();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        int int14 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.capacity();
        int int14 = charSequenceRingBuffer1.count();
        int int15 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int16 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.count();
        int int10 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        int int10 = charSequenceRingBuffer1.capacity();
        int int11 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>((int) (short) 10);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(6);
        boolean boolean2 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(6);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.io.Serializable> serializableRingBuffer1 = new examples.RingBuffer<java.io.Serializable>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        int int13 = charSequenceRingBuffer1.capacity();
        int int14 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int8 = charSequenceRingBuffer1.capacity();
        java.lang.CharSequence charSequence9 = null;
        charSequenceRingBuffer1.extend(charSequence9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.count();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int16 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass17 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.GenericDeclaration> genericDeclarationRingBuffer1 = new examples.RingBuffer<java.lang.reflect.GenericDeclaration>((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int14 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int8 = charSequenceRingBuffer1.count();
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        int int16 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        int int17 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int20 = charSequenceRingBuffer1.count();
        java.lang.Object obj21 = charSequenceRingBuffer1.item();
        int int22 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "hi!" + "'", obj21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int14 = charSequenceRingBuffer1.capacity();
        int int15 = charSequenceRingBuffer1.capacity();
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int17 = charSequenceRingBuffer1.dataCount();
        int int18 = charSequenceRingBuffer1.dataCount();
        int int19 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (byte) 10);
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 100);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.dataCount();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int9 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        int int13 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.capacity();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) '#');
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.dataCount();
        int int12 = charSequenceRingBuffer1.dataCount();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        int int14 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        examples.RingBuffer<java.io.Serializable> serializableRingBuffer1 = new examples.RingBuffer<java.io.Serializable>(8);
        java.lang.Class<?> wildcardClass2 = serializableRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.count();
        int int14 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.count();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        java.lang.CharSequence charSequence10 = null;
        charSequenceRingBuffer1.extend(charSequence10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        int int13 = charSequenceRingBuffer1.dataCount();
        int int14 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.count();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        int int15 = charSequenceRingBuffer1.capacity();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        int int17 = charSequenceRingBuffer1.dataCount();
        boolean boolean18 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int19 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int16 = charSequenceRingBuffer1.capacity();
        int int17 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence4 = null;
        charSequenceRingBuffer1.extend(charSequence4);
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int12 = charSequenceRingBuffer1.count();
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int16 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass17 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.capacity();
        int int14 = charSequenceRingBuffer1.dataCount();
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int18 = charSequenceRingBuffer1.dataCount();
        java.lang.Object obj19 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        int int21 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass22 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.count();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        int int16 = charSequenceRingBuffer1.dataCount();
        int int17 = charSequenceRingBuffer1.count();
        java.lang.Object obj18 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean20 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>(7);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        int int17 = charSequenceRingBuffer1.dataCount();
        int int18 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        int int16 = charSequenceRingBuffer1.dataCount();
        boolean boolean17 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass18 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int12 = charSequenceRingBuffer1.count();
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int15 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int17 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass18 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.count();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.dataCount();
        int int14 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        examples.RingBuffer<java.lang.reflect.AnnotatedElement> annotatedElementRingBuffer1 = new examples.RingBuffer<java.lang.reflect.AnnotatedElement>(5);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj17 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceRingBuffer1.isFull();
        int int21 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass22 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int12 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj17 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.capacity();
        int int10 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int9 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence10 = null;
        charSequenceRingBuffer1.extend(charSequence10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.count();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        int int14 = charSequenceRingBuffer1.capacity();
        int int15 = charSequenceRingBuffer1.count();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj17 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceRingBuffer1.isFull();
        boolean boolean21 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int12 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        int int10 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(100);
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (byte) 10);
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        int int10 = charSequenceRingBuffer1.capacity();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.capacity();
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.capacity();
        int int14 = charSequenceRingBuffer1.dataCount();
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        int int17 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        int int11 = charSequenceRingBuffer1.dataCount();
        int int12 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>> charSequenceRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>>((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        int int11 = charSequenceRingBuffer1.count();
        int int12 = charSequenceRingBuffer1.count();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.count();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        int int15 = charSequenceRingBuffer1.capacity();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        int int17 = charSequenceRingBuffer1.dataCount();
        int int18 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.dataCount();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(101);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        int int15 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>(6);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int16 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj17 = charSequenceRingBuffer1.item();
        int int18 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence19 = null;
        charSequenceRingBuffer1.extend(charSequence19);
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.count();
        int int14 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.count();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        int int15 = charSequenceRingBuffer1.capacity();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        int int17 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int7 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (byte) 10);
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        boolean boolean2 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        boolean boolean17 = charSequenceRingBuffer1.isFull();
        int int18 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        java.lang.Class<?> wildcardClass16 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        int int17 = charSequenceRingBuffer1.dataCount();
        boolean boolean18 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass19 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 10);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        java.lang.CharSequence charSequence7 = null;
        charSequenceRingBuffer1.extend(charSequence7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(5);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        int int5 = charSequenceRingBuffer1.count();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.capacity();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.capacity();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(9);
        int int2 = charSequenceRingBuffer1.count();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        int int17 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>(101);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        boolean boolean2 = charSequenceRingBuffer1.isFull();
        int int3 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(6);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean17 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        java.lang.CharSequence charSequence10 = null;
        charSequenceRingBuffer1.extend(charSequence10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(1);
        int int2 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.dataCount();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        int int8 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.count();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int18 = charSequenceRingBuffer1.dataCount();
        boolean boolean19 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass20 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(101);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        int int15 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        int int14 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj18 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.count();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.dataCount();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.remove();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>> charSequenceRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>>((int) 'a');
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int12 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj6 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int19 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        int int11 = charSequenceRingBuffer1.capacity();
        int int12 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int12 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int16 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        int int6 = charSequenceRingBuffer1.count();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.capacity();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 100);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        int int14 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj17 = charSequenceRingBuffer1.item();
        boolean boolean18 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceRingBuffer1.isEmpty();
        int int19 = charSequenceRingBuffer1.dataCount();
        boolean boolean20 = charSequenceRingBuffer1.isEmpty();
        int int21 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean23 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.dataCount();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj7 = charSequenceRingBuffer1.item();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.remove();
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        int int11 = charSequenceRingBuffer1.count();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        int int17 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int20 = charSequenceRingBuffer1.capacity();
        boolean boolean21 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int17 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.dataCount();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        int int17 = charSequenceRingBuffer1.count();
        int int18 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int20 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass21 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = strRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int15 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int20 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass21 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }
}

