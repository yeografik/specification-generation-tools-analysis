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
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
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
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>> charSequenceRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>>((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass3 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass3 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>(8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>(4);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
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
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
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
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass3 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
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
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        examples.RingBuffer<java.lang.Class<?>> wildcardClassRingBuffer1 = new examples.RingBuffer<java.lang.Class<?>>(4);
        java.lang.Class<?> wildcardClass2 = wildcardClassRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
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
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>((int) 'a');
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
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
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
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
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>(1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>> charSequenceRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass3 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(4);
        java.lang.Class<?> wildcardClass2 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
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
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>(100);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
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
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
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
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.dataCount();
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
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        examples.RingBuffer<java.lang.reflect.GenericDeclaration> genericDeclarationRingBuffer1 = new examples.RingBuffer<java.lang.reflect.GenericDeclaration>(100);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.GenericDeclaration> genericDeclarationRingBuffer1 = new examples.RingBuffer<java.lang.reflect.GenericDeclaration>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        java.lang.Class<?> wildcardClass2 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
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
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.io.Serializable> serializableRingBuffer1 = new examples.RingBuffer<java.io.Serializable>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.remove();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        charSequenceRingBuffer1.remove();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        examples.RingBuffer<java.lang.reflect.AnnotatedElement> annotatedElementRingBuffer1 = new examples.RingBuffer<java.lang.reflect.AnnotatedElement>((int) (byte) 1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        java.lang.Class<?> wildcardClass16 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.AnnotatedElement> annotatedElementRingBuffer1 = new examples.RingBuffer<java.lang.reflect.AnnotatedElement>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = charSequenceRingBuffer1.item();
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
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(1);
        int int2 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        int int6 = charSequenceRingBuffer1.count();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(3);
        int int2 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
        int int8 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        examples.RingBuffer<java.lang.Class<?>> wildcardClassRingBuffer1 = new examples.RingBuffer<java.lang.Class<?>>((int) (short) 10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        int int2 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.AnnotatedElement> annotatedElementRingBuffer1 = new examples.RingBuffer<java.lang.reflect.AnnotatedElement>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
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
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>((int) '#');
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        boolean boolean13 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (byte) 1);
        int int2 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>((int) (short) 10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
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
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        boolean boolean14 = charSequenceRingBuffer1.isFull();
        int int15 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int4 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        int int9 = charSequenceRingBuffer1.capacity();
        int int10 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>(4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
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
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Class<?>> wildcardClassRingBuffer1 = new examples.RingBuffer<java.lang.Class<?>>((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(1);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
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
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        examples.RingBuffer<java.lang.reflect.GenericDeclaration> genericDeclarationRingBuffer1 = new examples.RingBuffer<java.lang.reflect.GenericDeclaration>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = genericDeclarationRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int8 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(1);
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.GenericDeclaration> genericDeclarationRingBuffer1 = new examples.RingBuffer<java.lang.reflect.GenericDeclaration>((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
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
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        int int9 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
            java.lang.Object obj10 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>(10);
        java.lang.Class<?> wildcardClass2 = strRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        java.lang.Class<?> wildcardClass16 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.capacity();
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
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>> charSequenceRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 100);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>(10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        java.lang.Class<?> wildcardClass17 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>> charSequenceRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>>((int) '#');
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
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
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>> charSequenceRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        int int14 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>((int) (byte) 100);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>(2);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(7);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>((int) '4');
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
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
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>> charSequenceRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>>(2);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(101);
        java.lang.Class<?> wildcardClass2 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((int) ' ');
        java.lang.Class<?> wildcardClass2 = strComparableRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj6 = charSequenceRingBuffer1.item();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        boolean boolean14 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        int int8 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        examples.RingBuffer<java.lang.Class<?>> wildcardClassRingBuffer1 = new examples.RingBuffer<java.lang.Class<?>>(3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        int int17 = charSequenceRingBuffer1.dataCount();
        boolean boolean18 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        examples.RingBuffer<java.lang.Class<?>> wildcardClassRingBuffer1 = new examples.RingBuffer<java.lang.Class<?>>((int) 'a');
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (byte) 1);
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        boolean boolean16 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass17 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        examples.RingBuffer<java.lang.reflect.AnnotatedElement> annotatedElementRingBuffer1 = new examples.RingBuffer<java.lang.reflect.AnnotatedElement>((int) (short) 100);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
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
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.count();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
        int int10 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        int int14 = charSequenceRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        java.lang.Class<?> wildcardClass14 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.lang.Class<?> wildcardClass18 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.lang.Class<?> wildcardClass20 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
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
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        java.lang.Class<?> wildcardClass18 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
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
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass12 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        charSequenceRingBuffer1.wipeOut();
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
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>((int) 'a');
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        int int10 = charSequenceRingBuffer1.count();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
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
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.capacity();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj10 = charSequenceRingBuffer1.item();
        int int11 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>(100);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 1);
        int int2 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass3 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        int int7 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        int int11 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int10 = charSequenceRingBuffer1.count();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        boolean boolean12 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        java.lang.Class<?> wildcardClass15 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        java.lang.Class<?> wildcardClass16 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        examples.RingBuffer<java.lang.reflect.AnnotatedElement> annotatedElementRingBuffer1 = new examples.RingBuffer<java.lang.reflect.AnnotatedElement>((int) (short) 1);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = charSequenceRingBuffer1.item();
        int int9 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.remove();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        int int8 = charSequenceRingBuffer1.capacity();
        int int9 = charSequenceRingBuffer1.dataCount();
        boolean boolean10 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = charSequenceRingBuffer1.item();
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        examples.RingBuffer<java.io.Serializable> serializableRingBuffer1 = new examples.RingBuffer<java.io.Serializable>(2);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (byte) 1);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.capacity();
        boolean boolean4 = charSequenceRingBuffer1.isFull();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.capacity();
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
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        boolean boolean15 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass16 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.lang.Class<?> wildcardClass16 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
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
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.lang.Class<?> wildcardClass17 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass6 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj9 = charSequenceRingBuffer1.item();
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean4 = charSequenceRingBuffer1.isEmpty();
        int int5 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        int int17 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.count();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.remove();
        int int10 = charSequenceRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        boolean boolean15 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        int int8 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass9 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass7 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        boolean boolean12 = charSequenceRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
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
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(10);
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(11);
        java.lang.Class<?> wildcardClass2 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass10 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>> charSequenceRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.CharSequence>>(4);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        int int17 = charSequenceRingBuffer1.dataCount();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.wipeOut();
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
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) ' ');
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
        boolean boolean9 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.capacity();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass8 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        boolean boolean8 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        charSequenceRingBuffer1.remove();
        boolean boolean11 = charSequenceRingBuffer1.isEmpty();
        int int12 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass13 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        charSequenceRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.count();
        int int8 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int10 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.capacity();
        int int7 = charSequenceRingBuffer1.dataCount();
        int int8 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.capacity();
        int int6 = charSequenceRingBuffer1.count();
        int int7 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = charSequenceRingBuffer1.item();
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
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        java.lang.Class<?> wildcardClass4 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.count();
        int int5 = charSequenceRingBuffer1.dataCount();
        int int6 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        int int9 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass11 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        charSequenceRingBuffer1.wipeOut();
        int int3 = charSequenceRingBuffer1.capacity();
        int int4 = charSequenceRingBuffer1.capacity();
        boolean boolean5 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        int int12 = charSequenceRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean7 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.dataCount();
        boolean boolean6 = charSequenceRingBuffer1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass5 = charSequenceRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.capacity();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.wipeOut();
        int int6 = charSequenceRingBuffer1.dataCount();
        int int7 = charSequenceRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.count();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
        int int9 = charSequenceRingBuffer1.count();
        int int10 = charSequenceRingBuffer1.count();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.lang.Class<?> wildcardClass20 = charSequenceRingBuffer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.reflect.AnnotatedElement> annotatedElementRingBuffer1 = new examples.RingBuffer<java.lang.reflect.AnnotatedElement>((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        int int2 = charSequenceRingBuffer1.dataCount();
        boolean boolean3 = charSequenceRingBuffer1.isEmpty();
        charSequenceRingBuffer1.wipeOut();
        boolean boolean5 = charSequenceRingBuffer1.isEmpty();
        int int6 = charSequenceRingBuffer1.count();
        boolean boolean7 = charSequenceRingBuffer1.isFull();
        boolean boolean8 = charSequenceRingBuffer1.isFull();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.count();
        int int3 = charSequenceRingBuffer1.count();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.capacity();
        boolean boolean6 = charSequenceRingBuffer1.isFull();
        int int7 = charSequenceRingBuffer1.capacity();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 10);
        int int2 = charSequenceRingBuffer1.capacity();
        int int3 = charSequenceRingBuffer1.dataCount();
        int int4 = charSequenceRingBuffer1.capacity();
        int int5 = charSequenceRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = charSequenceRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(8);
        boolean boolean2 = charSequenceRingBuffer1.isEmpty();
        boolean boolean3 = charSequenceRingBuffer1.isFull();
        int int4 = charSequenceRingBuffer1.dataCount();
        int int5 = charSequenceRingBuffer1.capacity();
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "hi!");
        charSequenceRingBuffer1.extend((java.lang.CharSequence) "");
        boolean boolean10 = charSequenceRingBuffer1.isEmpty();
        java.lang.Object obj11 = charSequenceRingBuffer1.item();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }
}

