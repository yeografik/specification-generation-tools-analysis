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
        java.lang.Object obj18 = charSequenceRingBuffer1.item();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(3);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.count();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.capacity();
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.capacity();
        int int12 = charSequenceRingBuffer1.count();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.count();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.dataCount();
        int int12 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(3);
        int int2 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.io.Serializable> serializableRingBuffer1 = new examples.RingBuffer<java.io.Serializable>((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        int int20 = charSequenceRingBuffer1.capacity();
        boolean boolean21 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = charSequenceRingBuffer1.item();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.count();
        int int12 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        int int15 = charSequenceRingBuffer1.count();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        int int17 = charSequenceRingBuffer1.dataCount();
        int int18 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        int int10 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int13 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        int int10 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.count();
        int int12 = charSequenceRingBuffer1.capacity();
        int int13 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        int int12 = charSequenceRingBuffer1.count();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(9);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int13 = charSequenceRingBuffer1.dataCount();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = obj14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.dataCount();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(1);
        int int2 = charSequenceRingBuffer1.count();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        int int12 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.capacity();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.count();
        int int12 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        int int15 = charSequenceRingBuffer1.dataCount();
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean19 = charSequenceRingBuffer1.isEmpty();
        boolean boolean20 = charSequenceRingBuffer1.isEmpty();
        boolean boolean21 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj24 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        int int6 = charSequenceRingBuffer1.count();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.capacity();
        int int11 = charSequenceRingBuffer1.dataCount();
        int int12 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj18 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass20 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int18 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>(102);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean19 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int12 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.dataCount();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int11 = charSequenceRingBuffer1.capacity();
        int int12 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        int int14 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        int int19 = charSequenceRingBuffer1.capacity();
        boolean boolean20 = charSequenceRingBuffer1.isEmpty();
        boolean boolean21 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.capacity();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.capacity();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        int int13 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        boolean boolean20 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
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
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        int int14 = charSequenceRingBuffer1.capacity();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        int int14 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.capacity();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        charSequenceRingBuffer1.remove();
        int int19 = charSequenceRingBuffer1.capacity();
        boolean boolean20 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int9 = charSequenceRingBuffer1.capacity();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj18 = charSequenceRingBuffer1.item();
        int int19 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.count();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        int int14 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.remove();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        int int16 = charSequenceRingBuffer1.dataCount();
        int int17 = charSequenceRingBuffer1.capacity();
        int int18 = charSequenceRingBuffer1.capacity();
        int int19 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        int int14 = charSequenceRingBuffer1.dataCount();
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        int int17 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        int int16 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>(7);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        int int20 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int13 = charSequenceRingBuffer1.count();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int12 = charSequenceRingBuffer1.dataCount();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        int int10 = charSequenceRingBuffer1.dataCount();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int14 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        int int14 = charSequenceRingBuffer1.capacity();
        int int15 = charSequenceRingBuffer1.dataCount();
        int int16 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj17 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int9 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        int int14 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj18 = charSequenceRingBuffer1.item();
        int int19 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.capacity();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        int int16 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.dataCount();
        java.lang.CharSequence charSequence10 = null;
        charSequenceRingBuffer1.extend(charSequence10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        charSequenceRingBuffer1.wipeOut();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        int int14 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.count();
        int int13 = charSequenceRingBuffer1.capacity();
        int int14 = charSequenceRingBuffer1.capacity();
        int int15 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.count();
        int int10 = charSequenceRingBuffer1.capacity();
        int int11 = charSequenceRingBuffer1.count();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.io.Serializable> serializableRingBuffer1 = new examples.RingBuffer<java.io.Serializable>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        charSequenceRingBuffer1.remove();
        int int17 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        boolean boolean21 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass22 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        int int12 = charSequenceRingBuffer1.dataCount();
        int int13 = charSequenceRingBuffer1.dataCount();
        int int14 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        int int15 = charSequenceRingBuffer1.capacity();
        int int16 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        int int11 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int4 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int15 = charSequenceRingBuffer1.count();
        int int16 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        int int13 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        int int14 = charSequenceRingBuffer1.capacity();
        int int15 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int18 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int11 = charSequenceRingBuffer1.capacity();
        int int12 = charSequenceRingBuffer1.capacity();
        int int13 = charSequenceRingBuffer1.dataCount();
        int int14 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int12 = charSequenceRingBuffer1.dataCount();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        int int14 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.capacity();
        int int11 = charSequenceRingBuffer1.dataCount();
        int int12 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        int int10 = charSequenceRingBuffer1.dataCount();
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        int int10 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        int int10 = charSequenceRingBuffer1.capacity();
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        charSequenceRingBuffer1.wipeOut();
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
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        int int12 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
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
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        int int10 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        int int14 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int18 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(3);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        int int16 = charSequenceRingBuffer1.count();
        boolean boolean17 = charSequenceRingBuffer1.isFull();
        boolean boolean18 = charSequenceRingBuffer1.isFull();
        boolean boolean19 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        boolean boolean18 = charSequenceRingBuffer1.isEmpty();
        int int19 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        int int22 = charSequenceRingBuffer1.count();
        int int23 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        int int13 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        boolean boolean2 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
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
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        int int14 = charSequenceRingBuffer1.capacity();
        int int15 = charSequenceRingBuffer1.count();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.count();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.dataCount();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        int int13 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj14 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
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
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.count();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int12 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        examples.RingBuffer<java.lang.Class<?>> wildcardClassRingBuffer1 = new examples.RingBuffer<java.lang.Class<?>>(1);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int14 = charSequenceRingBuffer1.dataCount();
        int int15 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.count();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        int int17 = charSequenceRingBuffer1.count();
        int int18 = charSequenceRingBuffer1.count();
        boolean boolean19 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int14 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        boolean boolean2 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
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
        int int12 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.capacity();
        int int11 = charSequenceRingBuffer1.count();
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        int int15 = charSequenceRingBuffer1.dataCount();
        boolean boolean16 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean19 = charSequenceRingBuffer1.isEmpty();
        boolean boolean20 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int23 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        int int10 = charSequenceRingBuffer1.count();
        int int11 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        int int19 = charSequenceRingBuffer1.dataCount();
        boolean boolean20 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int8 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(5);
        boolean boolean2 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        int int14 = charSequenceRingBuffer1.capacity();
        int int15 = charSequenceRingBuffer1.dataCount();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        int int15 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
        int int13 = charSequenceRingBuffer1.dataCount();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        int int15 = charSequenceRingBuffer1.dataCount();
        int int16 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int11 = charSequenceRingBuffer1.dataCount();
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        int int14 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        int int14 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        int int13 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        charSequenceRingBuffer1.wipeOut();
        int int15 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.count();
        int int9 = charSequenceRingBuffer1.dataCount();
        int int10 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        int int13 = charSequenceRingBuffer1.capacity();
        java.lang.CharSequence charSequence14 = null;
        charSequenceRingBuffer1.extend(charSequence14);
        charSequenceRingBuffer1.remove();
        int int17 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        charSequenceRingBuffer1.wipeOut();
        int int15 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
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
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
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
        charSequenceRingBuffer1.wipeOut();
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        int int15 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        int int11 = charSequenceRingBuffer1.dataCount();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = charSequenceRingBuffer1.item();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        int int12 = charSequenceRingBuffer1.count();
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int11 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int4 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int14 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.count();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.dataCount();
        int int14 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "" + "'", obj9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        int int11 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(10);
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
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        boolean boolean17 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj18 = charSequenceRingBuffer1.item();
        boolean boolean19 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
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
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
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
        int int20 = charSequenceRingBuffer1.count();
        int int21 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        java.lang.CharSequence charSequence8 = null;
        charSequenceRingBuffer1.extend(charSequence8);
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        java.lang.CharSequence charSequence11 = null;
        charSequenceRingBuffer1.extend(charSequence11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int12 = charSequenceRingBuffer1.capacity();
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        boolean boolean14 = charSequenceRingBuffer1.isEmpty();
        int int15 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        int int12 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
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
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        int int14 = charSequenceRingBuffer1.count();
        int int15 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.capacity();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj13 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        boolean boolean13 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int10 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        int int13 = charSequenceRingBuffer1.count();
        int int14 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        int int16 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int18 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        int int11 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        int int13 = charSequenceRingBuffer1.capacity();
        int int14 = charSequenceRingBuffer1.capacity();
        java.lang.Object obj15 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        examples.RingBuffer<java.lang.reflect.GenericDeclaration> genericDeclarationRingBuffer1 = new examples.RingBuffer<java.lang.reflect.GenericDeclaration>(6);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
            java.lang.Object obj15 = charSequenceRingBuffer1.item();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean15 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj16 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj18 = charSequenceRingBuffer1.item();
        int int19 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        java.lang.Object obj12 = charSequenceRingBuffer1.item();
        boolean boolean13 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
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
        charSequenceRingBuffer1.remove();
        int int15 = charSequenceRingBuffer1.capacity();
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        charSequenceRingBuffer1.wipeOut();
        int int13 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        int int16 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
    }
}

