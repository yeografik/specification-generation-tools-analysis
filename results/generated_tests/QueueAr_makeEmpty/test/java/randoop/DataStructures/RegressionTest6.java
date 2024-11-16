package DataStructures;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray1 = overflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow2);
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray7 = overflow6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = overflow6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = overflow6.getSuppressed();
        java.lang.Throwable[] throwableArray10 = overflow6.getSuppressed();
        java.lang.Throwable[] throwableArray11 = overflow6.getSuppressed();
        java.lang.Throwable[] throwableArray12 = overflow6.getSuppressed();
        java.lang.Throwable[] throwableArray13 = overflow6.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray15 = overflow14.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.Overflow overflow18 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray19 = overflow18.getSuppressed();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow20);
        overflow16.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray23 = overflow18.getSuppressed();
        overflow6.addSuppressed((java.lang.Throwable) overflow18);
        overflow0.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray26 = overflow18.getSuppressed();
        java.lang.Throwable[] throwableArray27 = overflow18.getSuppressed();
        java.lang.Class<?> wildcardClass28 = overflow18.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        boolean boolean5 = queueAr1.isEmpty();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.dequeue();
        java.lang.Object obj8 = queueAr1.dequeue();
        java.lang.Object obj9 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr((int) (byte) 1);
        java.lang.Object obj12 = queueAr11.getFront();
        queueAr1.enqueue((java.lang.Object) queueAr11);
        boolean boolean14 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        boolean boolean16 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr18 = new DataStructures.QueueAr((int) (byte) 1);
        queueAr18.dequeueAll();
        boolean boolean20 = queueAr18.isEmpty();
        queueAr18.dequeueAll();
        boolean boolean22 = queueAr18.isEmpty();
        java.lang.Object obj23 = queueAr18.getFront();
        java.lang.Object obj24 = queueAr18.dequeue();
        boolean boolean25 = queueAr18.isFull();
        java.lang.Object obj26 = queueAr18.getFront();
        java.lang.Object obj27 = queueAr18.dequeue();
        DataStructures.QueueAr queueAr29 = new DataStructures.QueueAr((int) (byte) 1);
        boolean boolean30 = queueAr29.isEmpty();
        java.lang.Object obj31 = queueAr29.getFront();
        boolean boolean32 = queueAr29.isFull();
        queueAr29.makeEmpty();
        java.lang.Object obj34 = queueAr29.dequeue();
        java.lang.Object obj35 = queueAr29.dequeue();
        java.lang.Object obj36 = queueAr29.dequeue();
        queueAr29.dequeueAll();
        queueAr18.enqueue((java.lang.Object) queueAr29);
        boolean boolean39 = queueAr18.isEmpty();
        boolean boolean40 = queueAr18.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr18);
        boolean boolean42 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        boolean boolean5 = queueAr1.isEmpty();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.dequeue();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.getFront();
        java.lang.Object obj10 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr12 = new DataStructures.QueueAr((int) (byte) 1);
        boolean boolean13 = queueAr12.isEmpty();
        java.lang.Object obj14 = queueAr12.getFront();
        boolean boolean15 = queueAr12.isFull();
        queueAr12.makeEmpty();
        java.lang.Object obj17 = queueAr12.dequeue();
        java.lang.Object obj18 = queueAr12.dequeue();
        java.lang.Object obj19 = queueAr12.dequeue();
        queueAr12.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr12);
        boolean boolean22 = queueAr1.isEmpty();
        boolean boolean23 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray1 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray4 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray5 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray6 = overflow0.getSuppressed();
        java.lang.Throwable[] throwableArray7 = overflow0.getSuppressed();
        DataStructures.Overflow overflow8 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray9 = overflow8.getSuppressed();
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow10);
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow14);
        overflow10.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray17 = overflow12.getSuppressed();
        overflow0.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        DataStructures.Overflow overflow20 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray21 = overflow20.getSuppressed();
        DataStructures.Overflow overflow22 = new DataStructures.Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray25 = overflow24.getSuppressed();
        DataStructures.Overflow overflow26 = new DataStructures.Overflow();
        overflow24.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray28 = overflow26.getSuppressed();
        overflow22.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.Overflow overflow30 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray31 = overflow30.getSuppressed();
        DataStructures.Overflow overflow32 = new DataStructures.Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow32);
        java.lang.Throwable[] throwableArray34 = overflow32.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow32);
        overflow19.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray37 = overflow26.getSuppressed();
        DataStructures.Overflow overflow38 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray39 = overflow38.getSuppressed();
        DataStructures.Overflow overflow40 = new DataStructures.Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray42 = overflow40.getSuppressed();
        DataStructures.Overflow overflow43 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray44 = overflow43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = overflow43.getSuppressed();
        overflow40.addSuppressed((java.lang.Throwable) overflow43);
        java.lang.Throwable[] throwableArray47 = overflow43.getSuppressed();
        overflow26.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Overflow overflow49 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray50 = overflow49.getSuppressed();
        DataStructures.Overflow overflow51 = new DataStructures.Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow51);
        DataStructures.Overflow overflow53 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray54 = overflow53.getSuppressed();
        DataStructures.Overflow overflow55 = new DataStructures.Overflow();
        overflow53.addSuppressed((java.lang.Throwable) overflow55);
        java.lang.Throwable[] throwableArray57 = overflow55.getSuppressed();
        overflow51.addSuppressed((java.lang.Throwable) overflow55);
        DataStructures.Overflow overflow59 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray60 = overflow59.getSuppressed();
        DataStructures.Overflow overflow61 = new DataStructures.Overflow();
        overflow59.addSuppressed((java.lang.Throwable) overflow61);
        java.lang.Throwable[] throwableArray63 = overflow61.getSuppressed();
        overflow55.addSuppressed((java.lang.Throwable) overflow61);
        overflow43.addSuppressed((java.lang.Throwable) overflow55);
        overflow12.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.Overflow overflow67 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray68 = overflow67.getSuppressed();
        DataStructures.Overflow overflow69 = new DataStructures.Overflow();
        overflow67.addSuppressed((java.lang.Throwable) overflow69);
        java.lang.Throwable[] throwableArray71 = overflow69.getSuppressed();
        java.lang.Throwable[] throwableArray72 = overflow69.getSuppressed();
        DataStructures.Overflow overflow73 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray74 = overflow73.getSuppressed();
        DataStructures.Overflow overflow75 = new DataStructures.Overflow();
        overflow73.addSuppressed((java.lang.Throwable) overflow75);
        DataStructures.Overflow overflow77 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray78 = overflow77.getSuppressed();
        DataStructures.Overflow overflow79 = new DataStructures.Overflow();
        overflow77.addSuppressed((java.lang.Throwable) overflow79);
        overflow75.addSuppressed((java.lang.Throwable) overflow77);
        overflow69.addSuppressed((java.lang.Throwable) overflow75);
        DataStructures.Overflow overflow83 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray84 = overflow83.getSuppressed();
        DataStructures.Overflow overflow85 = new DataStructures.Overflow();
        overflow83.addSuppressed((java.lang.Throwable) overflow85);
        overflow69.addSuppressed((java.lang.Throwable) overflow85);
        overflow43.addSuppressed((java.lang.Throwable) overflow85);
        java.lang.Throwable[] throwableArray89 = overflow43.getSuppressed();
        java.lang.Class<?> wildcardClass90 = throwableArray89.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.getFront();
        java.lang.Object obj4 = queueAr1.getFront();
        boolean boolean5 = queueAr1.isEmpty();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Object obj7 = queueAr1.dequeue();
        java.lang.Object obj8 = queueAr1.getFront();
        queueAr1.makeEmpty();
        java.lang.Object obj10 = queueAr1.dequeue();
        java.lang.Object obj11 = queueAr1.getFront();
        DataStructures.QueueAr queueAr13 = new DataStructures.QueueAr((int) (byte) 1);
        queueAr13.enqueue((java.lang.Object) (-2));
        boolean boolean16 = queueAr13.isFull();
        queueAr13.makeEmpty();
        boolean boolean18 = queueAr13.isEmpty();
        java.lang.Object obj19 = queueAr13.dequeue();
        DataStructures.QueueAr queueAr21 = new DataStructures.QueueAr((int) (byte) 1);
        queueAr21.dequeueAll();
        boolean boolean23 = queueAr21.isEmpty();
        queueAr21.dequeueAll();
        queueAr21.makeEmpty();
        boolean boolean26 = queueAr21.isFull();
        DataStructures.QueueAr queueAr28 = new DataStructures.QueueAr((int) (byte) 1);
        java.lang.Object obj29 = queueAr28.getFront();
        queueAr28.dequeueAll();
        java.lang.Object obj31 = queueAr28.dequeue();
        queueAr21.enqueue(obj31);
        queueAr21.makeEmpty();
        queueAr21.dequeueAll();
        queueAr13.enqueue((java.lang.Object) queueAr21);
        DataStructures.QueueAr queueAr37 = new DataStructures.QueueAr((int) (byte) 1);
        queueAr37.dequeueAll();
        boolean boolean39 = queueAr37.isEmpty();
        queueAr37.dequeueAll();
        boolean boolean41 = queueAr37.isEmpty();
        java.lang.Object obj42 = queueAr37.getFront();
        java.lang.Object obj43 = queueAr37.dequeue();
        queueAr37.makeEmpty();
        queueAr21.enqueue((java.lang.Object) queueAr37);
        queueAr1.enqueue((java.lang.Object) queueAr37);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        DataStructures.Overflow overflow0 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray1 = overflow0.getSuppressed();
        DataStructures.Overflow overflow2 = new DataStructures.Overflow();
        overflow0.addSuppressed((java.lang.Throwable) overflow2);
        DataStructures.Overflow overflow4 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        DataStructures.Overflow overflow6 = new DataStructures.Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow6);
        java.lang.Throwable[] throwableArray8 = overflow6.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) overflow6);
        DataStructures.Overflow overflow10 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray11 = overflow10.getSuppressed();
        DataStructures.Overflow overflow12 = new DataStructures.Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.Overflow overflow14 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray15 = overflow14.getSuppressed();
        DataStructures.Overflow overflow16 = new DataStructures.Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow16);
        overflow12.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.Overflow overflow19 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        DataStructures.Overflow overflow21 = new DataStructures.Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        DataStructures.Overflow overflow24 = new DataStructures.Overflow();
        java.lang.Throwable[] throwableArray25 = overflow24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow24.getSuppressed();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        java.lang.Throwable[] throwableArray28 = overflow24.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow24);
        overflow2.addSuppressed((java.lang.Throwable) overflow12);
        java.lang.Throwable[] throwableArray31 = overflow12.getSuppressed();
        java.lang.Throwable[] throwableArray32 = overflow12.getSuppressed();
        java.lang.Throwable[] throwableArray33 = overflow12.getSuppressed();
        java.lang.Throwable throwable34 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow12.addSuppressed(throwable34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.getFront();
        queueAr1.dequeueAll();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr((int) (byte) 1);
        queueAr8.dequeueAll();
        boolean boolean10 = queueAr8.isEmpty();
        queueAr8.dequeueAll();
        boolean boolean12 = queueAr8.isEmpty();
        java.lang.Object obj13 = queueAr8.getFront();
        java.lang.Object obj14 = queueAr8.dequeue();
        java.lang.Object obj15 = queueAr8.dequeue();
        java.lang.Object obj16 = queueAr8.dequeue();
        DataStructures.QueueAr queueAr18 = new DataStructures.QueueAr((int) (byte) 1);
        java.lang.Object obj19 = queueAr18.getFront();
        queueAr8.enqueue((java.lang.Object) queueAr18);
        queueAr1.enqueue((java.lang.Object) queueAr8);
        java.lang.Object obj22 = queueAr8.getFront();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }
}

