package examples;

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
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-10));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        simpleMethods0.addElementToSet(intSet58, (int) (short) 1);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods64.addElementToSet(intSet84, 0);
        simpleMethods0.addElementToSet(intSet84, 0);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        simpleMethods14.addElementToSet(intSet28, 9);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods14.addElementToSet(intSet34, 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods38.addElementToSet(intSet52, 9);
        java.util.HashSet<java.lang.Integer> intSet56 = null;
        simpleMethods38.addElementToSet(intSet56, 2);
        examples.SimpleMethods simpleMethods59 = new examples.SimpleMethods();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet73 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        simpleMethods59.addElementToSet(intSet73, 9);
        simpleMethods38.addElementToSet(intSet73, 1);
        simpleMethods14.addElementToSet(intSet73, (-1));
        simpleMethods13.addElementToSet(intSet73, (-5));
        simpleMethods0.addElementToSet(intSet73, 0);
        java.lang.Class<?> wildcardClass85 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods20.addElementToSet(intSet21, 10);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet25 = null;
        simpleMethods24.addElementToSet(intSet25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods30.addElementToSet(intSet44, 9);
        java.util.HashSet<java.lang.Integer> intSet48 = null;
        simpleMethods30.addElementToSet(intSet48, 2);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        simpleMethods30.addElementToSet(intSet65, 100);
        simpleMethods29.addElementToSet(intSet65, (int) (byte) -1);
        simpleMethods28.addElementToSet(intSet65, 8);
        simpleMethods24.addElementToSet(intSet65, 8);
        simpleMethods20.addElementToSet(intSet65, (-100));
        simpleMethods0.addElementToSet(intSet65, (-2));
        java.util.HashSet<java.lang.Integer> intSet81 = null;
        simpleMethods0.addElementToSet(intSet81, (int) (byte) 100);
        java.util.HashSet<java.lang.Integer> intSet84 = null;
        simpleMethods0.addElementToSet(intSet84, 5);
        java.lang.Class<?> wildcardClass87 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, (-100));
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, (int) (byte) -1);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 5, (-4), 9, 3, 0, 6, (-1), (-3), (-5), 4, 8, (-8), (-8), 0, (-3) };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods0.addElementToSet(intSet60, 1);
        java.util.HashSet<java.lang.Integer> intSet64 = null;
        simpleMethods0.addElementToSet(intSet64, 9);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, 9);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 7);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1), (-6), 1, 0 };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods0.addElementToSet(intSet81, 10);
        java.lang.Class<?> wildcardClass85 = intSet81.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods0.addElementToSet(intSet21, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 6);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods50.addElementToSet(intSet64, 9);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods50.addElementToSet(intSet70, 0);
        examples.SimpleMethods simpleMethods74 = new examples.SimpleMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods74.addElementToSet(intSet88, 9);
        simpleMethods50.addElementToSet(intSet88, 0);
        simpleMethods0.addElementToSet(intSet88, 10);
        java.lang.Class<?> wildcardClass96 = intSet88.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-2));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods44.addElementToSet(intSet64, 0);
        simpleMethods0.addElementToSet(intSet64, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (int) (short) 1);
        java.lang.Class<?> wildcardClass76 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 7);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods21.addElementToSet(intSet41, 0);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        simpleMethods21.addElementToSet(intSet59, (-10));
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods65.addElementToSet(intSet85, 0);
        simpleMethods21.addElementToSet(intSet85, (-1));
        simpleMethods0.addElementToSet(intSet85, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 100);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, 8);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-10));
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, 9);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods47.addElementToSet(intSet61, 9);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods47.addElementToSet(intSet65, 2);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        simpleMethods47.addElementToSet(intSet82, (-100));
        simpleMethods0.addElementToSet(intSet82, (int) '4');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods18.addElementToSet(intSet38, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods42.addElementToSet(intSet83, (int) (short) 0);
        simpleMethods18.addElementToSet(intSet83, (-3));
        simpleMethods0.addElementToSet(intSet83, (-2));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, 1);
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods4.addElementToSet(intSet24, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods28.addElementToSet(intSet69, (int) (short) 0);
        simpleMethods4.addElementToSet(intSet69, (-3));
        simpleMethods0.addElementToSet(intSet69, (-5));
        java.util.HashSet<java.lang.Integer> intSet77 = null;
        simpleMethods0.addElementToSet(intSet77, (-3));
        java.lang.Class<?> wildcardClass80 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods2 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods2.addElementToSet(intSet16, 9);
        java.util.HashSet<java.lang.Integer> intSet20 = null;
        simpleMethods2.addElementToSet(intSet20, 2);
        examples.SimpleMethods simpleMethods23 = new examples.SimpleMethods();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        simpleMethods23.addElementToSet(intSet37, 9);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods41.addElementToSet(intSet82, (int) (short) 0);
        simpleMethods23.addElementToSet(intSet82, 1);
        simpleMethods2.addElementToSet(intSet82, 0);
        simpleMethods1.addElementToSet(intSet82, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet82, 0);
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, (int) (short) -1);
        java.lang.Class<?> wildcardClass97 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (-1));
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods21.addElementToSet(intSet22, 10);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet26 = null;
        simpleMethods25.addElementToSet(intSet26, 2);
        java.util.HashSet<java.lang.Integer> intSet29 = null;
        simpleMethods25.addElementToSet(intSet29, 4);
        java.util.HashSet<java.lang.Integer> intSet32 = null;
        simpleMethods25.addElementToSet(intSet32, 6);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods35.addElementToSet(intSet49, 9);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods35.addElementToSet(intSet55, 0);
        examples.SimpleMethods simpleMethods59 = new examples.SimpleMethods();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet73 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        simpleMethods59.addElementToSet(intSet73, 9);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods59.addElementToSet(intSet79, 0);
        simpleMethods35.addElementToSet(intSet79, 8);
        simpleMethods25.addElementToSet(intSet79, 9);
        simpleMethods21.addElementToSet(intSet79, (-8));
        simpleMethods0.addElementToSet(intSet79, (-1));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, 10);
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.util.HashSet<java.lang.Integer> intSet59 = null;
        simpleMethods41.addElementToSet(intSet59, 2);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods62.addElementToSet(intSet76, 9);
        simpleMethods41.addElementToSet(intSet76, (-100));
        simpleMethods0.addElementToSet(intSet76, 7);
        java.util.HashSet<java.lang.Integer> intSet84 = null;
        simpleMethods0.addElementToSet(intSet84, (int) '4');
        java.lang.Class<?> wildcardClass87 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.util.HashSet<java.lang.Integer> intSet43 = null;
        simpleMethods25.addElementToSet(intSet43, 2);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods46.addElementToSet(intSet60, 9);
        simpleMethods25.addElementToSet(intSet60, (-100));
        simpleMethods4.addElementToSet(intSet60, (-1));
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods4.addElementToSet(intSet68, (-1));
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods71.addElementToSet(intSet87, (int) (byte) 10);
        simpleMethods4.addElementToSet(intSet87, 4);
        simpleMethods0.addElementToSet(intSet87, (-5));
        java.util.HashSet<java.lang.Integer> intSet95 = null;
        simpleMethods0.addElementToSet(intSet95, (int) ' ');
        java.lang.Class<?> wildcardClass98 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, (-100));
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 1, 3, 100, (-9), 5, 5, (-7), (-1), 1, 100, 0, 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4 };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods4.addElementToSet(intSet68, 9);
        simpleMethods0.addElementToSet(intSet68, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet74 = null;
        simpleMethods0.addElementToSet(intSet74, 0);
        java.lang.Class<?> wildcardClass77 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 0);
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet9 = null;
        simpleMethods8.addElementToSet(intSet9, 10);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods12.addElementToSet(intSet26, 9);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods12.addElementToSet(intSet32, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        simpleMethods36.addElementToSet(intSet50, 9);
        simpleMethods12.addElementToSet(intSet50, (-2));
        examples.SimpleMethods simpleMethods56 = new examples.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods56.addElementToSet(intSet70, 9);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods56.addElementToSet(intSet76, 0);
        simpleMethods12.addElementToSet(intSet76, (int) (short) -1);
        simpleMethods8.addElementToSet(intSet76, (int) (byte) -1);
        simpleMethods4.addElementToSet(intSet76, 3);
        simpleMethods0.addElementToSet(intSet76, (int) (byte) 10);
        java.lang.Class<?> wildcardClass88 = intSet76.getClass();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 1);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods41.addElementToSet(intSet82, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet82, 1);
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, 6);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-5));
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods43.addElementToSet(intSet57, 9);
        java.util.HashSet<java.lang.Integer> intSet61 = null;
        simpleMethods43.addElementToSet(intSet61, 2);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        simpleMethods43.addElementToSet(intSet78, 100);
        simpleMethods42.addElementToSet(intSet78, (int) (byte) -1);
        simpleMethods24.addElementToSet(intSet78, (-8));
        simpleMethods0.addElementToSet(intSet78, 6);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, 7);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 10);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, 100);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet15 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        simpleMethods1.addElementToSet(intSet15, 9);
        java.util.HashSet<java.lang.Integer> intSet19 = null;
        simpleMethods1.addElementToSet(intSet19, 2);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        simpleMethods1.addElementToSet(intSet36, 100);
        simpleMethods0.addElementToSet(intSet36, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, (-3));
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet48 = null;
        simpleMethods47.addElementToSet(intSet48, 0);
        java.util.HashSet<java.lang.Integer> intSet51 = null;
        simpleMethods47.addElementToSet(intSet51, 10);
        java.util.HashSet<java.lang.Integer> intSet54 = null;
        simpleMethods47.addElementToSet(intSet54, (-4));
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods57.addElementToSet(intSet71, 9);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods57.addElementToSet(intSet77, 0);
        simpleMethods47.addElementToSet(intSet77, (-1));
        simpleMethods0.addElementToSet(intSet77, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, (int) (short) 100);
        java.lang.Class<?> wildcardClass88 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods13.addElementToSet(intSet27, 9);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods13.addElementToSet(intSet33, 0);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet51 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        simpleMethods37.addElementToSet(intSet51, 9);
        simpleMethods13.addElementToSet(intSet51, (-10));
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods57.addElementToSet(intSet71, 9);
        simpleMethods13.addElementToSet(intSet71, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet71, (-1));
        java.lang.Class<?> wildcardClass79 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, 1);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods13.addElementToSet(intSet27, 9);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods31.addElementToSet(intSet45, 9);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods31.addElementToSet(intSet72, (int) (short) 0);
        simpleMethods13.addElementToSet(intSet72, 1);
        simpleMethods0.addElementToSet(intSet72, 10);
        java.util.HashSet<java.lang.Integer> intSet80 = null;
        simpleMethods0.addElementToSet(intSet80, 1);
        java.util.HashSet<java.lang.Integer> intSet83 = null;
        simpleMethods0.addElementToSet(intSet83, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (int) (byte) 10);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods21.addElementToSet(intSet41, 0);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        simpleMethods21.addElementToSet(intSet59, (-2));
        simpleMethods0.addElementToSet(intSet59, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, 0);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, 1);
        java.lang.Class<?> wildcardClass73 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, (int) (byte) 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods13.addElementToSet(intSet27, 9);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods13.addElementToSet(intSet33, 0);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet51 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        simpleMethods37.addElementToSet(intSet51, 9);
        simpleMethods13.addElementToSet(intSet51, 0);
        java.util.HashSet<java.lang.Integer> intSet57 = null;
        simpleMethods13.addElementToSet(intSet57, (-10));
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods60.addElementToSet(intSet76, (int) (byte) 10);
        simpleMethods13.addElementToSet(intSet76, (int) ' ');
        simpleMethods0.addElementToSet(intSet76, 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods41.addElementToSet(intSet61, 0);
        simpleMethods0.addElementToSet(intSet61, 8);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (-7));
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-10));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 9);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, (-9));
        java.lang.Class<?> wildcardClass79 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet21 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        simpleMethods7.addElementToSet(intSet21, 9);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods7.addElementToSet(intSet27, 0);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods31.addElementToSet(intSet45, 9);
        simpleMethods7.addElementToSet(intSet45, (-2));
        simpleMethods0.addElementToSet(intSet45, (-9));
        examples.SimpleMethods simpleMethods53 = new examples.SimpleMethods();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods53.addElementToSet(intSet67, 9);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet73 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        simpleMethods53.addElementToSet(intSet73, 0);
        simpleMethods0.addElementToSet(intSet73, (int) (byte) -1);
        java.lang.Class<?> wildcardClass79 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods18.addElementToSet(intSet38, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods42.addElementToSet(intSet62, 0);
        simpleMethods18.addElementToSet(intSet62, 8);
        simpleMethods0.addElementToSet(intSet62, 7);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-8));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 100);
        examples.SimpleMethods simpleMethods76 = new examples.SimpleMethods();
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet92 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        simpleMethods76.addElementToSet(intSet92, (int) (byte) 10);
        simpleMethods0.addElementToSet(intSet92, (-9));
        java.lang.Class<?> wildcardClass98 = intSet92.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods13.addElementToSet(intSet27, 9);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods13.addElementToSet(intSet33, 0);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet51 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        simpleMethods37.addElementToSet(intSet51, 9);
        simpleMethods13.addElementToSet(intSet51, (-10));
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods57.addElementToSet(intSet71, 9);
        simpleMethods13.addElementToSet(intSet71, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet71, (-1));
        java.lang.Class<?> wildcardClass79 = intSet71.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet42 = null;
        simpleMethods41.addElementToSet(intSet42, 0);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet46 = null;
        simpleMethods45.addElementToSet(intSet46, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods49.addElementToSet(intSet69, 0);
        examples.SimpleMethods simpleMethods73 = new examples.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods73.addElementToSet(intSet87, 9);
        simpleMethods49.addElementToSet(intSet87, (-10));
        simpleMethods45.addElementToSet(intSet87, (int) (short) 10);
        simpleMethods41.addElementToSet(intSet87, (int) ' ');
        simpleMethods0.addElementToSet(intSet87, 3);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods27.addElementToSet(intSet41, 9);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        simpleMethods27.addElementToSet(intSet47, 0);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        simpleMethods27.addElementToSet(intSet65, (-2));
        simpleMethods0.addElementToSet(intSet65, 3);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 3);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, (int) 'a');
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, (-4));
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, (-7));
        java.lang.Class<?> wildcardClass88 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 10);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, (-7));
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods47.addElementToSet(intSet61, 9);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods47.addElementToSet(intSet67, 0);
        simpleMethods0.addElementToSet(intSet67, 1);
        java.lang.Class<?> wildcardClass73 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, (int) (short) 0);
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet22 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        simpleMethods8.addElementToSet(intSet22, 9);
        java.util.HashSet<java.lang.Integer> intSet26 = null;
        simpleMethods8.addElementToSet(intSet26, 2);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet30 = null;
        simpleMethods29.addElementToSet(intSet30, 0);
        examples.SimpleMethods simpleMethods33 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods35.addElementToSet(intSet49, 9);
        java.util.HashSet<java.lang.Integer> intSet53 = null;
        simpleMethods35.addElementToSet(intSet53, 2);
        examples.SimpleMethods simpleMethods56 = new examples.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods56.addElementToSet(intSet70, 9);
        simpleMethods35.addElementToSet(intSet70, 100);
        simpleMethods34.addElementToSet(intSet70, (int) (byte) -1);
        simpleMethods33.addElementToSet(intSet70, 8);
        simpleMethods29.addElementToSet(intSet70, 8);
        simpleMethods8.addElementToSet(intSet70, 1);
        simpleMethods4.addElementToSet(intSet70, (-10));
        simpleMethods0.addElementToSet(intSet70, 100);
        java.lang.Class<?> wildcardClass88 = intSet70.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (int) (byte) 10);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        examples.SimpleMethods simpleMethods39 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods40 = new examples.SimpleMethods();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods40.addElementToSet(intSet54, 9);
        java.util.HashSet<java.lang.Integer> intSet58 = null;
        simpleMethods40.addElementToSet(intSet58, 2);
        examples.SimpleMethods simpleMethods61 = new examples.SimpleMethods();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet75 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        simpleMethods61.addElementToSet(intSet75, 9);
        simpleMethods40.addElementToSet(intSet75, 100);
        simpleMethods39.addElementToSet(intSet75, (int) (byte) -1);
        simpleMethods21.addElementToSet(intSet75, (-8));
        simpleMethods0.addElementToSet(intSet75, (-4));
        java.util.HashSet<java.lang.Integer> intSet87 = null;
        simpleMethods0.addElementToSet(intSet87, (-7));
        java.lang.Class<?> wildcardClass90 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 8);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (-2));
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 0, 100, (-3), (-6), 8, 0, (-8), (-1), 7, 3, 8, (-100), 2, 10, 7 };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods0.addElementToSet(intSet69, 1);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 0);
        java.lang.Class<?> wildcardClass76 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, (-4));
        examples.SimpleMethods simpleMethods10 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet11 = null;
        simpleMethods10.addElementToSet(intSet11, 0);
        java.util.HashSet<java.lang.Integer> intSet14 = null;
        simpleMethods10.addElementToSet(intSet14, 10);
        java.util.HashSet<java.lang.Integer> intSet17 = null;
        simpleMethods10.addElementToSet(intSet17, (-4));
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods20.addElementToSet(intSet36, (int) (byte) 10);
        examples.SimpleMethods simpleMethods40 = new examples.SimpleMethods();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods40.addElementToSet(intSet54, 9);
        java.util.HashSet<java.lang.Integer> intSet58 = null;
        simpleMethods40.addElementToSet(intSet58, 2);
        examples.SimpleMethods simpleMethods61 = new examples.SimpleMethods();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet75 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        simpleMethods61.addElementToSet(intSet75, 9);
        simpleMethods40.addElementToSet(intSet75, 1);
        simpleMethods20.addElementToSet(intSet75, 1);
        simpleMethods10.addElementToSet(intSet75, (-9));
        simpleMethods0.addElementToSet(intSet75, 1);
        java.util.HashSet<java.lang.Integer> intSet87 = null;
        simpleMethods0.addElementToSet(intSet87, (int) (byte) 1);
        java.lang.Class<?> wildcardClass90 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        simpleMethods24.addElementToSet(intSet62, 0);
        simpleMethods0.addElementToSet(intSet62, 6);
        examples.SimpleMethods simpleMethods70 = new examples.SimpleMethods();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods70.addElementToSet(intSet84, 9);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet90 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        simpleMethods70.addElementToSet(intSet90, 0);
        simpleMethods0.addElementToSet(intSet90, 9);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, 100);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        examples.SimpleMethods simpleMethods10 = new examples.SimpleMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods10.addElementToSet(intSet24, 9);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods10.addElementToSet(intSet28, 2);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet32 = null;
        simpleMethods31.addElementToSet(intSet32, 0);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet51 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        simpleMethods37.addElementToSet(intSet51, 9);
        java.util.HashSet<java.lang.Integer> intSet55 = null;
        simpleMethods37.addElementToSet(intSet55, 2);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods58.addElementToSet(intSet72, 9);
        simpleMethods37.addElementToSet(intSet72, 100);
        simpleMethods36.addElementToSet(intSet72, (int) (byte) -1);
        simpleMethods35.addElementToSet(intSet72, 8);
        simpleMethods31.addElementToSet(intSet72, 8);
        simpleMethods10.addElementToSet(intSet72, 1);
        simpleMethods0.addElementToSet(intSet72, 1);
        java.lang.Class<?> wildcardClass88 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, (-100));
        simpleMethods0.addElementToSet(intSet56, (-1));
        java.util.HashSet<java.lang.Integer> intSet64 = null;
        simpleMethods0.addElementToSet(intSet64, (int) (byte) 100);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, 0);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (int) '4');
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 1);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 7);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, 9);
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, 4);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, (-7));
        java.lang.Class<?> wildcardClass88 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods22.addElementToSet(intSet63, (int) (short) 0);
        simpleMethods4.addElementToSet(intSet63, 5);
        examples.SimpleMethods simpleMethods69 = new examples.SimpleMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods69.addElementToSet(intSet83, 9);
        simpleMethods4.addElementToSet(intSet83, 0);
        simpleMethods0.addElementToSet(intSet83, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-1));
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, (-100));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 3, 100, (-9), 5, 5, (-7), (-1), 1, 100, 0, 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods21.addElementToSet(intSet85, 9);
        simpleMethods0.addElementToSet(intSet85, (-8));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-1));
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, 10);
        java.lang.Class<?> wildcardClass97 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (int) (byte) 10);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, 100);
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods21.addElementToSet(intSet62, 10);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods21.addElementToSet(intSet65, (-7));
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods68.addElementToSet(intSet88, 0);
        simpleMethods21.addElementToSet(intSet88, 1);
        simpleMethods0.addElementToSet(intSet88, (int) (short) -1);
        java.lang.Class<?> wildcardClass96 = intSet88.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, (int) (short) 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods4.addElementToSet(intSet20, (int) (byte) 10);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        simpleMethods24.addElementToSet(intSet62, (-2));
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods68.addElementToSet(intSet88, 0);
        simpleMethods24.addElementToSet(intSet88, 9);
        simpleMethods4.addElementToSet(intSet88, 2);
        simpleMethods0.addElementToSet(intSet88, (int) (byte) 10);
        java.lang.Class<?> wildcardClass98 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods4.addElementToSet(intSet24, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods4.addElementToSet(intSet42, (-2));
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods48.addElementToSet(intSet68, 0);
        simpleMethods4.addElementToSet(intSet68, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet68, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 0);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, 10);
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, 8);
        java.lang.Class<?> wildcardClass85 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods21.addElementToSet(intSet41, 0);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        simpleMethods21.addElementToSet(intSet59, (-10));
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods65.addElementToSet(intSet85, 0);
        simpleMethods21.addElementToSet(intSet85, (-1));
        simpleMethods0.addElementToSet(intSet85, 100);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (-2));
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods0.addElementToSet(intSet24, 100);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods0.addElementToSet(intSet28, 9);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet32 = null;
        simpleMethods31.addElementToSet(intSet32, 10);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet36 = null;
        simpleMethods35.addElementToSet(intSet36, 0);
        examples.SimpleMethods simpleMethods39 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods40 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.util.HashSet<java.lang.Integer> intSet59 = null;
        simpleMethods41.addElementToSet(intSet59, 2);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods62.addElementToSet(intSet76, 9);
        simpleMethods41.addElementToSet(intSet76, 100);
        simpleMethods40.addElementToSet(intSet76, (int) (byte) -1);
        simpleMethods39.addElementToSet(intSet76, 8);
        simpleMethods35.addElementToSet(intSet76, 8);
        simpleMethods31.addElementToSet(intSet76, (-100));
        simpleMethods0.addElementToSet(intSet76, (int) (byte) 0);
        java.util.HashSet<java.lang.Integer> intSet92 = null;
        simpleMethods0.addElementToSet(intSet92, (-8));
        java.lang.Class<?> wildcardClass95 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 7);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, 1);
        simpleMethods0.addElementToSet(intSet56, 1);
        java.lang.Class<?> wildcardClass64 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods0.addElementToSet(intSet24, 100);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods0.addElementToSet(intSet28, 4);
        java.util.HashSet<java.lang.Integer> intSet31 = null;
        simpleMethods0.addElementToSet(intSet31, (-1));
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), (-5), 1, 3, (-2), (-100), 7, (-2), 10, 9, 7, 0, (-2), (-3) };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods0.addElementToSet(intSet49, (-10));
        java.lang.Class<?> wildcardClass53 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 10);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods44.addElementToSet(intSet62, 2);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods44.addElementToSet(intSet79, (-100));
        simpleMethods0.addElementToSet(intSet79, (-4));
        java.util.HashSet<java.lang.Integer> intSet87 = null;
        simpleMethods0.addElementToSet(intSet87, 0);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, 3);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (int) (byte) 1);
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods2 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods2.addElementToSet(intSet16, 9);
        java.util.HashSet<java.lang.Integer> intSet20 = null;
        simpleMethods2.addElementToSet(intSet20, 2);
        examples.SimpleMethods simpleMethods23 = new examples.SimpleMethods();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        simpleMethods23.addElementToSet(intSet37, 9);
        simpleMethods2.addElementToSet(intSet37, 100);
        simpleMethods1.addElementToSet(intSet37, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet37, 8);
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, (-100));
        java.lang.Class<?> wildcardClass50 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-10));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        simpleMethods0.addElementToSet(intSet58, (int) (short) 1);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods64.addElementToSet(intSet84, 0);
        simpleMethods0.addElementToSet(intSet84, 0);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (-8));
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (-8));
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, 1);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet14 = null;
        simpleMethods13.addElementToSet(intSet14, 10);
        examples.SimpleMethods simpleMethods17 = new examples.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods17.addElementToSet(intSet31, 9);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        simpleMethods17.addElementToSet(intSet37, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        simpleMethods17.addElementToSet(intSet55, 0);
        simpleMethods13.addElementToSet(intSet55, (-4));
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 3, (-10), (-1), 1, (-1), 7, (-6) };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods13.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-10));
        java.lang.Class<?> wildcardClass78 = intSet72.getClass();
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 1);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 6);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, 8);
        java.lang.Class<?> wildcardClass47 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-2));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods44.addElementToSet(intSet64, 0);
        simpleMethods0.addElementToSet(intSet64, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-2));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (-6));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 10);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods44.addElementToSet(intSet62, 2);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods44.addElementToSet(intSet79, (-100));
        simpleMethods0.addElementToSet(intSet79, (-4));
        java.util.HashSet<java.lang.Integer> intSet87 = null;
        simpleMethods0.addElementToSet(intSet87, 0);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, 0);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 8);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (-5));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-2));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods44.addElementToSet(intSet64, 0);
        simpleMethods0.addElementToSet(intSet64, 9);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-1));
        examples.SimpleMethods simpleMethods73 = new examples.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods73.addElementToSet(intSet87, 9);
        simpleMethods0.addElementToSet(intSet87, 2);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        simpleMethods24.addElementToSet(intSet62, 0);
        simpleMethods0.addElementToSet(intSet62, 6);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-9));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (-6));
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 9);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, 1);
        java.lang.Class<?> wildcardClass82 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods0.addElementToSet(intSet24, 100);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods0.addElementToSet(intSet28, 4);
        java.util.HashSet<java.lang.Integer> intSet31 = null;
        simpleMethods0.addElementToSet(intSet31, (-1));
        java.util.HashSet<java.lang.Integer> intSet34 = null;
        simpleMethods0.addElementToSet(intSet34, (int) (short) 10);
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods27.addElementToSet(intSet28, 10);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet32 = null;
        simpleMethods31.addElementToSet(intSet32, 0);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet51 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        simpleMethods37.addElementToSet(intSet51, 9);
        java.util.HashSet<java.lang.Integer> intSet55 = null;
        simpleMethods37.addElementToSet(intSet55, 2);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods58.addElementToSet(intSet72, 9);
        simpleMethods37.addElementToSet(intSet72, 100);
        simpleMethods36.addElementToSet(intSet72, (int) (byte) -1);
        simpleMethods35.addElementToSet(intSet72, 8);
        simpleMethods31.addElementToSet(intSet72, 8);
        simpleMethods27.addElementToSet(intSet72, (-100));
        simpleMethods0.addElementToSet(intSet72, 100);
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, 5);
        java.lang.Class<?> wildcardClass91 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods0.addElementToSet(intSet21, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 6);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods50.addElementToSet(intSet64, 9);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods50.addElementToSet(intSet70, 0);
        examples.SimpleMethods simpleMethods74 = new examples.SimpleMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods74.addElementToSet(intSet88, 9);
        simpleMethods50.addElementToSet(intSet88, 0);
        simpleMethods0.addElementToSet(intSet88, 10);
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods43.addElementToSet(intSet57, 9);
        java.util.HashSet<java.lang.Integer> intSet61 = null;
        simpleMethods43.addElementToSet(intSet61, 2);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        simpleMethods43.addElementToSet(intSet78, 100);
        simpleMethods42.addElementToSet(intSet78, (int) (byte) -1);
        simpleMethods24.addElementToSet(intSet78, (-8));
        simpleMethods0.addElementToSet(intSet78, 6);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (int) (short) 0);
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 5);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, 100);
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, 0);
        java.util.HashSet<java.lang.Integer> intSet71 = null;
        simpleMethods0.addElementToSet(intSet71, 0);
        java.util.HashSet<java.lang.Integer> intSet74 = null;
        simpleMethods0.addElementToSet(intSet74, (-1));
        java.lang.Class<?> wildcardClass77 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 5);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods44.addElementToSet(intSet64, 0);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        simpleMethods44.addElementToSet(intSet82, (-10));
        simpleMethods0.addElementToSet(intSet82, 1);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (int) '#');
        java.lang.Class<?> wildcardClass93 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 8);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        java.util.HashSet<java.lang.Integer> intSet69 = null;
        simpleMethods51.addElementToSet(intSet69, 2);
        examples.SimpleMethods simpleMethods72 = new examples.SimpleMethods();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet86 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        simpleMethods72.addElementToSet(intSet86, 9);
        simpleMethods51.addElementToSet(intSet86, 100);
        simpleMethods50.addElementToSet(intSet86, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet86, (-10));
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 0);
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods9 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods10 = new examples.SimpleMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods10.addElementToSet(intSet24, 9);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods10.addElementToSet(intSet28, 2);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods31.addElementToSet(intSet45, 9);
        simpleMethods10.addElementToSet(intSet45, 100);
        simpleMethods9.addElementToSet(intSet45, (int) (byte) -1);
        simpleMethods8.addElementToSet(intSet45, 8);
        simpleMethods4.addElementToSet(intSet45, 8);
        simpleMethods0.addElementToSet(intSet45, (-100));
        java.util.HashSet<java.lang.Integer> intSet59 = null;
        simpleMethods0.addElementToSet(intSet59, 10);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods62.addElementToSet(intSet76, 9);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods62.addElementToSet(intSet82, 0);
        simpleMethods0.addElementToSet(intSet82, (-5));
        java.lang.Class<?> wildcardClass88 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet21 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        simpleMethods7.addElementToSet(intSet21, 9);
        java.util.HashSet<java.lang.Integer> intSet25 = null;
        simpleMethods7.addElementToSet(intSet25, (int) (byte) 10);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods28.addElementToSet(intSet48, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods52.addElementToSet(intSet66, 9);
        simpleMethods28.addElementToSet(intSet66, (-2));
        simpleMethods7.addElementToSet(intSet66, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet66, 0);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 8);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, 7);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods7.addElementToSet(intSet8, 0);
        java.util.HashSet<java.lang.Integer> intSet11 = null;
        simpleMethods7.addElementToSet(intSet11, 10);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        simpleMethods14.addElementToSet(intSet28, 9);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods14.addElementToSet(intSet34, 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods38.addElementToSet(intSet52, 9);
        simpleMethods14.addElementToSet(intSet52, (-2));
        simpleMethods7.addElementToSet(intSet52, (-9));
        simpleMethods0.addElementToSet(intSet52, (-10));
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods0.addElementToSet(intSet62, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, (-3));
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, (int) (short) 100);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods71.addElementToSet(intSet87, (int) (byte) 10);
        simpleMethods0.addElementToSet(intSet87, (-1));
        java.lang.Class<?> wildcardClass93 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 1);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 5);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, (-2));
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods47.addElementToSet(intSet61, 9);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods47.addElementToSet(intSet65, 2);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        simpleMethods47.addElementToSet(intSet82, 1);
        simpleMethods0.addElementToSet(intSet82, 7);
        java.lang.Class<?> wildcardClass90 = intSet82.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, (-100));
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 3, 100, (-9), 5, 5, (-7), (-1), 1, 100, 0, 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4 };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods0.addElementToSet(intSet64, 9);
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, 0);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods71.addElementToSet(intSet85, 9);
        simpleMethods0.addElementToSet(intSet85, 8);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (int) '4');
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 7);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods21.addElementToSet(intSet22, 0);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods25.addElementToSet(intSet45, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        simpleMethods25.addElementToSet(intSet63, (-10));
        simpleMethods21.addElementToSet(intSet63, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet63, 4);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 3);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 4);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 4);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 6);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet13 = null;
        simpleMethods0.addElementToSet(intSet13, 0);
        examples.SimpleMethods simpleMethods16 = new examples.SimpleMethods();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet30 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        simpleMethods16.addElementToSet(intSet30, 9);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods35.addElementToSet(intSet49, 9);
        java.util.HashSet<java.lang.Integer> intSet53 = null;
        simpleMethods35.addElementToSet(intSet53, 2);
        examples.SimpleMethods simpleMethods56 = new examples.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods56.addElementToSet(intSet70, 9);
        simpleMethods35.addElementToSet(intSet70, 100);
        simpleMethods34.addElementToSet(intSet70, (int) (byte) -1);
        simpleMethods16.addElementToSet(intSet70, (-8));
        simpleMethods0.addElementToSet(intSet70, (int) (byte) 100);
        java.lang.Class<?> wildcardClass82 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 10);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods44.addElementToSet(intSet62, 2);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods44.addElementToSet(intSet79, (-100));
        simpleMethods0.addElementToSet(intSet79, (-4));
        java.util.HashSet<java.lang.Integer> intSet87 = null;
        simpleMethods0.addElementToSet(intSet87, 0);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, 0);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 8);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, 10);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-2));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods44.addElementToSet(intSet62, 2);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods44.addElementToSet(intSet79, 1);
        simpleMethods0.addElementToSet(intSet79, (int) (short) 0);
        java.lang.Class<?> wildcardClass87 = intSet79.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods5 = new examples.SimpleMethods();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet19 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        simpleMethods5.addElementToSet(intSet19, 9);
        java.util.HashSet<java.lang.Integer> intSet23 = null;
        simpleMethods5.addElementToSet(intSet23, 2);
        examples.SimpleMethods simpleMethods26 = new examples.SimpleMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        simpleMethods26.addElementToSet(intSet40, 9);
        simpleMethods5.addElementToSet(intSet40, (-100));
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 3, 100, (-9), 5, 5, (-7), (-1), 1, 100, 0, 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4 };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods5.addElementToSet(intSet69, 9);
        simpleMethods4.addElementToSet(intSet69, 0);
        simpleMethods0.addElementToSet(intSet69, (-9));
        java.util.HashSet<java.lang.Integer> intSet77 = null;
        simpleMethods0.addElementToSet(intSet77, 0);
        java.lang.Class<?> wildcardClass80 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet2 = null;
        simpleMethods1.addElementToSet(intSet2, 10);
        examples.SimpleMethods simpleMethods5 = new examples.SimpleMethods();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet19 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        simpleMethods5.addElementToSet(intSet19, 9);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet25 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        simpleMethods5.addElementToSet(intSet25, 0);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        simpleMethods29.addElementToSet(intSet43, 9);
        simpleMethods5.addElementToSet(intSet43, (-2));
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods49.addElementToSet(intSet69, 0);
        simpleMethods5.addElementToSet(intSet69, (int) (short) -1);
        simpleMethods1.addElementToSet(intSet69, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet69, 9);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, (int) '4');
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, (int) (byte) 100);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, 2);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods7.addElementToSet(intSet8, 2);
        examples.SimpleMethods simpleMethods11 = new examples.SimpleMethods();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet25 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        simpleMethods11.addElementToSet(intSet25, 9);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        simpleMethods29.addElementToSet(intSet43, 9);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods29.addElementToSet(intSet49, 0);
        examples.SimpleMethods simpleMethods53 = new examples.SimpleMethods();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods53.addElementToSet(intSet67, 9);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet73 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        simpleMethods53.addElementToSet(intSet73, 0);
        simpleMethods29.addElementToSet(intSet73, 8);
        simpleMethods11.addElementToSet(intSet73, 7);
        simpleMethods7.addElementToSet(intSet73, 100);
        simpleMethods0.addElementToSet(intSet73, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, (int) (byte) 100);
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, (-2));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, 2);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-2));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods44.addElementToSet(intSet64, 0);
        simpleMethods0.addElementToSet(intSet64, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-6));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, (-3));
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, (-3));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (-6));
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods27.addElementToSet(intSet28, 10);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet32 = null;
        simpleMethods31.addElementToSet(intSet32, 2);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods35.addElementToSet(intSet49, 9);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods35.addElementToSet(intSet76, (int) (short) 0);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 5, 1, (-4), 0, 9, 7, (-10) };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods35.addElementToSet(intSet88, (-100));
        simpleMethods31.addElementToSet(intSet88, (int) (byte) 10);
        simpleMethods27.addElementToSet(intSet88, (-5));
        simpleMethods0.addElementToSet(intSet88, (-100));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 1);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods41.addElementToSet(intSet82, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet82, 1);
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, 6);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-5));
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, (-3));
        java.lang.Class<?> wildcardClass97 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 8);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (-2));
        java.util.HashSet<java.lang.Integer> intSet53 = null;
        simpleMethods0.addElementToSet(intSet53, (-100));
        java.lang.Class<?> wildcardClass56 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet15 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        simpleMethods1.addElementToSet(intSet15, 9);
        java.util.HashSet<java.lang.Integer> intSet19 = null;
        simpleMethods1.addElementToSet(intSet19, 2);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        examples.SimpleMethods simpleMethods40 = new examples.SimpleMethods();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods40.addElementToSet(intSet54, 9);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods40.addElementToSet(intSet81, (int) (short) 0);
        simpleMethods22.addElementToSet(intSet81, 1);
        simpleMethods1.addElementToSet(intSet81, 0);
        simpleMethods0.addElementToSet(intSet81, 1);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, 0);
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, (-9));
        java.lang.Class<?> wildcardClass97 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet15 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        simpleMethods1.addElementToSet(intSet15, 9);
        java.util.HashSet<java.lang.Integer> intSet19 = null;
        simpleMethods1.addElementToSet(intSet19, 2);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        simpleMethods1.addElementToSet(intSet36, 100);
        simpleMethods0.addElementToSet(intSet36, (int) (byte) -1);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet45 = null;
        simpleMethods44.addElementToSet(intSet45, 0);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        java.util.HashSet<java.lang.Integer> intSet66 = null;
        simpleMethods48.addElementToSet(intSet66, 2);
        examples.SimpleMethods simpleMethods69 = new examples.SimpleMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods69.addElementToSet(intSet83, 9);
        simpleMethods48.addElementToSet(intSet83, 1);
        simpleMethods44.addElementToSet(intSet83, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet83, (int) (byte) 10);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 10);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (int) (byte) 10);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, 100);
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods21.addElementToSet(intSet62, 10);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods21.addElementToSet(intSet65, (-7));
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods68.addElementToSet(intSet88, 0);
        simpleMethods21.addElementToSet(intSet88, 1);
        simpleMethods0.addElementToSet(intSet88, (int) (short) -1);
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.util.HashSet<java.lang.Integer> intSet42 = null;
        simpleMethods24.addElementToSet(intSet42, 2);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        simpleMethods24.addElementToSet(intSet59, 1);
        simpleMethods0.addElementToSet(intSet59, (-1));
        examples.SimpleMethods simpleMethods67 = new examples.SimpleMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods67.addElementToSet(intSet83, (int) (byte) 10);
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet91 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        simpleMethods67.addElementToSet(intSet91, 100);
        simpleMethods0.addElementToSet(intSet91, 1);
        java.util.HashSet<java.lang.Integer> intSet97 = null;
        simpleMethods0.addElementToSet(intSet97, 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet21 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        simpleMethods7.addElementToSet(intSet21, 9);
        java.util.HashSet<java.lang.Integer> intSet25 = null;
        simpleMethods7.addElementToSet(intSet25, 2);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods7.addElementToSet(intSet42, (-100));
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        java.util.HashSet<java.lang.Integer> intSet66 = null;
        simpleMethods48.addElementToSet(intSet66, 2);
        examples.SimpleMethods simpleMethods69 = new examples.SimpleMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods69.addElementToSet(intSet83, 9);
        simpleMethods48.addElementToSet(intSet83, 1);
        simpleMethods7.addElementToSet(intSet83, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet83, 1);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (-3));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.util.HashSet<java.lang.Integer> intSet43 = null;
        simpleMethods25.addElementToSet(intSet43, 2);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods46.addElementToSet(intSet60, 9);
        simpleMethods25.addElementToSet(intSet60, (-100));
        simpleMethods4.addElementToSet(intSet60, (-1));
        simpleMethods0.addElementToSet(intSet60, (-9));
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-2));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (int) (short) -1);
        examples.SimpleMethods simpleMethods76 = new examples.SimpleMethods();
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet92 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        simpleMethods76.addElementToSet(intSet92, (int) (byte) 10);
        simpleMethods0.addElementToSet(intSet92, 8);
        java.lang.Class<?> wildcardClass98 = intSet92.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 5);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, (-5));
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, (int) '4');
        java.lang.Class<?> wildcardClass71 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 1);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 6);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet45 = null;
        simpleMethods44.addElementToSet(intSet45, 10);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet49 = null;
        simpleMethods48.addElementToSet(intSet49, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods52.addElementToSet(intSet66, 9);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods52.addElementToSet(intSet70, 2);
        examples.SimpleMethods simpleMethods73 = new examples.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods73.addElementToSet(intSet87, 9);
        simpleMethods52.addElementToSet(intSet87, 1);
        simpleMethods48.addElementToSet(intSet87, (int) (short) 0);
        simpleMethods44.addElementToSet(intSet87, 2);
        simpleMethods0.addElementToSet(intSet87, (-2));
        java.lang.Class<?> wildcardClass99 = intSet87.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods22.addElementToSet(intSet42, 0);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods46.addElementToSet(intSet60, 9);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods46.addElementToSet(intSet66, 0);
        simpleMethods22.addElementToSet(intSet66, 8);
        simpleMethods4.addElementToSet(intSet66, 7);
        simpleMethods0.addElementToSet(intSet66, 100);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 1);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, 1);
        java.lang.Class<?> wildcardClass82 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.util.HashSet<java.lang.Integer> intSet43 = null;
        simpleMethods25.addElementToSet(intSet43, 2);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods46.addElementToSet(intSet60, 9);
        simpleMethods25.addElementToSet(intSet60, (-100));
        simpleMethods4.addElementToSet(intSet60, (-1));
        simpleMethods0.addElementToSet(intSet60, 6);
        java.lang.Class<?> wildcardClass70 = intSet60.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods18.addElementToSet(intSet38, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods42.addElementToSet(intSet62, 0);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods66.addElementToSet(intSet80, 9);
        simpleMethods42.addElementToSet(intSet80, (-10));
        simpleMethods18.addElementToSet(intSet80, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet80, 10);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, 2);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (int) '4');
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, 0);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods18.addElementToSet(intSet38, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods42.addElementToSet(intSet62, 0);
        simpleMethods18.addElementToSet(intSet62, 8);
        simpleMethods0.addElementToSet(intSet62, 7);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-10), (-3), 0, (-6), 3 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods0.addElementToSet(intSet76, (-8));
        java.util.HashSet<java.lang.Integer> intSet80 = null;
        simpleMethods0.addElementToSet(intSet80, 4);
        java.util.HashSet<java.lang.Integer> intSet83 = null;
        simpleMethods0.addElementToSet(intSet83, (-100));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 4);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 6);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet13 = null;
        simpleMethods0.addElementToSet(intSet13, 0);
        examples.SimpleMethods simpleMethods16 = new examples.SimpleMethods();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet30 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        simpleMethods16.addElementToSet(intSet30, 9);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods35.addElementToSet(intSet49, 9);
        java.util.HashSet<java.lang.Integer> intSet53 = null;
        simpleMethods35.addElementToSet(intSet53, 2);
        examples.SimpleMethods simpleMethods56 = new examples.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods56.addElementToSet(intSet70, 9);
        simpleMethods35.addElementToSet(intSet70, 100);
        simpleMethods34.addElementToSet(intSet70, (int) (byte) -1);
        simpleMethods16.addElementToSet(intSet70, (-8));
        simpleMethods0.addElementToSet(intSet70, (int) (byte) 100);
        java.lang.Class<?> wildcardClass82 = intSet70.getClass();
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 0);
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods4.addElementToSet(intSet8, 10);
        java.util.HashSet<java.lang.Integer> intSet11 = null;
        simpleMethods4.addElementToSet(intSet11, (-4));
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet15 = null;
        simpleMethods14.addElementToSet(intSet15, 10);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.util.HashSet<java.lang.Integer> intSet36 = null;
        simpleMethods18.addElementToSet(intSet36, 2);
        examples.SimpleMethods simpleMethods39 = new examples.SimpleMethods();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods39.addElementToSet(intSet53, 9);
        java.util.HashSet<java.lang.Integer> intSet57 = null;
        simpleMethods39.addElementToSet(intSet57, 2);
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        simpleMethods60.addElementToSet(intSet74, 9);
        simpleMethods39.addElementToSet(intSet74, (-100));
        simpleMethods18.addElementToSet(intSet74, (-1));
        simpleMethods14.addElementToSet(intSet74, (-9));
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { (-8), (-1), (-8), 1, (-6), 9 };
        java.util.HashSet<java.lang.Integer> intSet91 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        simpleMethods14.addElementToSet(intSet91, 100);
        simpleMethods4.addElementToSet(intSet91, (-4));
        simpleMethods0.addElementToSet(intSet91, 1);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 7);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods21.addElementToSet(intSet41, 0);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        simpleMethods21.addElementToSet(intSet59, (-10));
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods65.addElementToSet(intSet85, 0);
        simpleMethods21.addElementToSet(intSet85, (-1));
        simpleMethods0.addElementToSet(intSet85, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 100);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (-5));
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, (-100));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 3, 100, (-9), 5, 5, (-7), (-1), 1, 100, 0, 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods21.addElementToSet(intSet85, 9);
        simpleMethods0.addElementToSet(intSet85, (-8));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (int) (byte) -1);
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet15 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        simpleMethods1.addElementToSet(intSet15, 9);
        java.util.HashSet<java.lang.Integer> intSet19 = null;
        simpleMethods1.addElementToSet(intSet19, 2);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        examples.SimpleMethods simpleMethods40 = new examples.SimpleMethods();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods40.addElementToSet(intSet54, 9);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods40.addElementToSet(intSet81, (int) (short) 0);
        simpleMethods22.addElementToSet(intSet81, 1);
        simpleMethods1.addElementToSet(intSet81, 0);
        simpleMethods0.addElementToSet(intSet81, (int) (short) 1);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-5));
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 2);
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet9 = null;
        simpleMethods8.addElementToSet(intSet9, 0);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        simpleMethods14.addElementToSet(intSet28, 9);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods14.addElementToSet(intSet34, 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods38.addElementToSet(intSet52, 9);
        java.util.HashSet<java.lang.Integer> intSet56 = null;
        simpleMethods38.addElementToSet(intSet56, 2);
        examples.SimpleMethods simpleMethods59 = new examples.SimpleMethods();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet73 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        simpleMethods59.addElementToSet(intSet73, 9);
        simpleMethods38.addElementToSet(intSet73, 1);
        simpleMethods14.addElementToSet(intSet73, (-1));
        simpleMethods13.addElementToSet(intSet73, (-5));
        simpleMethods12.addElementToSet(intSet73, (-2));
        simpleMethods8.addElementToSet(intSet73, (int) (byte) 0);
        simpleMethods4.addElementToSet(intSet73, (int) ' ');
        simpleMethods0.addElementToSet(intSet73, (-100));
        java.lang.Class<?> wildcardClass91 = intSet73.getClass();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, 1);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet14 = null;
        simpleMethods13.addElementToSet(intSet14, 10);
        examples.SimpleMethods simpleMethods17 = new examples.SimpleMethods();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet31 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet31, intArray30);
        simpleMethods17.addElementToSet(intSet31, 9);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        simpleMethods17.addElementToSet(intSet37, 0);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        simpleMethods17.addElementToSet(intSet55, 0);
        simpleMethods13.addElementToSet(intSet55, (-4));
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 0, 3, (-10), (-1), 1, (-1), 7, (-6) };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods13.addElementToSet(intSet72, 6);
        simpleMethods0.addElementToSet(intSet72, (-10));
        java.lang.Class<?> wildcardClass78 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, (-100));
        simpleMethods0.addElementToSet(intSet56, (-1));
        java.util.HashSet<java.lang.Integer> intSet64 = null;
        simpleMethods0.addElementToSet(intSet64, (-1));
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (int) 'a');
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (int) ' ');
        java.lang.Class<?> wildcardClass76 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods0.addElementToSet(intSet79, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, (int) '#');
        java.lang.Class<?> wildcardClass88 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 1);
        simpleMethods0.addElementToSet(intSet39, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, 0);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet51 = null;
        simpleMethods50.addElementToSet(intSet51, 2);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 0, 3, (-2), 0, 100, (-10), 8, 0, (-1), (-4), 100, 4, 1, (-3), (-3), 3, 10, (-5), 0, 1, 9, (-5), (-5), 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods50.addElementToSet(intSet79, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet79, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, 2);
        java.lang.Class<?> wildcardClass88 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods27.addElementToSet(intSet41, 9);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        simpleMethods27.addElementToSet(intSet47, 0);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        simpleMethods27.addElementToSet(intSet65, 0);
        simpleMethods0.addElementToSet(intSet65, 1);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (int) (byte) 100);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, (int) 'a');
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, (-5));
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, (int) ' ');
        java.lang.Class<?> wildcardClass85 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods0.addElementToSet(intSet79, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, 6);
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, (-2));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, 1);
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods2 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods2.addElementToSet(intSet16, 9);
        java.util.HashSet<java.lang.Integer> intSet20 = null;
        simpleMethods2.addElementToSet(intSet20, 2);
        examples.SimpleMethods simpleMethods23 = new examples.SimpleMethods();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        simpleMethods23.addElementToSet(intSet37, 9);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods41.addElementToSet(intSet82, (int) (short) 0);
        simpleMethods23.addElementToSet(intSet82, 1);
        simpleMethods2.addElementToSet(intSet82, 0);
        simpleMethods1.addElementToSet(intSet82, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet82, 0);
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, (-3));
        java.lang.Class<?> wildcardClass97 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods20.addElementToSet(intSet21, 10);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet25 = null;
        simpleMethods24.addElementToSet(intSet25, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods30.addElementToSet(intSet44, 9);
        java.util.HashSet<java.lang.Integer> intSet48 = null;
        simpleMethods30.addElementToSet(intSet48, 2);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        simpleMethods30.addElementToSet(intSet65, 100);
        simpleMethods29.addElementToSet(intSet65, (int) (byte) -1);
        simpleMethods28.addElementToSet(intSet65, 8);
        simpleMethods24.addElementToSet(intSet65, 8);
        simpleMethods20.addElementToSet(intSet65, (-100));
        simpleMethods0.addElementToSet(intSet65, (-2));
        java.util.HashSet<java.lang.Integer> intSet81 = null;
        simpleMethods0.addElementToSet(intSet81, (int) (byte) 100);
        java.util.HashSet<java.lang.Integer> intSet84 = null;
        simpleMethods0.addElementToSet(intSet84, (int) (short) 1);
        java.lang.Class<?> wildcardClass87 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        java.util.HashSet<java.lang.Integer> intSet40 = null;
        simpleMethods22.addElementToSet(intSet40, 2);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods43.addElementToSet(intSet57, 9);
        simpleMethods22.addElementToSet(intSet57, 1);
        simpleMethods4.addElementToSet(intSet57, 5);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods65.addElementToSet(intSet85, 0);
        simpleMethods4.addElementToSet(intSet85, 10);
        simpleMethods0.addElementToSet(intSet85, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 9);
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods18.addElementToSet(intSet38, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods42.addElementToSet(intSet62, 0);
        simpleMethods18.addElementToSet(intSet62, 8);
        simpleMethods0.addElementToSet(intSet62, 7);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-8));
        examples.SimpleMethods simpleMethods73 = new examples.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods73.addElementToSet(intSet87, 9);
        simpleMethods0.addElementToSet(intSet87, 1);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 1);
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 10);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, 100);
        java.lang.Class<?> wildcardClass47 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet15 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        simpleMethods1.addElementToSet(intSet15, 9);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet21 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        simpleMethods1.addElementToSet(intSet21, 0);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods25.addElementToSet(intSet45, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        simpleMethods25.addElementToSet(intSet63, 0);
        simpleMethods1.addElementToSet(intSet63, 6);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods71.addElementToSet(intSet85, 9);
        simpleMethods1.addElementToSet(intSet85, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet85, (-5));
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (-4));
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 1);
        simpleMethods0.addElementToSet(intSet39, (int) (short) 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods47.addElementToSet(intSet61, 9);
        simpleMethods0.addElementToSet(intSet61, 8);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (int) (short) -1);
        java.lang.Class<?> wildcardClass70 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.util.HashSet<java.lang.Integer> intSet43 = null;
        simpleMethods25.addElementToSet(intSet43, 2);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods46.addElementToSet(intSet60, 9);
        simpleMethods25.addElementToSet(intSet60, (-100));
        simpleMethods4.addElementToSet(intSet60, (-1));
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods4.addElementToSet(intSet68, (-1));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-5), (-10), 1, (-2), 3, 7, (-2), 7, 1, (-9), 0, (-7), (-8) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods4.addElementToSet(intSet85, 9);
        simpleMethods0.addElementToSet(intSet85, (-3));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, 8);
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, (-1));
        java.util.HashSet<java.lang.Integer> intSet97 = null;
        simpleMethods0.addElementToSet(intSet97, (-9));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 5);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, 100);
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, (-9));
        java.util.HashSet<java.lang.Integer> intSet71 = null;
        simpleMethods0.addElementToSet(intSet71, (-6));
        java.lang.Class<?> wildcardClass74 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods27.addElementToSet(intSet41, 9);
        java.util.HashSet<java.lang.Integer> intSet45 = null;
        simpleMethods27.addElementToSet(intSet45, 2);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        simpleMethods27.addElementToSet(intSet62, 100);
        simpleMethods0.addElementToSet(intSet62, 7);
        java.lang.Class<?> wildcardClass70 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, (int) (byte) 100);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet45 = null;
        simpleMethods44.addElementToSet(intSet45, 0);
        java.util.HashSet<java.lang.Integer> intSet48 = null;
        simpleMethods44.addElementToSet(intSet48, 10);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet92 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        simpleMethods51.addElementToSet(intSet92, (int) (short) 0);
        simpleMethods44.addElementToSet(intSet92, 5);
        simpleMethods0.addElementToSet(intSet92, (-5));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, 0);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, (-10));
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, 10);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, 1);
        java.lang.Class<?> wildcardClass53 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet2 = null;
        simpleMethods1.addElementToSet(intSet2, 10);
        examples.SimpleMethods simpleMethods5 = new examples.SimpleMethods();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet19 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        simpleMethods5.addElementToSet(intSet19, 9);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet25 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet25, intArray24);
        simpleMethods5.addElementToSet(intSet25, 0);
        examples.SimpleMethods simpleMethods29 = new examples.SimpleMethods();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        simpleMethods29.addElementToSet(intSet43, 9);
        simpleMethods5.addElementToSet(intSet43, (-2));
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods49.addElementToSet(intSet69, 0);
        simpleMethods5.addElementToSet(intSet69, (int) (short) -1);
        simpleMethods1.addElementToSet(intSet69, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet69, 9);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, (int) '4');
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, (int) ' ');
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods4.addElementToSet(intSet45, (int) (short) 0);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 5, 1, (-4), 0, 9, 7, (-10) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods4.addElementToSet(intSet57, (-100));
        simpleMethods0.addElementToSet(intSet57, (int) (byte) 10);
        java.util.HashSet<java.lang.Integer> intSet63 = null;
        simpleMethods0.addElementToSet(intSet63, 10);
        java.util.HashSet<java.lang.Integer> intSet66 = null;
        simpleMethods0.addElementToSet(intSet66, (-2));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (-1));
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods0.addElementToSet(intSet21, 1);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.util.HashSet<java.lang.Integer> intSet42 = null;
        simpleMethods24.addElementToSet(intSet42, 2);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        simpleMethods24.addElementToSet(intSet59, (-100));
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods24.addElementToSet(intSet65, (int) '#');
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods68.addElementToSet(intSet84, (int) (byte) 10);
        simpleMethods24.addElementToSet(intSet84, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet84, 5);
        java.lang.Class<?> wildcardClass92 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 0);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, 5);
        java.lang.Class<?> wildcardClass53 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 8);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, 10);
        java.lang.Class<?> wildcardClass53 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 2);
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet22 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        simpleMethods8.addElementToSet(intSet22, 9);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods8.addElementToSet(intSet49, (int) (short) 0);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 5, 1, (-4), 0, 9, 7, (-10) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods8.addElementToSet(intSet61, (-100));
        simpleMethods4.addElementToSet(intSet61, (int) (byte) 10);
        simpleMethods0.addElementToSet(intSet61, (int) (short) 1);
        java.util.HashSet<java.lang.Integer> intSet69 = null;
        simpleMethods0.addElementToSet(intSet69, (int) (short) 10);
        java.lang.Class<?> wildcardClass72 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 0);
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet22 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        simpleMethods8.addElementToSet(intSet22, 9);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        simpleMethods8.addElementToSet(intSet28, 0);
        examples.SimpleMethods simpleMethods32 = new examples.SimpleMethods();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet46 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        simpleMethods32.addElementToSet(intSet46, 9);
        simpleMethods8.addElementToSet(intSet46, (-10));
        simpleMethods4.addElementToSet(intSet46, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet46, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet56 = null;
        simpleMethods0.addElementToSet(intSet56, (int) (short) 1);
        java.lang.Class<?> wildcardClass59 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 5);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, 100);
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, (-2));
        java.lang.Class<?> wildcardClass71 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 5);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        simpleMethods0.addElementToSet(intSet58, 4);
        java.util.HashSet<java.lang.Integer> intSet64 = null;
        simpleMethods0.addElementToSet(intSet64, 10);
        java.lang.Class<?> wildcardClass67 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (-1));
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods0.addElementToSet(intSet21, 1);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.util.HashSet<java.lang.Integer> intSet42 = null;
        simpleMethods24.addElementToSet(intSet42, 2);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        simpleMethods24.addElementToSet(intSet59, (-100));
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods24.addElementToSet(intSet65, (int) '#');
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods68.addElementToSet(intSet84, (int) (byte) 10);
        simpleMethods24.addElementToSet(intSet84, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet84, 5);
        java.lang.Class<?> wildcardClass92 = intSet84.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods4.addElementToSet(intSet24, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods4.addElementToSet(intSet42, (-2));
        simpleMethods0.addElementToSet(intSet42, (-5));
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (int) (short) 0);
        java.lang.Class<?> wildcardClass53 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (int) (byte) 10);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods21.addElementToSet(intSet41, 0);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        simpleMethods21.addElementToSet(intSet59, (-2));
        simpleMethods0.addElementToSet(intSet59, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, 0);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, 3);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods0.addElementToSet(intSet24, 100);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        java.util.HashSet<java.lang.Integer> intSet46 = null;
        simpleMethods28.addElementToSet(intSet46, 2);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods49.addElementToSet(intSet67, 2);
        examples.SimpleMethods simpleMethods70 = new examples.SimpleMethods();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods70.addElementToSet(intSet84, 9);
        simpleMethods49.addElementToSet(intSet84, (-100));
        simpleMethods28.addElementToSet(intSet84, (-1));
        simpleMethods0.addElementToSet(intSet84, (int) (byte) 0);
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, (-5));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 4);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 6);
        examples.SimpleMethods simpleMethods10 = new examples.SimpleMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods10.addElementToSet(intSet24, 9);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet30 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        simpleMethods10.addElementToSet(intSet30, 0);
        java.util.HashSet<java.lang.Integer> intSet34 = null;
        simpleMethods10.addElementToSet(intSet34, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet37 = null;
        simpleMethods10.addElementToSet(intSet37, (int) '4');
        examples.SimpleMethods simpleMethods40 = new examples.SimpleMethods();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods40.addElementToSet(intSet54, 9);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods40.addElementToSet(intSet60, 0);
        simpleMethods10.addElementToSet(intSet60, 1);
        simpleMethods0.addElementToSet(intSet60, (-4));
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, (-5));
        java.lang.Class<?> wildcardClass71 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet15 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        simpleMethods1.addElementToSet(intSet15, 9);
        java.util.HashSet<java.lang.Integer> intSet19 = null;
        simpleMethods1.addElementToSet(intSet19, 2);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        simpleMethods1.addElementToSet(intSet36, 100);
        java.util.HashSet<java.lang.Integer> intSet42 = null;
        simpleMethods1.addElementToSet(intSet42, 5);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods45.addElementToSet(intSet65, 0);
        examples.SimpleMethods simpleMethods69 = new examples.SimpleMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods69.addElementToSet(intSet83, 9);
        simpleMethods45.addElementToSet(intSet83, (-10));
        simpleMethods1.addElementToSet(intSet83, 1);
        simpleMethods0.addElementToSet(intSet83, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 100);
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 100);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods45.addElementToSet(intSet65, 0);
        simpleMethods4.addElementToSet(intSet65, 8);
        simpleMethods0.addElementToSet(intSet65, 9);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (-9));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods0.addElementToSet(intSet21, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 6);
        java.lang.Class<?> wildcardClass50 = intSet44.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 4);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 6);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, (int) (short) 100);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet14 = null;
        simpleMethods13.addElementToSet(intSet14, 0);
        java.util.HashSet<java.lang.Integer> intSet17 = null;
        simpleMethods13.addElementToSet(intSet17, 10);
        java.util.HashSet<java.lang.Integer> intSet20 = null;
        simpleMethods13.addElementToSet(intSet20, (-4));
        examples.SimpleMethods simpleMethods23 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods23.addElementToSet(intSet24, 2);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods27.addElementToSet(intSet41, 9);
        java.util.HashSet<java.lang.Integer> intSet45 = null;
        simpleMethods27.addElementToSet(intSet45, 2);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        simpleMethods27.addElementToSet(intSet62, 1);
        simpleMethods23.addElementToSet(intSet62, (int) '#');
        simpleMethods13.addElementToSet(intSet62, (-1));
        simpleMethods0.addElementToSet(intSet62, 0);
        java.lang.Class<?> wildcardClass74 = intSet62.getClass();
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, (-100));
        simpleMethods0.addElementToSet(intSet56, (-1));
        java.util.HashSet<java.lang.Integer> intSet64 = null;
        simpleMethods0.addElementToSet(intSet64, (-9));
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (-4));
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, (-100));
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, (int) (byte) -1);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 5, (-4), 9, 3, 0, 6, (-1), (-3), (-5), 4, 8, (-8), (-8), 0, (-3) };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods0.addElementToSet(intSet60, 1);
        java.util.HashSet<java.lang.Integer> intSet64 = null;
        simpleMethods0.addElementToSet(intSet64, 9);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, 9);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 7);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-1), (-6), 1, 0 };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods0.addElementToSet(intSet81, 10);
        java.lang.Class<?> wildcardClass85 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 1);
        simpleMethods0.addElementToSet(intSet39, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, (int) (byte) 1);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (int) '#');
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-5), 10, 100, (-1), 1, 10, (-1), 100, (-10), (-7), (-3), (-9) };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods0.addElementToSet(intSet66, 0);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-10));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 4);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 6);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet13 = null;
        simpleMethods0.addElementToSet(intSet13, 0);
        examples.SimpleMethods simpleMethods16 = new examples.SimpleMethods();
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet30 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet30, intArray29);
        simpleMethods16.addElementToSet(intSet30, 9);
        java.util.HashSet<java.lang.Integer> intSet34 = null;
        simpleMethods16.addElementToSet(intSet34, 2);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet51 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        simpleMethods37.addElementToSet(intSet51, 9);
        simpleMethods16.addElementToSet(intSet51, 100);
        java.util.HashSet<java.lang.Integer> intSet57 = null;
        simpleMethods16.addElementToSet(intSet57, 5);
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        simpleMethods60.addElementToSet(intSet74, 9);
        simpleMethods16.addElementToSet(intSet74, 4);
        simpleMethods0.addElementToSet(intSet74, (int) (short) -1);
        java.lang.Class<?> wildcardClass82 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, (int) (short) 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, (-100));
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet46 = null;
        simpleMethods45.addElementToSet(intSet46, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods49.addElementToSet(intSet69, 0);
        examples.SimpleMethods simpleMethods73 = new examples.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods73.addElementToSet(intSet87, 9);
        simpleMethods49.addElementToSet(intSet87, (-10));
        simpleMethods45.addElementToSet(intSet87, (int) (short) 10);
        simpleMethods4.addElementToSet(intSet87, (-1));
        simpleMethods0.addElementToSet(intSet87, 10);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods19 = new examples.SimpleMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods19.addElementToSet(intSet33, 9);
        java.util.HashSet<java.lang.Integer> intSet37 = null;
        simpleMethods19.addElementToSet(intSet37, 2);
        examples.SimpleMethods simpleMethods40 = new examples.SimpleMethods();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods40.addElementToSet(intSet54, 9);
        simpleMethods19.addElementToSet(intSet54, 100);
        simpleMethods18.addElementToSet(intSet54, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet54, (-8));
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, (-2), (-8), (-2), 0, (-1), 10, (-7), 0, 4, (-100), (-10), 5, (-100), 0, (-1) };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods0.addElementToSet(intSet81, (-10));
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, (int) (byte) 1);
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, 10);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-9));
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet97 = null;
        simpleMethods0.addElementToSet(intSet97, (int) 'a');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, 0);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, 2);
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (-1));
        java.lang.Class<?> wildcardClass53 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.util.HashSet<java.lang.Integer> intSet43 = null;
        simpleMethods25.addElementToSet(intSet43, 2);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods46.addElementToSet(intSet60, 9);
        simpleMethods25.addElementToSet(intSet60, (-100));
        simpleMethods4.addElementToSet(intSet60, (-1));
        simpleMethods0.addElementToSet(intSet60, 6);
        java.lang.Class<?> wildcardClass70 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods0.addElementToSet(intSet21, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods48.addElementToSet(intSet68, 0);
        examples.SimpleMethods simpleMethods72 = new examples.SimpleMethods();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet86 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        simpleMethods72.addElementToSet(intSet86, 9);
        simpleMethods48.addElementToSet(intSet86, (-10));
        simpleMethods24.addElementToSet(intSet86, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet86, (-6));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 5);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, 100);
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, 0);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods71.addElementToSet(intSet85, 9);
        simpleMethods0.addElementToSet(intSet85, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, 10);
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 1);
        simpleMethods0.addElementToSet(intSet39, (int) (short) 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods47.addElementToSet(intSet61, 9);
        simpleMethods0.addElementToSet(intSet61, 8);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-9));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 0);
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods4.addElementToSet(intSet8, 10);
        java.util.HashSet<java.lang.Integer> intSet11 = null;
        simpleMethods4.addElementToSet(intSet11, (-4));
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet15 = null;
        simpleMethods14.addElementToSet(intSet15, 10);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.util.HashSet<java.lang.Integer> intSet36 = null;
        simpleMethods18.addElementToSet(intSet36, 2);
        examples.SimpleMethods simpleMethods39 = new examples.SimpleMethods();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods39.addElementToSet(intSet53, 9);
        java.util.HashSet<java.lang.Integer> intSet57 = null;
        simpleMethods39.addElementToSet(intSet57, 2);
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        simpleMethods60.addElementToSet(intSet74, 9);
        simpleMethods39.addElementToSet(intSet74, (-100));
        simpleMethods18.addElementToSet(intSet74, (-1));
        simpleMethods14.addElementToSet(intSet74, (-9));
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { (-8), (-1), (-8), 1, (-6), 9 };
        java.util.HashSet<java.lang.Integer> intSet91 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet91, intArray90);
        simpleMethods14.addElementToSet(intSet91, 100);
        simpleMethods4.addElementToSet(intSet91, (-4));
        simpleMethods0.addElementToSet(intSet91, 1);
        java.lang.Class<?> wildcardClass99 = intSet91.getClass();
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods19 = new examples.SimpleMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods19.addElementToSet(intSet33, 9);
        java.util.HashSet<java.lang.Integer> intSet37 = null;
        simpleMethods19.addElementToSet(intSet37, 2);
        examples.SimpleMethods simpleMethods40 = new examples.SimpleMethods();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods40.addElementToSet(intSet54, 9);
        simpleMethods19.addElementToSet(intSet54, 100);
        simpleMethods18.addElementToSet(intSet54, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet54, (int) (byte) 0);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods64.addElementToSet(intSet84, 0);
        simpleMethods0.addElementToSet(intSet84, 0);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (int) (byte) 10);
        java.lang.Class<?> wildcardClass93 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods7.addElementToSet(intSet8, 0);
        java.util.HashSet<java.lang.Integer> intSet11 = null;
        simpleMethods7.addElementToSet(intSet11, 10);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        simpleMethods14.addElementToSet(intSet28, 9);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods14.addElementToSet(intSet34, 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods38.addElementToSet(intSet52, 9);
        simpleMethods14.addElementToSet(intSet52, (-2));
        simpleMethods7.addElementToSet(intSet52, (-9));
        simpleMethods0.addElementToSet(intSet52, (-10));
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods0.addElementToSet(intSet62, 100);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, 100);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods0.addElementToSet(intSet79, 0);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, 3);
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, 6);
        java.lang.Class<?> wildcardClass91 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, 0);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, (-10));
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods47.addElementToSet(intSet63, (int) (byte) 10);
        simpleMethods0.addElementToSet(intSet63, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet69 = null;
        simpleMethods0.addElementToSet(intSet69, 100);
        java.lang.Class<?> wildcardClass72 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 1);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        java.util.HashSet<java.lang.Integer> intSet63 = null;
        simpleMethods45.addElementToSet(intSet63, 2);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods66.addElementToSet(intSet80, 9);
        simpleMethods45.addElementToSet(intSet80, 100);
        simpleMethods4.addElementToSet(intSet80, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet80, 100);
        java.lang.Class<?> wildcardClass90 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 1);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        java.util.HashSet<java.lang.Integer> intSet63 = null;
        simpleMethods45.addElementToSet(intSet63, 2);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods66.addElementToSet(intSet80, 9);
        simpleMethods45.addElementToSet(intSet80, 100);
        simpleMethods4.addElementToSet(intSet80, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet80, 100);
        java.lang.Class<?> wildcardClass90 = intSet80.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 5);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, (-1));
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, (int) 'a');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, (-100));
        java.util.HashSet<java.lang.Integer> intSet45 = null;
        simpleMethods4.addElementToSet(intSet45, (int) (byte) -1);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 5, (-4), 9, 3, 0, 6, (-1), (-3), (-5), 4, 8, (-8), (-8), 0, (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods4.addElementToSet(intSet64, 1);
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods4.addElementToSet(intSet68, 9);
        java.util.HashSet<java.lang.Integer> intSet71 = null;
        simpleMethods4.addElementToSet(intSet71, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet74 = null;
        simpleMethods4.addElementToSet(intSet74, 9);
        java.util.HashSet<java.lang.Integer> intSet77 = null;
        simpleMethods4.addElementToSet(intSet77, 7);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), (-6), 1, 0 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods4.addElementToSet(intSet85, 10);
        simpleMethods0.addElementToSet(intSet85, 0);
        java.lang.Class<?> wildcardClass91 = intSet85.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods41.addElementToSet(intSet61, 0);
        simpleMethods0.addElementToSet(intSet61, 8);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, 4);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, 0);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 5);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, 100);
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, (-9));
        java.util.HashSet<java.lang.Integer> intSet71 = null;
        simpleMethods0.addElementToSet(intSet71, 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods5 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods6.addElementToSet(intSet20, 9);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods6.addElementToSet(intSet26, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods30.addElementToSet(intSet44, 9);
        java.util.HashSet<java.lang.Integer> intSet48 = null;
        simpleMethods30.addElementToSet(intSet48, 2);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        simpleMethods30.addElementToSet(intSet65, 1);
        simpleMethods6.addElementToSet(intSet65, (-1));
        simpleMethods5.addElementToSet(intSet65, (-5));
        simpleMethods4.addElementToSet(intSet65, (-2));
        simpleMethods0.addElementToSet(intSet65, (int) (byte) 0);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, 2);
        java.lang.Class<?> wildcardClass82 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 7);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, 1);
        simpleMethods0.addElementToSet(intSet56, 1);
        java.lang.Class<?> wildcardClass64 = intSet56.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods24.addElementToSet(intSet65, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet65, (-3));
        java.util.HashSet<java.lang.Integer> intSet71 = null;
        simpleMethods0.addElementToSet(intSet71, (int) '4');
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-2), 3, (-4) };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods0.addElementToSet(intSet78, (-5));
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, (int) '#');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods4.addElementToSet(intSet24, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods4.addElementToSet(intSet42, (-10));
        simpleMethods0.addElementToSet(intSet42, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (int) '#');
        examples.SimpleMethods simpleMethods53 = new examples.SimpleMethods();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods53.addElementToSet(intSet67, 9);
        java.util.HashSet<java.lang.Integer> intSet71 = null;
        simpleMethods53.addElementToSet(intSet71, 2);
        examples.SimpleMethods simpleMethods74 = new examples.SimpleMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods74.addElementToSet(intSet88, 9);
        simpleMethods53.addElementToSet(intSet88, 100);
        simpleMethods0.addElementToSet(intSet88, (-100));
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (-4));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet45 = null;
        simpleMethods44.addElementToSet(intSet45, 10);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods48.addElementToSet(intSet68, 0);
        examples.SimpleMethods simpleMethods72 = new examples.SimpleMethods();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet86 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        simpleMethods72.addElementToSet(intSet86, 9);
        simpleMethods48.addElementToSet(intSet86, (-2));
        simpleMethods44.addElementToSet(intSet86, (-5));
        simpleMethods0.addElementToSet(intSet86, (-100));
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 1);
        simpleMethods0.addElementToSet(intSet39, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, (int) (byte) 1);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (int) '#');
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-5), 10, 100, (-1), 1, 10, (-1), 100, (-10), (-7), (-3), (-9) };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods0.addElementToSet(intSet66, 0);
        java.lang.Class<?> wildcardClass70 = intSet66.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods41.addElementToSet(intSet57, (int) (byte) 10);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods41.addElementToSet(intSet65, 100);
        simpleMethods0.addElementToSet(intSet65, (-3));
        java.lang.Class<?> wildcardClass71 = intSet65.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 0);
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet9 = null;
        simpleMethods8.addElementToSet(intSet9, 10);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods12.addElementToSet(intSet26, 9);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods12.addElementToSet(intSet32, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        simpleMethods36.addElementToSet(intSet50, 9);
        simpleMethods12.addElementToSet(intSet50, (-2));
        examples.SimpleMethods simpleMethods56 = new examples.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods56.addElementToSet(intSet70, 9);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods56.addElementToSet(intSet76, 0);
        simpleMethods12.addElementToSet(intSet76, (int) (short) -1);
        simpleMethods8.addElementToSet(intSet76, (int) (byte) -1);
        simpleMethods4.addElementToSet(intSet76, 3);
        simpleMethods0.addElementToSet(intSet76, (int) (byte) 10);
        java.lang.Class<?> wildcardClass88 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 10);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods44.addElementToSet(intSet64, 0);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        simpleMethods44.addElementToSet(intSet82, (-10));
        simpleMethods0.addElementToSet(intSet82, 10);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (int) (byte) 10);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (int) '#');
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods20.addElementToSet(intSet34, 9);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods38.addElementToSet(intSet52, 9);
        java.util.HashSet<java.lang.Integer> intSet56 = null;
        simpleMethods38.addElementToSet(intSet56, 2);
        examples.SimpleMethods simpleMethods59 = new examples.SimpleMethods();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet73 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        simpleMethods59.addElementToSet(intSet73, 9);
        simpleMethods38.addElementToSet(intSet73, 1);
        simpleMethods20.addElementToSet(intSet73, 5);
        simpleMethods0.addElementToSet(intSet73, 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet15 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        simpleMethods1.addElementToSet(intSet15, 9);
        examples.SimpleMethods simpleMethods19 = new examples.SimpleMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods19.addElementToSet(intSet33, 9);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods19.addElementToSet(intSet60, (int) (short) 0);
        simpleMethods1.addElementToSet(intSet60, 1);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods66.addElementToSet(intSet80, 9);
        simpleMethods1.addElementToSet(intSet80, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet80, (-1));
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, 4);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-2));
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods4.addElementToSet(intSet24, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods4.addElementToSet(intSet42, (-2));
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods48.addElementToSet(intSet68, 0);
        simpleMethods4.addElementToSet(intSet68, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet68, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, (-1));
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, (-1));
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, 2);
        java.lang.Class<?> wildcardClass85 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods0.addElementToSet(intSet41, (int) (short) 0);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 1, (-1), (-10), 1, 10, 6, 8, (-3), 10, 10, 10 };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods0.addElementToSet(intSet57, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet61 = null;
        simpleMethods0.addElementToSet(intSet61, (int) (byte) -1);
        java.lang.Class<?> wildcardClass64 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, (-100));
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, (int) (byte) 1);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods44.addElementToSet(intSet64, 0);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods68.addElementToSet(intSet88, 0);
        simpleMethods44.addElementToSet(intSet88, 8);
        simpleMethods0.addElementToSet(intSet88, 0);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-2));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods44.addElementToSet(intSet64, 0);
        simpleMethods0.addElementToSet(intSet64, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (int) ' ');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods4.addElementToSet(intSet24, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods4.addElementToSet(intSet42, (-2));
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        simpleMethods4.addElementToSet(intSet62, 10);
        simpleMethods0.addElementToSet(intSet62, (-5));
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (int) (byte) 10);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (-10));
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, (int) (byte) 0);
        java.lang.Class<?> wildcardClass79 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 1);
        simpleMethods0.addElementToSet(intSet39, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, 0);
        examples.SimpleMethods simpleMethods50 = new examples.SimpleMethods();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods50.addElementToSet(intSet64, 9);
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods50.addElementToSet(intSet68, 2);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods71.addElementToSet(intSet85, 9);
        simpleMethods50.addElementToSet(intSet85, (-100));
        simpleMethods0.addElementToSet(intSet85, (-4));
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 1);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods5 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods6 = new examples.SimpleMethods();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods6.addElementToSet(intSet20, 9);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods6.addElementToSet(intSet26, 0);
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods30.addElementToSet(intSet44, 9);
        java.util.HashSet<java.lang.Integer> intSet48 = null;
        simpleMethods30.addElementToSet(intSet48, 2);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        simpleMethods30.addElementToSet(intSet65, 1);
        simpleMethods6.addElementToSet(intSet65, (-1));
        simpleMethods5.addElementToSet(intSet65, (-5));
        simpleMethods4.addElementToSet(intSet65, (-2));
        simpleMethods0.addElementToSet(intSet65, (int) (byte) 0);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, (int) 'a');
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, 100);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods43.addElementToSet(intSet57, 9);
        java.util.HashSet<java.lang.Integer> intSet61 = null;
        simpleMethods43.addElementToSet(intSet61, 2);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        simpleMethods43.addElementToSet(intSet78, 100);
        simpleMethods42.addElementToSet(intSet78, (int) (byte) -1);
        simpleMethods24.addElementToSet(intSet78, (-8));
        simpleMethods0.addElementToSet(intSet78, 6);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, 7);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 0);
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-10));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        simpleMethods0.addElementToSet(intSet58, (int) (short) 1);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods64.addElementToSet(intSet84, 0);
        simpleMethods0.addElementToSet(intSet84, 0);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (-9));
        java.lang.Class<?> wildcardClass93 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods4.addElementToSet(intSet24, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods4.addElementToSet(intSet42, 0);
        simpleMethods0.addElementToSet(intSet42, (-4));
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, 8);
        java.util.HashSet<java.lang.Integer> intSet53 = null;
        simpleMethods0.addElementToSet(intSet53, (int) (byte) 10);
        java.util.HashSet<java.lang.Integer> intSet56 = null;
        simpleMethods0.addElementToSet(intSet56, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (int) (byte) 10);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods21.addElementToSet(intSet41, 0);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods45.addElementToSet(intSet65, 0);
        examples.SimpleMethods simpleMethods69 = new examples.SimpleMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods69.addElementToSet(intSet83, 9);
        simpleMethods45.addElementToSet(intSet83, (-10));
        simpleMethods21.addElementToSet(intSet83, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet83, 0);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, 100);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, 0);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet45 = null;
        simpleMethods44.addElementToSet(intSet45, 10);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods48.addElementToSet(intSet68, 0);
        examples.SimpleMethods simpleMethods72 = new examples.SimpleMethods();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet86 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        simpleMethods72.addElementToSet(intSet86, 9);
        simpleMethods48.addElementToSet(intSet86, (-2));
        simpleMethods44.addElementToSet(intSet86, (-5));
        simpleMethods0.addElementToSet(intSet86, (-100));
        java.lang.Class<?> wildcardClass96 = intSet86.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods18.addElementToSet(intSet38, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods42.addElementToSet(intSet62, 0);
        simpleMethods18.addElementToSet(intSet62, 8);
        simpleMethods0.addElementToSet(intSet62, 7);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-8));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 100);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, (-4));
        java.lang.Class<?> wildcardClass79 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.util.HashSet<java.lang.Integer> intSet36 = null;
        simpleMethods18.addElementToSet(intSet36, 2);
        examples.SimpleMethods simpleMethods39 = new examples.SimpleMethods();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods39.addElementToSet(intSet53, 9);
        simpleMethods18.addElementToSet(intSet53, 1);
        simpleMethods0.addElementToSet(intSet53, 5);
        examples.SimpleMethods simpleMethods61 = new examples.SimpleMethods();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet77 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet77, intArray76);
        simpleMethods61.addElementToSet(intSet77, (int) (byte) 10);
        simpleMethods0.addElementToSet(intSet77, 9);
        java.util.HashSet<java.lang.Integer> intSet83 = null;
        simpleMethods0.addElementToSet(intSet83, (-8));
        java.lang.Class<?> wildcardClass86 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods19 = new examples.SimpleMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods19.addElementToSet(intSet33, 9);
        java.util.HashSet<java.lang.Integer> intSet37 = null;
        simpleMethods19.addElementToSet(intSet37, 2);
        examples.SimpleMethods simpleMethods40 = new examples.SimpleMethods();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods40.addElementToSet(intSet54, 9);
        simpleMethods19.addElementToSet(intSet54, 100);
        simpleMethods18.addElementToSet(intSet54, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet54, (-8));
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        simpleMethods0.addElementToSet(intSet78, (-8));
        java.util.HashSet<java.lang.Integer> intSet84 = null;
        simpleMethods0.addElementToSet(intSet84, (-1));
        java.util.HashSet<java.lang.Integer> intSet87 = null;
        simpleMethods0.addElementToSet(intSet87, (-1));
        java.lang.Class<?> wildcardClass90 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.util.HashSet<java.lang.Integer> intSet36 = null;
        simpleMethods18.addElementToSet(intSet36, 2);
        examples.SimpleMethods simpleMethods39 = new examples.SimpleMethods();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods39.addElementToSet(intSet53, 9);
        simpleMethods18.addElementToSet(intSet53, 1);
        simpleMethods0.addElementToSet(intSet53, 5);
        examples.SimpleMethods simpleMethods61 = new examples.SimpleMethods();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet75 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        simpleMethods61.addElementToSet(intSet75, 9);
        simpleMethods0.addElementToSet(intSet75, 4);
        java.util.HashSet<java.lang.Integer> intSet81 = null;
        simpleMethods0.addElementToSet(intSet81, 7);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 1);
        simpleMethods0.addElementToSet(intSet39, (int) '#');
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods49.addElementToSet(intSet67, 2);
        examples.SimpleMethods simpleMethods70 = new examples.SimpleMethods();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods70.addElementToSet(intSet84, 9);
        simpleMethods49.addElementToSet(intSet84, 100);
        simpleMethods48.addElementToSet(intSet84, (int) (byte) -1);
        simpleMethods47.addElementToSet(intSet84, 8);
        simpleMethods0.addElementToSet(intSet84, (int) (byte) 1);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (int) (short) -1);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, (int) (short) 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, (-100));
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet46 = null;
        simpleMethods45.addElementToSet(intSet46, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods49.addElementToSet(intSet69, 0);
        examples.SimpleMethods simpleMethods73 = new examples.SimpleMethods();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet87 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet87, intArray86);
        simpleMethods73.addElementToSet(intSet87, 9);
        simpleMethods49.addElementToSet(intSet87, (-10));
        simpleMethods45.addElementToSet(intSet87, (int) (short) 10);
        simpleMethods4.addElementToSet(intSet87, (-1));
        simpleMethods0.addElementToSet(intSet87, 10);
        java.lang.Class<?> wildcardClass99 = intSet87.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 4);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 6);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, (int) (short) 100);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods13.addElementToSet(intSet27, 9);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods13.addElementToSet(intSet33, 0);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet51 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        simpleMethods37.addElementToSet(intSet51, 9);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods37.addElementToSet(intSet57, 0);
        examples.SimpleMethods simpleMethods61 = new examples.SimpleMethods();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet75 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        simpleMethods61.addElementToSet(intSet75, 9);
        simpleMethods37.addElementToSet(intSet75, 0);
        simpleMethods13.addElementToSet(intSet75, 6);
        simpleMethods0.addElementToSet(intSet75, (-100));
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, (-7));
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { (-5), 1, (-3) };
        java.util.HashSet<java.lang.Integer> intSet92 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        simpleMethods0.addElementToSet(intSet92, 7);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 8);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (-2));
        java.util.HashSet<java.lang.Integer> intSet53 = null;
        simpleMethods0.addElementToSet(intSet53, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet56 = null;
        simpleMethods0.addElementToSet(intSet56, 100);
        java.util.HashSet<java.lang.Integer> intSet59 = null;
        simpleMethods0.addElementToSet(intSet59, 6);
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods0.addElementToSet(intSet62, 9);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, (int) (byte) -1);
        java.lang.Class<?> wildcardClass71 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods2 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet3 = null;
        simpleMethods2.addElementToSet(intSet3, 0);
        java.util.HashSet<java.lang.Integer> intSet6 = null;
        simpleMethods2.addElementToSet(intSet6, 10);
        java.util.HashSet<java.lang.Integer> intSet9 = null;
        simpleMethods2.addElementToSet(intSet9, (-4));
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods12.addElementToSet(intSet26, 9);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods12.addElementToSet(intSet32, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        simpleMethods36.addElementToSet(intSet50, 9);
        simpleMethods12.addElementToSet(intSet50, (-10));
        examples.SimpleMethods simpleMethods56 = new examples.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods56.addElementToSet(intSet70, 9);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods56.addElementToSet(intSet76, 0);
        simpleMethods12.addElementToSet(intSet76, (-1));
        simpleMethods2.addElementToSet(intSet76, (int) '#');
        simpleMethods1.addElementToSet(intSet76, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet76, (-5));
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, (int) ' ');
        java.lang.Class<?> wildcardClass91 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods18.addElementToSet(intSet38, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods42.addElementToSet(intSet62, 0);
        simpleMethods18.addElementToSet(intSet62, 8);
        simpleMethods0.addElementToSet(intSet62, 7);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-8));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 100);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 1);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods41.addElementToSet(intSet82, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet82, 1);
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-5));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods0.addElementToSet(intSet24, 100);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods0.addElementToSet(intSet28, 4);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet32 = null;
        simpleMethods31.addElementToSet(intSet32, 0);
        java.util.HashSet<java.lang.Integer> intSet35 = null;
        simpleMethods31.addElementToSet(intSet35, 10);
        java.util.HashSet<java.lang.Integer> intSet38 = null;
        simpleMethods31.addElementToSet(intSet38, (-4));
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods41.addElementToSet(intSet61, 0);
        simpleMethods31.addElementToSet(intSet61, (-1));
        examples.SimpleMethods simpleMethods67 = new examples.SimpleMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods67.addElementToSet(intSet83, (int) (byte) 10);
        simpleMethods31.addElementToSet(intSet83, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet83, (int) (byte) -1);
        java.lang.Class<?> wildcardClass91 = intSet83.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods27.addElementToSet(intSet41, 9);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods27.addElementToSet(intSet68, (int) (short) 0);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, (-1), (-10), 1, 10, 6, 8, (-3), 10, 10, 10 };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods27.addElementToSet(intSet84, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet84, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (-2));
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (int) (short) 100);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.util.HashSet<java.lang.Integer> intSet36 = null;
        simpleMethods18.addElementToSet(intSet36, 2);
        examples.SimpleMethods simpleMethods39 = new examples.SimpleMethods();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet53 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet53, intArray52);
        simpleMethods39.addElementToSet(intSet53, 9);
        simpleMethods18.addElementToSet(intSet53, 1);
        simpleMethods0.addElementToSet(intSet53, 5);
        java.util.HashSet<java.lang.Integer> intSet61 = null;
        simpleMethods0.addElementToSet(intSet61, 10);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods64.addElementToSet(intSet80, (int) (byte) 10);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods64.addElementToSet(intSet88, 100);
        simpleMethods0.addElementToSet(intSet88, 100);
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, 4);
        java.util.HashSet<java.lang.Integer> intSet97 = null;
        simpleMethods0.addElementToSet(intSet97, (int) '4');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 5);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods44.addElementToSet(intSet64, 0);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        simpleMethods44.addElementToSet(intSet82, (-10));
        simpleMethods0.addElementToSet(intSet82, 1);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (int) (byte) 100);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods41.addElementToSet(intSet61, 0);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods65.addElementToSet(intSet85, 0);
        simpleMethods41.addElementToSet(intSet85, 8);
        simpleMethods0.addElementToSet(intSet85, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, 3);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, 9);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet21 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        simpleMethods7.addElementToSet(intSet21, 9);
        java.util.HashSet<java.lang.Integer> intSet25 = null;
        simpleMethods7.addElementToSet(intSet25, (int) (byte) 10);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods28.addElementToSet(intSet48, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods52.addElementToSet(intSet66, 9);
        simpleMethods28.addElementToSet(intSet66, (-2));
        simpleMethods7.addElementToSet(intSet66, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet66, 0);
        examples.SimpleMethods simpleMethods76 = new examples.SimpleMethods();
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet92 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        simpleMethods76.addElementToSet(intSet92, (int) (byte) 10);
        simpleMethods0.addElementToSet(intSet92, 100);
        java.lang.Class<?> wildcardClass98 = intSet92.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods4.addElementToSet(intSet24, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods4.addElementToSet(intSet42, (-2));
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods49.addElementToSet(intSet67, 2);
        examples.SimpleMethods simpleMethods70 = new examples.SimpleMethods();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods70.addElementToSet(intSet84, 9);
        simpleMethods49.addElementToSet(intSet84, 100);
        simpleMethods48.addElementToSet(intSet84, (int) (byte) -1);
        simpleMethods4.addElementToSet(intSet84, (int) ' ');
        simpleMethods0.addElementToSet(intSet84, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (-100));
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods27.addElementToSet(intSet41, 9);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        simpleMethods27.addElementToSet(intSet47, 0);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        simpleMethods27.addElementToSet(intSet65, (-2));
        simpleMethods0.addElementToSet(intSet65, 3);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 3);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, 4);
        java.lang.Class<?> wildcardClass82 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 4);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet21 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        simpleMethods7.addElementToSet(intSet21, 9);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods7.addElementToSet(intSet27, 0);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods31.addElementToSet(intSet45, 9);
        simpleMethods7.addElementToSet(intSet45, 0);
        simpleMethods0.addElementToSet(intSet45, (-100));
        java.util.HashSet<java.lang.Integer> intSet53 = null;
        simpleMethods0.addElementToSet(intSet53, (int) '#');
        java.util.HashSet<java.lang.Integer> intSet56 = null;
        simpleMethods0.addElementToSet(intSet56, 10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 10);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, 100);
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, (-2));
        java.lang.Class<?> wildcardClass50 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 4);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods7.addElementToSet(intSet8, 0);
        examples.SimpleMethods simpleMethods11 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods13.addElementToSet(intSet27, 9);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods13.addElementToSet(intSet33, 0);
        examples.SimpleMethods simpleMethods37 = new examples.SimpleMethods();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet51 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet51, intArray50);
        simpleMethods37.addElementToSet(intSet51, 9);
        java.util.HashSet<java.lang.Integer> intSet55 = null;
        simpleMethods37.addElementToSet(intSet55, 2);
        examples.SimpleMethods simpleMethods58 = new examples.SimpleMethods();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet72 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet72, intArray71);
        simpleMethods58.addElementToSet(intSet72, 9);
        simpleMethods37.addElementToSet(intSet72, 1);
        simpleMethods13.addElementToSet(intSet72, (-1));
        simpleMethods12.addElementToSet(intSet72, (-5));
        simpleMethods11.addElementToSet(intSet72, (-2));
        simpleMethods7.addElementToSet(intSet72, (int) (byte) 0);
        simpleMethods0.addElementToSet(intSet72, (-1));
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, 5);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (-1));
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods21.addElementToSet(intSet22, 10);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods25.addElementToSet(intSet45, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        simpleMethods25.addElementToSet(intSet63, 0);
        simpleMethods21.addElementToSet(intSet63, (-4));
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 0, 3, (-10), (-1), 1, (-1), 7, (-6) };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods21.addElementToSet(intSet80, 6);
        simpleMethods0.addElementToSet(intSet80, (int) (short) 100);
        java.lang.Class<?> wildcardClass86 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 0);
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet9 = null;
        simpleMethods8.addElementToSet(intSet9, 10);
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods12.addElementToSet(intSet26, 9);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods12.addElementToSet(intSet32, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        simpleMethods36.addElementToSet(intSet50, 9);
        simpleMethods12.addElementToSet(intSet50, (-2));
        examples.SimpleMethods simpleMethods56 = new examples.SimpleMethods();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet70 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet70, intArray69);
        simpleMethods56.addElementToSet(intSet70, 9);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods56.addElementToSet(intSet76, 0);
        simpleMethods12.addElementToSet(intSet76, (int) (short) -1);
        simpleMethods8.addElementToSet(intSet76, (int) (byte) -1);
        simpleMethods4.addElementToSet(intSet76, 3);
        simpleMethods0.addElementToSet(intSet76, (int) (byte) 10);
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 1);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 5);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 3, 10, 10, 1, 10, 10, (-2), (-7), 0, (-100), 10, 8, (-6) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods0.addElementToSet(intSet58, (int) ' ');
        java.lang.Class<?> wildcardClass62 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods24.addElementToSet(intSet65, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet65, (-3));
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods71.addElementToSet(intSet85, 9);
        simpleMethods0.addElementToSet(intSet85, 2);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-8));
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, 10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 10);
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet22 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet22, intArray21);
        simpleMethods8.addElementToSet(intSet22, 9);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        simpleMethods8.addElementToSet(intSet28, 0);
        examples.SimpleMethods simpleMethods32 = new examples.SimpleMethods();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet46 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        simpleMethods32.addElementToSet(intSet46, 9);
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet73 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet73, intArray72);
        simpleMethods32.addElementToSet(intSet73, (int) (short) 0);
        simpleMethods8.addElementToSet(intSet73, (-3));
        simpleMethods4.addElementToSet(intSet73, 0);
        simpleMethods0.addElementToSet(intSet73, (-2));
        java.util.HashSet<java.lang.Integer> intSet83 = null;
        simpleMethods0.addElementToSet(intSet83, (int) '#');
        java.util.HashSet<java.lang.Integer> intSet86 = null;
        simpleMethods0.addElementToSet(intSet86, (-1));
        java.lang.Class<?> wildcardClass89 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods41.addElementToSet(intSet61, 0);
        simpleMethods0.addElementToSet(intSet61, 8);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, 4);
        examples.SimpleMethods simpleMethods70 = new examples.SimpleMethods();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods70.addElementToSet(intSet84, 9);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet90 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet90, intArray89);
        simpleMethods70.addElementToSet(intSet90, 0);
        simpleMethods0.addElementToSet(intSet90, (-3));
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (-7));
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        java.util.HashSet<java.lang.Integer> intSet40 = null;
        simpleMethods22.addElementToSet(intSet40, 2);
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods43.addElementToSet(intSet57, 9);
        simpleMethods22.addElementToSet(intSet57, 1);
        simpleMethods4.addElementToSet(intSet57, 5);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods65.addElementToSet(intSet81, (int) (byte) 10);
        simpleMethods4.addElementToSet(intSet81, 9);
        simpleMethods0.addElementToSet(intSet81, (int) (short) 10);
        java.lang.Class<?> wildcardClass89 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods22.addElementToSet(intSet63, (int) (short) 0);
        simpleMethods4.addElementToSet(intSet63, 5);
        examples.SimpleMethods simpleMethods69 = new examples.SimpleMethods();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet83 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet83, intArray82);
        simpleMethods69.addElementToSet(intSet83, 9);
        simpleMethods4.addElementToSet(intSet83, 0);
        simpleMethods0.addElementToSet(intSet83, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-6));
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, 4);
        java.util.HashSet<java.lang.Integer> intSet97 = null;
        simpleMethods0.addElementToSet(intSet97, 100);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet27 = null;
        simpleMethods0.addElementToSet(intSet27, (int) '4');
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet46 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        simpleMethods30.addElementToSet(intSet46, (int) (byte) 10);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods30.addElementToSet(intSet54, 100);
        java.util.HashSet<java.lang.Integer> intSet58 = null;
        simpleMethods30.addElementToSet(intSet58, 9);
        java.util.HashSet<java.lang.Integer> intSet61 = null;
        simpleMethods30.addElementToSet(intSet61, 10);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        simpleMethods30.addElementToSet(intSet78, (int) (byte) 0);
        simpleMethods0.addElementToSet(intSet78, (int) '4');
        java.lang.Class<?> wildcardClass86 = intSet78.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods41.addElementToSet(intSet61, 0);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods65.addElementToSet(intSet85, 0);
        simpleMethods41.addElementToSet(intSet85, 8);
        simpleMethods0.addElementToSet(intSet85, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (-9));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, (int) (byte) 100);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet64 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet64, intArray63);
        simpleMethods44.addElementToSet(intSet64, 0);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods68.addElementToSet(intSet88, 0);
        simpleMethods44.addElementToSet(intSet88, 0);
        simpleMethods0.addElementToSet(intSet88, (int) 'a');
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods5 = new examples.SimpleMethods();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet19 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        simpleMethods5.addElementToSet(intSet19, 9);
        java.util.HashSet<java.lang.Integer> intSet23 = null;
        simpleMethods5.addElementToSet(intSet23, 2);
        examples.SimpleMethods simpleMethods26 = new examples.SimpleMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        simpleMethods26.addElementToSet(intSet40, 9);
        simpleMethods5.addElementToSet(intSet40, 100);
        simpleMethods4.addElementToSet(intSet40, (int) (byte) -1);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods49.addElementToSet(intSet67, 2);
        examples.SimpleMethods simpleMethods70 = new examples.SimpleMethods();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods70.addElementToSet(intSet84, 9);
        simpleMethods49.addElementToSet(intSet84, 100);
        simpleMethods48.addElementToSet(intSet84, (int) (byte) -1);
        simpleMethods4.addElementToSet(intSet84, (-9));
        simpleMethods0.addElementToSet(intSet84, 8);
        java.lang.Class<?> wildcardClass96 = intSet84.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.util.HashSet<java.lang.Integer> intSet42 = null;
        simpleMethods24.addElementToSet(intSet42, 2);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        simpleMethods24.addElementToSet(intSet59, 1);
        simpleMethods0.addElementToSet(intSet59, (-1));
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, 100);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-1));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (-100));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        simpleMethods14.addElementToSet(intSet28, 9);
        java.util.HashSet<java.lang.Integer> intSet32 = null;
        simpleMethods14.addElementToSet(intSet32, 2);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods35.addElementToSet(intSet49, 9);
        simpleMethods14.addElementToSet(intSet49, 100);
        simpleMethods13.addElementToSet(intSet49, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet49, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods5 = new examples.SimpleMethods();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet19 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        simpleMethods5.addElementToSet(intSet19, 9);
        java.util.HashSet<java.lang.Integer> intSet23 = null;
        simpleMethods5.addElementToSet(intSet23, 2);
        examples.SimpleMethods simpleMethods26 = new examples.SimpleMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        simpleMethods26.addElementToSet(intSet40, 9);
        simpleMethods5.addElementToSet(intSet40, (-100));
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 3, 100, (-9), 5, 5, (-7), (-1), 1, 100, 0, 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4 };
        java.util.HashSet<java.lang.Integer> intSet69 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet69, intArray68);
        simpleMethods5.addElementToSet(intSet69, 9);
        simpleMethods4.addElementToSet(intSet69, 0);
        simpleMethods0.addElementToSet(intSet69, (-9));
        java.util.HashSet<java.lang.Integer> intSet77 = null;
        simpleMethods0.addElementToSet(intSet77, 0);
        java.util.HashSet<java.lang.Integer> intSet80 = null;
        simpleMethods0.addElementToSet(intSet80, (-100));
        java.lang.Class<?> wildcardClass83 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods20.addElementToSet(intSet34, 9);
        java.util.HashSet<java.lang.Integer> intSet38 = null;
        simpleMethods20.addElementToSet(intSet38, 2);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        simpleMethods20.addElementToSet(intSet55, 100);
        examples.SimpleMethods simpleMethods61 = new examples.SimpleMethods();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet75 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet75, intArray74);
        simpleMethods61.addElementToSet(intSet75, 9);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods61.addElementToSet(intSet81, 0);
        simpleMethods20.addElementToSet(intSet81, 8);
        simpleMethods0.addElementToSet(intSet81, (-100));
        java.lang.Class<?> wildcardClass89 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-2));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods44.addElementToSet(intSet85, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet85, 10);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-2));
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, (int) (short) 100);
        java.lang.Class<?> wildcardClass97 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 0, 3, (-2), 0, 100, (-10), 8, 0, (-1), (-4), 100, 4, 1, (-3), (-3), 3, 10, (-5), 0, 1, 9, (-5), (-5), 100 };
        java.util.HashSet<java.lang.Integer> intSet29 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet29, intArray28);
        simpleMethods0.addElementToSet(intSet29, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet33 = null;
        simpleMethods0.addElementToSet(intSet33, 1);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        simpleMethods36.addElementToSet(intSet50, 9);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods36.addElementToSet(intSet56, 0);
        examples.SimpleMethods simpleMethods60 = new examples.SimpleMethods();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet74 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet74, intArray73);
        simpleMethods60.addElementToSet(intSet74, 9);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods60.addElementToSet(intSet80, 0);
        simpleMethods36.addElementToSet(intSet80, 8);
        simpleMethods0.addElementToSet(intSet80, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (int) (byte) 10);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods23 = new examples.SimpleMethods();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        simpleMethods23.addElementToSet(intSet37, 9);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet43 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet43, intArray42);
        simpleMethods23.addElementToSet(intSet43, 0);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods47.addElementToSet(intSet61, 9);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods47.addElementToSet(intSet65, 2);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        simpleMethods47.addElementToSet(intSet82, 1);
        simpleMethods23.addElementToSet(intSet82, (-1));
        simpleMethods22.addElementToSet(intSet82, (-5));
        simpleMethods21.addElementToSet(intSet82, (-2));
        simpleMethods0.addElementToSet(intSet82, (-8));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet21 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        simpleMethods7.addElementToSet(intSet21, 9);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods7.addElementToSet(intSet27, 0);
        java.util.HashSet<java.lang.Integer> intSet31 = null;
        simpleMethods7.addElementToSet(intSet31, (int) (short) 10);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet35 = null;
        simpleMethods34.addElementToSet(intSet35, 10);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods38.addElementToSet(intSet39, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods44.addElementToSet(intSet62, 2);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods44.addElementToSet(intSet79, 100);
        simpleMethods43.addElementToSet(intSet79, (int) (byte) -1);
        simpleMethods42.addElementToSet(intSet79, 8);
        simpleMethods38.addElementToSet(intSet79, 8);
        simpleMethods34.addElementToSet(intSet79, (-100));
        simpleMethods7.addElementToSet(intSet79, 100);
        simpleMethods0.addElementToSet(intSet79, (int) (short) -1);
        java.lang.Class<?> wildcardClass97 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 2);
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 0, 3, (-2), 0, 100, (-10), 8, 0, (-1), (-4), 100, 4, 1, (-3), (-3), 3, 10, (-5), 0, 1, 9, (-5), (-5), 100 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods4.addElementToSet(intSet33, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet33, 10);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods7.addElementToSet(intSet8, 0);
        java.util.HashSet<java.lang.Integer> intSet11 = null;
        simpleMethods7.addElementToSet(intSet11, 10);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        simpleMethods14.addElementToSet(intSet28, 9);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods14.addElementToSet(intSet34, 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods38.addElementToSet(intSet52, 9);
        simpleMethods14.addElementToSet(intSet52, (-2));
        simpleMethods7.addElementToSet(intSet52, (-9));
        simpleMethods0.addElementToSet(intSet52, (-10));
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods0.addElementToSet(intSet62, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods0.addElementToSet(intSet65, (-3));
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods0.addElementToSet(intSet68, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet71 = null;
        simpleMethods0.addElementToSet(intSet71, 6);
        java.lang.Class<?> wildcardClass74 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods0.addElementToSet(intSet21, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.util.HashSet<java.lang.Integer> intSet42 = null;
        simpleMethods24.addElementToSet(intSet42, 7);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        java.util.HashSet<java.lang.Integer> intSet63 = null;
        simpleMethods45.addElementToSet(intSet63, 2);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods66.addElementToSet(intSet80, 9);
        simpleMethods45.addElementToSet(intSet80, 1);
        simpleMethods24.addElementToSet(intSet80, 1);
        simpleMethods0.addElementToSet(intSet80, (int) (short) 10);
        java.lang.Class<?> wildcardClass90 = intSet80.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, (-100));
        simpleMethods0.addElementToSet(intSet56, (-1));
        java.util.HashSet<java.lang.Integer> intSet64 = null;
        simpleMethods0.addElementToSet(intSet64, (int) (byte) 100);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, 0);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (int) '4');
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 1);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 3);
        java.lang.Class<?> wildcardClass79 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods4.addElementToSet(intSet24, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods4.addElementToSet(intSet42, (-10));
        simpleMethods0.addElementToSet(intSet42, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (int) '#');
        java.util.HashSet<java.lang.Integer> intSet53 = null;
        simpleMethods0.addElementToSet(intSet53, (-5));
        java.lang.Class<?> wildcardClass56 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (int) ' ');
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods21.addElementToSet(intSet22, 0);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods25.addElementToSet(intSet45, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        simpleMethods25.addElementToSet(intSet63, (-10));
        simpleMethods21.addElementToSet(intSet63, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet63, (int) (byte) 1);
        java.lang.Class<?> wildcardClass73 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet27 = null;
        simpleMethods0.addElementToSet(intSet27, (int) '4');
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet31 = null;
        simpleMethods30.addElementToSet(intSet31, 0);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet35 = null;
        simpleMethods34.addElementToSet(intSet35, 10);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods38.addElementToSet(intSet52, 9);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods38.addElementToSet(intSet58, 0);
        examples.SimpleMethods simpleMethods62 = new examples.SimpleMethods();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods62.addElementToSet(intSet76, 9);
        simpleMethods38.addElementToSet(intSet76, 0);
        simpleMethods34.addElementToSet(intSet76, (-4));
        simpleMethods30.addElementToSet(intSet76, (-1));
        simpleMethods0.addElementToSet(intSet76, 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 4);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 6);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, (-6));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods0.addElementToSet(intSet79, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, 6);
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, (-2));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (int) ' ');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 0);
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods4.addElementToSet(intSet8, 10);
        examples.SimpleMethods simpleMethods11 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods12 = new examples.SimpleMethods();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet26 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet26, intArray25);
        simpleMethods12.addElementToSet(intSet26, 9);
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods12.addElementToSet(intSet32, 0);
        examples.SimpleMethods simpleMethods36 = new examples.SimpleMethods();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet50 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet50, intArray49);
        simpleMethods36.addElementToSet(intSet50, 9);
        java.util.HashSet<java.lang.Integer> intSet54 = null;
        simpleMethods36.addElementToSet(intSet54, 2);
        examples.SimpleMethods simpleMethods57 = new examples.SimpleMethods();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods57.addElementToSet(intSet71, 9);
        simpleMethods36.addElementToSet(intSet71, 1);
        simpleMethods12.addElementToSet(intSet71, (-1));
        simpleMethods11.addElementToSet(intSet71, (-5));
        simpleMethods4.addElementToSet(intSet71, 100);
        simpleMethods0.addElementToSet(intSet71, 8);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, (-100));
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 3);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, 100);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods47.addElementToSet(intSet61, 9);
        java.util.HashSet<java.lang.Integer> intSet65 = null;
        simpleMethods47.addElementToSet(intSet65, 2);
        examples.SimpleMethods simpleMethods68 = new examples.SimpleMethods();
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods68.addElementToSet(intSet82, 9);
        simpleMethods47.addElementToSet(intSet82, 1);
        simpleMethods0.addElementToSet(intSet82, 5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet21 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        simpleMethods7.addElementToSet(intSet21, 9);
        java.util.HashSet<java.lang.Integer> intSet25 = null;
        simpleMethods7.addElementToSet(intSet25, (int) (byte) 10);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods28.addElementToSet(intSet48, 0);
        examples.SimpleMethods simpleMethods52 = new examples.SimpleMethods();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods52.addElementToSet(intSet66, 9);
        simpleMethods28.addElementToSet(intSet66, (-2));
        simpleMethods7.addElementToSet(intSet66, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet66, 0);
        examples.SimpleMethods simpleMethods76 = new examples.SimpleMethods();
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet92 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet92, intArray91);
        simpleMethods76.addElementToSet(intSet92, (int) (byte) 10);
        simpleMethods0.addElementToSet(intSet92, 100);
        java.lang.Class<?> wildcardClass98 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet5 = null;
        simpleMethods4.addElementToSet(intSet5, 0);
        examples.SimpleMethods simpleMethods8 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods9 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods10 = new examples.SimpleMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods10.addElementToSet(intSet24, 9);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods10.addElementToSet(intSet28, 2);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods31.addElementToSet(intSet45, 9);
        simpleMethods10.addElementToSet(intSet45, 100);
        simpleMethods9.addElementToSet(intSet45, (int) (byte) -1);
        simpleMethods8.addElementToSet(intSet45, 8);
        simpleMethods4.addElementToSet(intSet45, 8);
        simpleMethods0.addElementToSet(intSet45, (-100));
        java.util.HashSet<java.lang.Integer> intSet59 = null;
        simpleMethods0.addElementToSet(intSet59, 7);
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods0.addElementToSet(intSet62, (int) ' ');
        java.lang.Class<?> wildcardClass65 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.util.HashSet<java.lang.Integer> intSet43 = null;
        simpleMethods25.addElementToSet(intSet43, 2);
        examples.SimpleMethods simpleMethods46 = new examples.SimpleMethods();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods46.addElementToSet(intSet60, 9);
        simpleMethods25.addElementToSet(intSet60, (-100));
        simpleMethods4.addElementToSet(intSet60, (-1));
        java.util.HashSet<java.lang.Integer> intSet68 = null;
        simpleMethods4.addElementToSet(intSet68, (-1));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-5), (-10), 1, (-2), 3, 7, (-2), 7, 1, (-9), 0, (-7), (-8) };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods4.addElementToSet(intSet85, 9);
        simpleMethods0.addElementToSet(intSet85, (-3));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, 8);
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, (-1));
        java.lang.Class<?> wildcardClass97 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, (-1));
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods0.addElementToSet(intSet21, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods4.addElementToSet(intSet22, 2);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        simpleMethods4.addElementToSet(intSet39, 1);
        simpleMethods0.addElementToSet(intSet39, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, (int) (byte) 1);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, 0);
        examples.SimpleMethods simpleMethods53 = new examples.SimpleMethods();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods53.addElementToSet(intSet67, 9);
        java.util.HashSet<java.lang.Integer> intSet71 = null;
        simpleMethods53.addElementToSet(intSet71, 2);
        examples.SimpleMethods simpleMethods74 = new examples.SimpleMethods();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet88 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet88, intArray87);
        simpleMethods74.addElementToSet(intSet88, 9);
        simpleMethods53.addElementToSet(intSet88, 1);
        simpleMethods0.addElementToSet(intSet88, 7);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 0);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (-4));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods21.addElementToSet(intSet22, 10);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet66 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet66, intArray65);
        simpleMethods25.addElementToSet(intSet66, (int) (short) 0);
        java.lang.Integer[] intArray81 = new java.lang.Integer[] { 1, (-1), (-10), 1, 10, 6, 8, (-3), 10, 10, 10 };
        java.util.HashSet<java.lang.Integer> intSet82 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet82, intArray81);
        simpleMethods25.addElementToSet(intSet82, (int) (byte) -1);
        simpleMethods21.addElementToSet(intSet82, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet82, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (-6));
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (-6));
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods2 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods2.addElementToSet(intSet16, 9);
        java.util.HashSet<java.lang.Integer> intSet20 = null;
        simpleMethods2.addElementToSet(intSet20, 2);
        examples.SimpleMethods simpleMethods23 = new examples.SimpleMethods();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet37 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet37, intArray36);
        simpleMethods23.addElementToSet(intSet37, 9);
        simpleMethods2.addElementToSet(intSet37, 100);
        simpleMethods1.addElementToSet(intSet37, (int) (byte) -1);
        simpleMethods0.addElementToSet(intSet37, 8);
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, (-9));
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-2), 100, 2, 1, (-7), (-1) };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods0.addElementToSet(intSet57, 0);
        java.util.HashSet<java.lang.Integer> intSet61 = null;
        simpleMethods0.addElementToSet(intSet61, (int) 'a');
        java.util.HashSet<java.lang.Integer> intSet64 = null;
        simpleMethods0.addElementToSet(intSet64, (-6));
        java.lang.Class<?> wildcardClass67 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        java.util.HashSet<java.lang.Integer> intSet27 = null;
        simpleMethods0.addElementToSet(intSet27, (int) '4');
        examples.SimpleMethods simpleMethods30 = new examples.SimpleMethods();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet46 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet46, intArray45);
        simpleMethods30.addElementToSet(intSet46, (int) (byte) 10);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet54 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet54, intArray53);
        simpleMethods30.addElementToSet(intSet54, 100);
        java.util.HashSet<java.lang.Integer> intSet58 = null;
        simpleMethods30.addElementToSet(intSet58, 9);
        java.util.HashSet<java.lang.Integer> intSet61 = null;
        simpleMethods30.addElementToSet(intSet61, 10);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        simpleMethods30.addElementToSet(intSet78, (int) (byte) 0);
        simpleMethods0.addElementToSet(intSet78, (int) '4');
        java.lang.Class<?> wildcardClass86 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods5 = new examples.SimpleMethods();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet19 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        simpleMethods5.addElementToSet(intSet19, 9);
        java.util.HashSet<java.lang.Integer> intSet23 = null;
        simpleMethods5.addElementToSet(intSet23, 2);
        examples.SimpleMethods simpleMethods26 = new examples.SimpleMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        simpleMethods26.addElementToSet(intSet40, 9);
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods44.addElementToSet(intSet85, (int) (short) 0);
        simpleMethods26.addElementToSet(intSet85, 1);
        simpleMethods5.addElementToSet(intSet85, 0);
        simpleMethods4.addElementToSet(intSet85, (int) (short) 1);
        simpleMethods0.addElementToSet(intSet85, 0);
        java.util.HashSet<java.lang.Integer> intSet97 = null;
        simpleMethods0.addElementToSet(intSet97, 2);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet15 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        simpleMethods1.addElementToSet(intSet15, 9);
        java.util.HashSet<java.lang.Integer> intSet19 = null;
        simpleMethods1.addElementToSet(intSet19, 2);
        examples.SimpleMethods simpleMethods22 = new examples.SimpleMethods();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet36 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet36, intArray35);
        simpleMethods22.addElementToSet(intSet36, 9);
        simpleMethods1.addElementToSet(intSet36, 100);
        simpleMethods0.addElementToSet(intSet36, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods0.addElementToSet(intSet44, (-3));
        java.util.HashSet<java.lang.Integer> intSet47 = null;
        simpleMethods0.addElementToSet(intSet47, (int) 'a');
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (-7));
        java.lang.Class<?> wildcardClass53 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods27.addElementToSet(intSet41, 9);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        simpleMethods27.addElementToSet(intSet47, 0);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        simpleMethods27.addElementToSet(intSet65, (-10));
        simpleMethods0.addElementToSet(intSet65, (-2));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 1);
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, 5);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 3, 10, 10, 1, 10, 10, (-2), (-7), 0, (-100), 10, 8, (-6) };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods0.addElementToSet(intSet58, (int) ' ');
        java.lang.Class<?> wildcardClass62 = intSet58.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods1 = new examples.SimpleMethods();
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet15 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet15, intArray14);
        simpleMethods1.addElementToSet(intSet15, 9);
        examples.SimpleMethods simpleMethods19 = new examples.SimpleMethods();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet33 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet33, intArray32);
        simpleMethods19.addElementToSet(intSet33, 9);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods19.addElementToSet(intSet60, (int) (short) 0);
        simpleMethods1.addElementToSet(intSet60, 1);
        examples.SimpleMethods simpleMethods66 = new examples.SimpleMethods();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet80 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet80, intArray79);
        simpleMethods66.addElementToSet(intSet80, 9);
        simpleMethods1.addElementToSet(intSet80, (int) (short) 100);
        simpleMethods0.addElementToSet(intSet80, (-1));
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, 4);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-9));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet21 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        simpleMethods7.addElementToSet(intSet21, 9);
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods7.addElementToSet(intSet27, 0);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods31.addElementToSet(intSet45, 9);
        simpleMethods7.addElementToSet(intSet45, (-10));
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods51.addElementToSet(intSet71, 0);
        simpleMethods7.addElementToSet(intSet71, (-1));
        simpleMethods0.addElementToSet(intSet71, (int) (short) 100);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, (int) (short) 1);
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 7);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet22 = null;
        simpleMethods21.addElementToSet(intSet22, 0);
        examples.SimpleMethods simpleMethods25 = new examples.SimpleMethods();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet39 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet39, intArray38);
        simpleMethods25.addElementToSet(intSet39, 9);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods25.addElementToSet(intSet45, 0);
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        simpleMethods25.addElementToSet(intSet63, (-10));
        simpleMethods21.addElementToSet(intSet63, (int) (short) 10);
        simpleMethods0.addElementToSet(intSet63, 4);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, 3);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, (-6));
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, 9);
        java.lang.Class<?> wildcardClass82 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods20.addElementToSet(intSet34, 9);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        simpleMethods20.addElementToSet(intSet40, 0);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods20.addElementToSet(intSet44, (int) (short) 10);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods47.addElementToSet(intSet61, 9);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods47.addElementToSet(intSet67, 0);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods71.addElementToSet(intSet85, 9);
        simpleMethods47.addElementToSet(intSet85, (-2));
        simpleMethods20.addElementToSet(intSet85, 3);
        simpleMethods0.addElementToSet(intSet85, 0);
        java.lang.Class<?> wildcardClass95 = intSet85.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods0.addElementToSet(intSet24, 100);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet29 = null;
        simpleMethods28.addElementToSet(intSet29, 0);
        java.util.HashSet<java.lang.Integer> intSet32 = null;
        simpleMethods28.addElementToSet(intSet32, 10);
        examples.SimpleMethods simpleMethods35 = new examples.SimpleMethods();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet49 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet49, intArray48);
        simpleMethods35.addElementToSet(intSet49, 9);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods35.addElementToSet(intSet76, (int) (short) 0);
        simpleMethods28.addElementToSet(intSet76, 5);
        simpleMethods0.addElementToSet(intSet76, (int) (short) 100);
        java.lang.Class<?> wildcardClass84 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        examples.SimpleMethods simpleMethods10 = new examples.SimpleMethods();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods10.addElementToSet(intSet24, 9);
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods10.addElementToSet(intSet28, 2);
        examples.SimpleMethods simpleMethods31 = new examples.SimpleMethods();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet45 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet45, intArray44);
        simpleMethods31.addElementToSet(intSet45, 9);
        simpleMethods10.addElementToSet(intSet45, 1);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        java.util.HashSet<java.lang.Integer> intSet69 = null;
        simpleMethods51.addElementToSet(intSet69, 2);
        examples.SimpleMethods simpleMethods72 = new examples.SimpleMethods();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet86 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet86, intArray85);
        simpleMethods72.addElementToSet(intSet86, 9);
        simpleMethods51.addElementToSet(intSet86, 100);
        simpleMethods10.addElementToSet(intSet86, (int) (byte) 100);
        simpleMethods0.addElementToSet(intSet86, (int) (byte) 10);
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (int) '4');
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods41.addElementToSet(intSet61, 0);
        simpleMethods0.addElementToSet(intSet61, 8);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, 9);
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, (-7));
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (int) '4');
        java.lang.Class<?> wildcardClass76 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet28 = null;
        simpleMethods27.addElementToSet(intSet28, 0);
        java.util.HashSet<java.lang.Integer> intSet31 = null;
        simpleMethods27.addElementToSet(intSet31, 10);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet35 = null;
        simpleMethods34.addElementToSet(intSet35, 0);
        java.util.HashSet<java.lang.Integer> intSet38 = null;
        simpleMethods34.addElementToSet(intSet38, 10);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods41.addElementToSet(intSet61, 0);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods41.addElementToSet(intSet79, (-2));
        simpleMethods34.addElementToSet(intSet79, (-9));
        simpleMethods27.addElementToSet(intSet79, (-10));
        simpleMethods0.addElementToSet(intSet79, (-5));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, 0);
        java.lang.Class<?> wildcardClass94 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10, (-6), 3, (-4), 2, 100, 7, 5, 8, (-2), (-7), (-2), (-1), 8, 3, (-3), 1, 2, (-3), 8, (-7), (-9), (-2), (-2), 3, (-10), (-5) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods0.addElementToSet(intSet38, 0);
        java.lang.Class<?> wildcardClass42 = intSet38.getClass();
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        java.util.HashSet<java.lang.Integer> intSet24 = null;
        simpleMethods0.addElementToSet(intSet24, (int) (short) 10);
        examples.SimpleMethods simpleMethods27 = new examples.SimpleMethods();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet41 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet41, intArray40);
        simpleMethods27.addElementToSet(intSet41, 9);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet47 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet47, intArray46);
        simpleMethods27.addElementToSet(intSet47, 0);
        examples.SimpleMethods simpleMethods51 = new examples.SimpleMethods();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet65 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet65, intArray64);
        simpleMethods51.addElementToSet(intSet65, 9);
        simpleMethods27.addElementToSet(intSet65, (-2));
        simpleMethods0.addElementToSet(intSet65, 3);
        java.util.HashSet<java.lang.Integer> intSet73 = null;
        simpleMethods0.addElementToSet(intSet73, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, 3);
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, (-2));
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, (int) (short) 1);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, 10);
        java.lang.Class<?> wildcardClass88 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 2);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 4);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet8 = null;
        simpleMethods7.addElementToSet(intSet8, 2);
        java.util.HashSet<java.lang.Integer> intSet11 = null;
        simpleMethods7.addElementToSet(intSet11, 4);
        examples.SimpleMethods simpleMethods14 = new examples.SimpleMethods();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet28 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet28, intArray27);
        simpleMethods14.addElementToSet(intSet28, 9);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods14.addElementToSet(intSet34, 0);
        examples.SimpleMethods simpleMethods38 = new examples.SimpleMethods();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet52 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet52, intArray51);
        simpleMethods38.addElementToSet(intSet52, 9);
        simpleMethods14.addElementToSet(intSet52, 0);
        simpleMethods7.addElementToSet(intSet52, (-100));
        simpleMethods0.addElementToSet(intSet52, 8);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        java.util.HashSet<java.lang.Integer> intSet39 = null;
        simpleMethods21.addElementToSet(intSet39, 2);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        simpleMethods21.addElementToSet(intSet56, (-100));
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 3, 100, (-9), 5, 5, (-7), (-1), 1, 100, 0, 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods21.addElementToSet(intSet85, 9);
        simpleMethods0.addElementToSet(intSet85, (-8));
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (-1));
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, (int) (byte) 100);
        java.util.HashSet<java.lang.Integer> intSet97 = null;
        simpleMethods0.addElementToSet(intSet97, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        java.util.HashSet<java.lang.Integer> intSet21 = null;
        simpleMethods0.addElementToSet(intSet21, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.util.HashSet<java.lang.Integer> intSet42 = null;
        simpleMethods24.addElementToSet(intSet42, 2);
        examples.SimpleMethods simpleMethods45 = new examples.SimpleMethods();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods45.addElementToSet(intSet59, 9);
        simpleMethods24.addElementToSet(intSet59, 100);
        simpleMethods0.addElementToSet(intSet59, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, 4);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, (-100));
        java.util.HashSet<java.lang.Integer> intSet41 = null;
        simpleMethods0.addElementToSet(intSet41, (int) (byte) -1);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 5, (-4), 9, 3, 0, 6, (-1), (-3), (-5), 4, 8, (-8), (-8), 0, (-3) };
        java.util.HashSet<java.lang.Integer> intSet60 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet60, intArray59);
        simpleMethods0.addElementToSet(intSet60, 1);
        java.util.HashSet<java.lang.Integer> intSet64 = null;
        simpleMethods0.addElementToSet(intSet64, 9);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, 10);
        java.lang.Class<?> wildcardClass70 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet16 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet16, intArray15);
        simpleMethods0.addElementToSet(intSet16, (int) (byte) 10);
        examples.SimpleMethods simpleMethods20 = new examples.SimpleMethods();
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet34 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet34, intArray33);
        simpleMethods20.addElementToSet(intSet34, 9);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        simpleMethods20.addElementToSet(intSet40, 0);
        java.util.HashSet<java.lang.Integer> intSet44 = null;
        simpleMethods20.addElementToSet(intSet44, (int) (short) 10);
        examples.SimpleMethods simpleMethods47 = new examples.SimpleMethods();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods47.addElementToSet(intSet61, 9);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet67 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet67, intArray66);
        simpleMethods47.addElementToSet(intSet67, 0);
        examples.SimpleMethods simpleMethods71 = new examples.SimpleMethods();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet85 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet85, intArray84);
        simpleMethods71.addElementToSet(intSet85, 9);
        simpleMethods47.addElementToSet(intSet85, (-2));
        simpleMethods20.addElementToSet(intSet85, 3);
        simpleMethods0.addElementToSet(intSet85, 0);
        java.lang.Class<?> wildcardClass95 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet44 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet44, intArray43);
        simpleMethods24.addElementToSet(intSet44, 0);
        simpleMethods0.addElementToSet(intSet44, 8);
        java.util.HashSet<java.lang.Integer> intSet50 = null;
        simpleMethods0.addElementToSet(intSet50, (-2));
        java.util.HashSet<java.lang.Integer> intSet53 = null;
        simpleMethods0.addElementToSet(intSet53, (int) (short) -1);
        java.util.HashSet<java.lang.Integer> intSet56 = null;
        simpleMethods0.addElementToSet(intSet56, 100);
        java.util.HashSet<java.lang.Integer> intSet59 = null;
        simpleMethods0.addElementToSet(intSet59, 6);
        java.util.HashSet<java.lang.Integer> intSet62 = null;
        simpleMethods0.addElementToSet(intSet62, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 10, 1, 4, (-4), 1, (-1), 0, (-7), (-100), 2, (-7), 8, (-5), (-6) };
        java.util.HashSet<java.lang.Integer> intSet81 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet81, intArray80);
        simpleMethods65.addElementToSet(intSet81, (int) (byte) 10);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 0, 8, 4 };
        java.util.HashSet<java.lang.Integer> intSet89 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        simpleMethods65.addElementToSet(intSet89, 100);
        simpleMethods0.addElementToSet(intSet89, (-5));
        java.util.HashSet<java.lang.Integer> intSet95 = null;
        simpleMethods0.addElementToSet(intSet95, (-2));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods5 = new examples.SimpleMethods();
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet19 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet19, intArray18);
        simpleMethods5.addElementToSet(intSet19, 9);
        java.util.HashSet<java.lang.Integer> intSet23 = null;
        simpleMethods5.addElementToSet(intSet23, 2);
        examples.SimpleMethods simpleMethods26 = new examples.SimpleMethods();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet40 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet40, intArray39);
        simpleMethods26.addElementToSet(intSet40, 9);
        simpleMethods5.addElementToSet(intSet40, 100);
        simpleMethods4.addElementToSet(intSet40, (int) (byte) -1);
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods49 = new examples.SimpleMethods();
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet63 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet63, intArray62);
        simpleMethods49.addElementToSet(intSet63, 9);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods49.addElementToSet(intSet67, 2);
        examples.SimpleMethods simpleMethods70 = new examples.SimpleMethods();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods70.addElementToSet(intSet84, 9);
        simpleMethods49.addElementToSet(intSet84, 100);
        simpleMethods48.addElementToSet(intSet84, (int) (byte) -1);
        simpleMethods4.addElementToSet(intSet84, (-9));
        simpleMethods0.addElementToSet(intSet84, 8);
        java.lang.Class<?> wildcardClass96 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        java.util.HashSet<java.lang.Integer> intSet7 = null;
        simpleMethods0.addElementToSet(intSet7, 7);
        java.util.HashSet<java.lang.Integer> intSet10 = null;
        simpleMethods0.addElementToSet(intSet10, (int) (byte) 0);
        examples.SimpleMethods simpleMethods13 = new examples.SimpleMethods();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet27 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet27, intArray26);
        simpleMethods13.addElementToSet(intSet27, 9);
        java.util.HashSet<java.lang.Integer> intSet31 = null;
        simpleMethods13.addElementToSet(intSet31, 2);
        examples.SimpleMethods simpleMethods34 = new examples.SimpleMethods();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet48 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet48, intArray47);
        simpleMethods34.addElementToSet(intSet48, 9);
        simpleMethods13.addElementToSet(intSet48, 100);
        examples.SimpleMethods simpleMethods54 = new examples.SimpleMethods();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods54.addElementToSet(intSet68, 9);
        java.util.HashSet<java.lang.Integer> intSet72 = null;
        simpleMethods54.addElementToSet(intSet72, 2);
        examples.SimpleMethods simpleMethods75 = new examples.SimpleMethods();
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet89 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet89, intArray88);
        simpleMethods75.addElementToSet(intSet89, 9);
        simpleMethods54.addElementToSet(intSet89, (-100));
        simpleMethods13.addElementToSet(intSet89, 7);
        simpleMethods0.addElementToSet(intSet89, (-7));
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 10);
        examples.SimpleMethods simpleMethods4 = new examples.SimpleMethods();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet18 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet18, intArray17);
        simpleMethods4.addElementToSet(intSet18, 9);
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet24 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet24, intArray23);
        simpleMethods4.addElementToSet(intSet24, 0);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods4.addElementToSet(intSet42, (-2));
        examples.SimpleMethods simpleMethods48 = new examples.SimpleMethods();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods48.addElementToSet(intSet62, 9);
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet68 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet68, intArray67);
        simpleMethods48.addElementToSet(intSet68, 0);
        simpleMethods4.addElementToSet(intSet68, (int) (short) -1);
        simpleMethods0.addElementToSet(intSet68, (int) (byte) -1);
        java.util.HashSet<java.lang.Integer> intSet76 = null;
        simpleMethods0.addElementToSet(intSet76, (-1));
        java.util.HashSet<java.lang.Integer> intSet79 = null;
        simpleMethods0.addElementToSet(intSet79, (-1));
        java.util.HashSet<java.lang.Integer> intSet82 = null;
        simpleMethods0.addElementToSet(intSet82, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, 5);
        java.lang.Class<?> wildcardClass88 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        simpleMethods0.addElementToSet(intSet38, (-10));
        examples.SimpleMethods simpleMethods44 = new examples.SimpleMethods();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet58 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet58, intArray57);
        simpleMethods44.addElementToSet(intSet58, 9);
        simpleMethods0.addElementToSet(intSet58, (int) (short) 1);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet84 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet84, intArray83);
        simpleMethods64.addElementToSet(intSet84, 0);
        simpleMethods0.addElementToSet(intSet84, 0);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (-8));
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (-8));
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (int) (short) 10);
        java.lang.Class<?> wildcardClass99 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods18.addElementToSet(intSet38, 0);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet56 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet56, intArray55);
        simpleMethods42.addElementToSet(intSet56, 9);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet62 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet62, intArray61);
        simpleMethods42.addElementToSet(intSet62, 0);
        simpleMethods18.addElementToSet(intSet62, 8);
        simpleMethods0.addElementToSet(intSet62, 7);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { (-10), (-3), 0, (-6), 3 };
        java.util.HashSet<java.lang.Integer> intSet76 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet76, intArray75);
        simpleMethods0.addElementToSet(intSet76, (-8));
        java.util.HashSet<java.lang.Integer> intSet80 = null;
        simpleMethods0.addElementToSet(intSet80, 4);
        java.util.HashSet<java.lang.Integer> intSet83 = null;
        simpleMethods0.addElementToSet(intSet83, (int) 'a');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        examples.SimpleMethods simpleMethods18 = new examples.SimpleMethods();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet32 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet32, intArray31);
        simpleMethods18.addElementToSet(intSet32, 9);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { (-6), (-1), (-1), 3, 10, (-2), (-10), (-1), 10, (-1), 4, (-2), (-9), (-3), 4, 10, (-5), 8, 8, 9, 7, 7 };
        java.util.HashSet<java.lang.Integer> intSet59 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet59, intArray58);
        simpleMethods18.addElementToSet(intSet59, (int) (short) 0);
        simpleMethods0.addElementToSet(intSet59, 1);
        examples.SimpleMethods simpleMethods65 = new examples.SimpleMethods();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet79 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet79, intArray78);
        simpleMethods65.addElementToSet(intSet79, 9);
        simpleMethods0.addElementToSet(intSet79, 0);
        java.util.HashSet<java.lang.Integer> intSet85 = null;
        simpleMethods0.addElementToSet(intSet85, (-7));
        java.util.HashSet<java.lang.Integer> intSet88 = null;
        simpleMethods0.addElementToSet(intSet88, (int) (byte) 1);
        java.util.HashSet<java.lang.Integer> intSet91 = null;
        simpleMethods0.addElementToSet(intSet91, (int) '#');
        java.util.HashSet<java.lang.Integer> intSet94 = null;
        simpleMethods0.addElementToSet(intSet94, 7);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.util.HashSet<java.lang.Integer> intSet18 = null;
        simpleMethods0.addElementToSet(intSet18, 2);
        examples.SimpleMethods simpleMethods21 = new examples.SimpleMethods();
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet35 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet35, intArray34);
        simpleMethods21.addElementToSet(intSet35, 9);
        simpleMethods0.addElementToSet(intSet35, 100);
        examples.SimpleMethods simpleMethods41 = new examples.SimpleMethods();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet55 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet55, intArray54);
        simpleMethods41.addElementToSet(intSet55, 9);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet61 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet61, intArray60);
        simpleMethods41.addElementToSet(intSet61, 0);
        simpleMethods0.addElementToSet(intSet61, 8);
        java.util.HashSet<java.lang.Integer> intSet67 = null;
        simpleMethods0.addElementToSet(intSet67, (-7));
        java.util.HashSet<java.lang.Integer> intSet70 = null;
        simpleMethods0.addElementToSet(intSet70, 6);
        java.lang.Class<?> wildcardClass73 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet14 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet14, intArray13);
        simpleMethods0.addElementToSet(intSet14, 9);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { (-3) };
        java.util.HashSet<java.lang.Integer> intSet20 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet20, intArray19);
        simpleMethods0.addElementToSet(intSet20, 0);
        examples.SimpleMethods simpleMethods24 = new examples.SimpleMethods();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet38 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet38, intArray37);
        simpleMethods24.addElementToSet(intSet38, 9);
        examples.SimpleMethods simpleMethods42 = new examples.SimpleMethods();
        examples.SimpleMethods simpleMethods43 = new examples.SimpleMethods();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet57 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet57, intArray56);
        simpleMethods43.addElementToSet(intSet57, 9);
        java.util.HashSet<java.lang.Integer> intSet61 = null;
        simpleMethods43.addElementToSet(intSet61, 2);
        examples.SimpleMethods simpleMethods64 = new examples.SimpleMethods();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet78 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet78, intArray77);
        simpleMethods64.addElementToSet(intSet78, 9);
        simpleMethods43.addElementToSet(intSet78, 100);
        simpleMethods42.addElementToSet(intSet78, (int) (byte) -1);
        simpleMethods24.addElementToSet(intSet78, (-8));
        simpleMethods0.addElementToSet(intSet78, 6);
        java.util.HashSet<java.lang.Integer> intSet90 = null;
        simpleMethods0.addElementToSet(intSet90, (int) ' ');
        java.util.HashSet<java.lang.Integer> intSet93 = null;
        simpleMethods0.addElementToSet(intSet93, (-1));
        java.util.HashSet<java.lang.Integer> intSet96 = null;
        simpleMethods0.addElementToSet(intSet96, (int) '4');
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.util.HashSet<java.lang.Integer> intSet1 = null;
        simpleMethods0.addElementToSet(intSet1, 0);
        java.util.HashSet<java.lang.Integer> intSet4 = null;
        simpleMethods0.addElementToSet(intSet4, 10);
        examples.SimpleMethods simpleMethods7 = new examples.SimpleMethods();
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet21 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet21, intArray20);
        simpleMethods7.addElementToSet(intSet21, 9);
        java.util.HashSet<java.lang.Integer> intSet25 = null;
        simpleMethods7.addElementToSet(intSet25, 2);
        examples.SimpleMethods simpleMethods28 = new examples.SimpleMethods();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { (-1), 8, (-9), (-3), (-1), (-1), 8, 8, (-5), 0, 0, 100 };
        java.util.HashSet<java.lang.Integer> intSet42 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet42, intArray41);
        simpleMethods28.addElementToSet(intSet42, 9);
        simpleMethods7.addElementToSet(intSet42, (-100));
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 3, 100, (-9), 5, 5, (-7), (-1), 1, 100, 0, 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4 };
        java.util.HashSet<java.lang.Integer> intSet71 = new java.util.HashSet<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intSet71, intArray70);
        simpleMethods7.addElementToSet(intSet71, 9);
        simpleMethods0.addElementToSet(intSet71, (-100));
        java.util.HashSet<java.lang.Integer> intSet77 = null;
        simpleMethods0.addElementToSet(intSet77, 5);
        java.util.HashSet<java.lang.Integer> intSet80 = null;
        simpleMethods0.addElementToSet(intSet80, (int) (byte) 1);
        java.util.HashSet<java.lang.Integer> intSet83 = null;
        simpleMethods0.addElementToSet(intSet83, (int) (short) 0);
        java.util.HashSet<java.lang.Integer> intSet86 = null;
        simpleMethods0.addElementToSet(intSet86, (-7));
        java.lang.Class<?> wildcardClass89 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }
}

