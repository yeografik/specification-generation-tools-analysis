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
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        polyupdate8.a(161);
        polyupdate8.a((-8));
        polyupdate8.a(44);
        polyupdate8.a(148);
        polyupdate8.clear();
        polyupdate8.add3(506, 1108, 540, 805);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 641);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-5));
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 112);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 94);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(0, 0, 223, 1);
        int int15 = polyupdate0.sm();
        polyupdate0.a(204);
        polyupdate0.add3(549, 770, 369, 441);
        java.lang.Class<?> wildcardClass23 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 224 + "'", int15 == 224);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.add3(85, 727, 342, 135);
        polyupdate33.add3(212, 135, 179, 229);
        polyupdate33.clear();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        int int35 = polyupdate29.sm();
        int int36 = polyupdate29.sm();
        polyupdate29.a(481);
        polyupdate29.clear();
        int int40 = polyupdate29.sm();
        int int41 = polyupdate29.sm();
        java.lang.Class<?> wildcardClass42 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 150 + "'", int36 == 150);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-15));
        polyupdate35.a(114);
        polyupdate35.a(1473);
        polyupdate35.add3(239, 488, 132, 101);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) (byte) 0, 109, (int) (byte) 0, 0);
        polyupdate29.add3((int) (short) 1, 1, 114, (int) (short) 0);
        int int40 = polyupdate29.sm();
        polyupdate29.clear();
        int int42 = polyupdate29.sm();
        polyupdate29.add3((-3), 1652, 660, 564);
        polyupdate29.add3(176, 3, 134, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 116 + "'", int40 == 116);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 141);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 481);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 717);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1757);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 863);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        polyupdate35.clear();
        polyupdate35.a(226);
        polyupdate35.add3(423, 3307, 85, 701);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 20);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 379);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 124);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 304);
        polyupdate18.add3(2476, 21, 204, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(100, (int) '4', (int) (short) -1, (-3));
        polyupdate0.add3((-1), 427, 44, 543);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        int int32 = polyupdate31.sm();
        polyupdate31.a(775);
        polyupdate31.a(491);
        polyupdate31.add3(288, 535, 123, 114);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 244 + "'", int32 == 244);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 7);
        polyupdate33.add3((-100), 5, 300, 664);
        polyupdate33.a((-15));
        int int41 = polyupdate33.sm();
        polyupdate33.add3(251, 121, 520, 40);
        polyupdate33.clear();
        polyupdate33.a(551);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 854 + "'", int41 == 854);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1111);
        polyupdate39.add3(2067, 124, 1008, 1023);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 211);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 598);
        java.lang.Class<?> wildcardClass40 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(10);
        polyupdate0.add3(99, (-1), 97, 107);
        polyupdate0.clear();
        polyupdate0.a(1014);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(10);
        polyupdate0.add3(164, 308, (int) (byte) 10, 0);
        polyupdate0.add3(6, 7, (-100), 1);
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass21 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        polyupdate33.clear();
        int int35 = polyupdate33.sm();
        polyupdate33.clear();
        java.lang.Class<?> wildcardClass37 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.a(3);
        polyupdate0.a(7);
        polyupdate0.add3((int) (short) 10, (-9), 0, (-4));
        polyupdate0.clear();
        polyupdate0.add3(300, 280, 82, 929);
        java.lang.Class<?> wildcardClass18 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 154);
        java.lang.Class<?> wildcardClass46 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 769);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        polyupdate0.a(3);
        polyupdate0.add3(82, 69, 251, 0);
        java.lang.Class<?> wildcardClass26 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a((-6));
        polyupdate0.add3(107, 110, 103, (-4));
        polyupdate0.clear();
        polyupdate0.add3((-6), 308, 260, 332);
        polyupdate0.add3((int) (short) -1, 6, 1679, (-92));
        java.lang.Class<?> wildcardClass29 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 426);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 11);
        polyupdate39.add3(290, 385, 118, (-5));
        java.lang.Class<?> wildcardClass45 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        polyupdate10.a(6);
        polyupdate10.a(441);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.add3(85, 727, 342, 135);
        polyupdate33.a(1793);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate31.a(100);
        polyupdate31.add3(318, 318, (int) ' ', 69);
        polyupdate31.a(101);
        int int41 = polyupdate31.sm();
        int int42 = polyupdate31.sm();
        int int43 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 939 + "'", int41 == 939);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 939 + "'", int42 == 939);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 939 + "'", int43 == 939);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-92));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 92);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 729);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 2476);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 20);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 532);
        java.lang.Class<?> wildcardClass42 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        int int32 = polyupdate31.sm();
        java.lang.Class<?> wildcardClass33 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 109 + "'", int32 == 109);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 100);
        java.lang.Class<?> wildcardClass34 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        int int30 = polyupdate29.sm();
        polyupdate29.add3(129, 10, 135, 267);
        polyupdate29.a(91);
        polyupdate29.a(1142);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 119 + "'", int30 == 119);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate31.clear();
        polyupdate31.a(597);
        java.lang.Class<?> wildcardClass35 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 161);
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 270 + "'", int40 == 270);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(0);
        polyupdate0.add3(0, 549, 267, 226);
        int int17 = polyupdate0.sm();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass19 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1042 + "'", int17 == 1042);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 176);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 794);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        int int35 = polyupdate29.sm();
        polyupdate29.a((-8));
        polyupdate29.clear();
        polyupdate29.a(10);
        java.lang.Class<?> wildcardClass41 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 20);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 379);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 124);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 426);
        polyupdate18.add3(647, 23, (-8), 950);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-5));
        java.lang.Class<?> wildcardClass13 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 182);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 300);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 440);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        polyupdate12.a(9);
        int int15 = polyupdate12.sm();
        polyupdate12.add3((int) ' ', 2067, 694, 0);
        polyupdate12.add3(636, 116, 854, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 9);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1116);
        java.lang.Class<?> wildcardClass44 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        polyupdate29.clear();
        int int31 = polyupdate29.sm();
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate31.a(218);
        polyupdate31.clear();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(0, 141, (int) (short) 0, 69);
        polyupdate0.clear();
        polyupdate0.a(770);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a(98);
        polyupdate29.a((int) (byte) 100);
        int int34 = polyupdate29.sm();
        int int35 = polyupdate29.sm();
        polyupdate29.add3(1199, 204, (-9), 192);
        polyupdate29.clear();
        int int42 = polyupdate29.sm();
        java.lang.Class<?> wildcardClass43 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 504 + "'", int34 == 504);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 504 + "'", int35 == 504);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.a((int) (byte) 0);
        int int35 = polyupdate27.sm();
        polyupdate27.clear();
        int int37 = polyupdate27.sm();
        int int38 = polyupdate27.sm();
        polyupdate27.add3(121, 432, 514, 2);
        java.lang.Class<?> wildcardClass44 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 135 + "'", int35 == 135);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.clear();
        polyupdate27.a((int) (byte) -1);
        polyupdate27.a(100);
        polyupdate27.clear();
        int int44 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 179);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 415);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 15);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 12);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1308);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 564);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 481);
        polyupdate35.a((-9));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        int int11 = polyupdate0.sm();
        polyupdate0.a(204);
        polyupdate0.a(258);
        polyupdate0.a(1757);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        int int28 = polyupdate25.sm();
        polyupdate25.clear();
        int int30 = polyupdate25.sm();
        polyupdate25.add3(426, 32, 18, (-15));
        polyupdate25.clear();
        polyupdate25.add3(424, 939, 532, 92);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 323 + "'", int28 == 323);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        polyupdate29.a(129);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 223);
        polyupdate39.a(122);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        polyupdate8.add3((int) (short) 0, 829, (-3), 1199);
        polyupdate8.add3(201, 1183, 0, 1899);
        polyupdate8.add3(367, 894, (-15), 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        int int32 = polyupdate31.sm();
        polyupdate31.a(775);
        int int35 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 244 + "'", int32 == 244);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1794 + "'", int35 == 1794);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        polyupdate12.a((int) (short) 1);
        polyupdate12.a(7);
        int int17 = polyupdate12.sm();
        polyupdate12.a(472);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 315 + "'", int17 == 315);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 154);
        polyupdate41.add3(1039, 204, 112, (-6));
        polyupdate41.add3(607, 581, 561, 150);
        int int52 = polyupdate41.sm();
        polyupdate41.add3(218, 1679, 0, 318);
        polyupdate41.clear();
        java.lang.Class<?> wildcardClass59 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1899 + "'", int52 == 1899);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        polyupdate25.a(717);
        int int31 = polyupdate25.sm();
        polyupdate25.a(1280);
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1541 + "'", int31 == 1541);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 223);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 192);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1);
        int int42 = polyupdate41.sm();
        int int43 = polyupdate41.sm();
        polyupdate41.add3(426, (int) (short) 10, 2, (-100));
        polyupdate41.a((int) (short) 1);
        polyupdate41.add3(257, 202, 223, 472);
        polyupdate41.add3(4, 1199, 3514, 300);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 110 + "'", int42 == 110);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 110 + "'", int43 == 110);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (byte) 0);
        polyupdate41.a(20);
        int int44 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 149 + "'", int44 == 149);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        polyupdate0.clear();
        polyupdate0.a(218);
        polyupdate0.add3(470, 1349, 368, 1828);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 260);
        polyupdate41.clear();
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 9);
        polyupdate41.add3((-5), 10, 91, 69);
        polyupdate41.clear();
        int int48 = polyupdate41.sm();
        polyupdate41.add3(141, 192, 3670, 1551);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.a(5);
        int int15 = polyupdate0.sm();
        polyupdate0.a(20);
        polyupdate0.a((int) (short) 100);
        polyupdate0.a(600);
        java.lang.Class<?> wildcardClass22 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 94);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 112);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1122);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate10.a((int) (short) 0);
        polyupdate10.add3(390, 211, 923, 418);
        polyupdate10.add3(0, 540, 218, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        int int32 = polyupdate31.sm();
        polyupdate31.a(607);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 105 + "'", int32 == 105);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 107);
        polyupdate10.clear();
        polyupdate10.add3(1364, 894, 858, 521);
        java.lang.Class<?> wildcardClass17 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        polyupdate31.a(8);
        polyupdate31.add3(107, 99, 1541, 1257);
        java.lang.Class<?> wildcardClass39 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        int int20 = polyupdate0.sm();
        int int21 = polyupdate0.sm();
        int int22 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        polyupdate0.add3(100, (-10), 9, 7);
        polyupdate0.clear();
        polyupdate0.add3(1039, 110, 100, 118);
        polyupdate0.a(214);
        polyupdate0.a(802);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 6);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 260);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1014);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 291);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        java.lang.Class<?> wildcardClass32 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 7);
        polyupdate33.a(2395);
        polyupdate33.clear();
        java.lang.Class<?> wildcardClass37 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a((-6));
        polyupdate0.a(318);
        polyupdate0.add3(161, 21, 300, 99);
        polyupdate0.a(264);
        int int22 = polyupdate0.sm();
        polyupdate0.a(796);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1109 + "'", int22 == 1109);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.add3(209, (-1), 161, 577);
        polyupdate0.a(218);
        polyupdate0.a(2492);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 99);
        polyupdate35.clear();
        polyupdate35.clear();
        polyupdate35.a(543);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 1);
        int int34 = polyupdate33.sm();
        java.lang.Class<?> wildcardClass35 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 110 + "'", int34 == 110);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        int int35 = polyupdate29.sm();
        int int36 = polyupdate29.sm();
        int int37 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 150 + "'", int36 == 150);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 150 + "'", int37 == 150);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 664);
        polyupdate12.a(1364);
        polyupdate12.a(1201);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        polyupdate8.add3((int) (short) 0, (-6), (int) (byte) 10, 107);
        polyupdate8.add3((-8), 123, (int) ' ', 385);
        polyupdate8.add3(660, 100, 658, (-100));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        polyupdate27.add3(9, (-10), 4, 161);
        polyupdate27.a(0);
        polyupdate27.clear();
        java.lang.Class<?> wildcardClass38 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) (byte) 0, 109, (int) (byte) 0, 0);
        polyupdate29.add3((int) (short) 1, 1, 114, (int) (short) 0);
        int int40 = polyupdate29.sm();
        polyupdate29.clear();
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 116 + "'", int40 == 116);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        polyupdate31.add3(161, 10, 154, 104);
        polyupdate31.a(21);
        polyupdate31.a(0);
        polyupdate31.add3(2753, (int) '#', 320, 100);
        polyupdate31.a(1473);
        polyupdate31.add3(135, 1, 440, 794);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 315);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1261);
        polyupdate37.a(97);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 100);
        int int13 = polyupdate12.sm();
        polyupdate12.clear();
        polyupdate12.clear();
        polyupdate12.clear();
        polyupdate12.add3(0, (int) (short) 100, 11, 2395);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        polyupdate0.a(308);
        int int12 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass13 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 770 + "'", int12 == 770);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        int int15 = polyupdate14.sm();
        polyupdate14.a(2753);
        int int18 = polyupdate14.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15) + "'", int15 == (-15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5491 + "'", int18 == 5491);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 418);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 132);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1007);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 207);
        polyupdate45.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 4);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 239);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.add3((int) '4', 9, (int) (short) 1, 7);
        int int9 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(109);
        java.lang.Class<?> wildcardClass13 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        int int34 = polyupdate33.sm();
        int int35 = polyupdate33.sm();
        polyupdate33.add3(280, 409, 1014, 967);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 150 + "'", int34 == 150);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.clear();
        polyupdate33.clear();
        int int36 = polyupdate33.sm();
        polyupdate33.a(143);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 418);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 132);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1007);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 207);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 1023);
        java.lang.Class<?> wildcardClass48 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.a(135);
        polyupdate33.a((int) (byte) 1);
        polyupdate33.a(0);
        polyupdate33.a(859);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 0);
        polyupdate35.a(307);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(69, 209, 6, (-100));
        polyupdate25.clear();
        polyupdate25.add3((int) (byte) -1, 561, 7, 805);
        polyupdate25.clear();
        polyupdate25.add3(152, 239, 729, 839);
        polyupdate25.clear();
        polyupdate25.a(332);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        int int28 = polyupdate25.sm();
        polyupdate25.clear();
        int int30 = polyupdate25.sm();
        polyupdate25.add3(426, 32, 18, (-15));
        polyupdate25.a(323);
        polyupdate25.add3(97, 2492, 116, 1441);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 323 + "'", int28 == 323);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass31 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 179);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 415);
        polyupdate37.clear();
        polyupdate37.a(9);
        polyupdate37.a(1122);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.add3(794, 553, 82, 43);
        java.lang.Class<?> wildcardClass8 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 251);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 597);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1237);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 148);
        polyupdate33.add3(553, 742, 1148, 16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        java.lang.Class<?> wildcardClass32 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.clear();
        int int31 = polyupdate25.sm();
        polyupdate25.add3(0, 1494, 99, 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a(1);
        polyupdate0.add3(737, (int) (short) 10, 0, 100);
        java.lang.Class<?> wildcardClass23 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 1);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 179);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 488);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 426);
        polyupdate41.add3(0, 226, (-7), 69);
        java.lang.Class<?> wildcardClass47 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 226);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 138);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 805);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        polyupdate39.a(20);
        polyupdate39.clear();
        polyupdate39.add3(773, 202, 892, (-1));
        polyupdate39.a(99);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, (int) ' ');
        polyupdate18.add3((-3), 108, 101, (-17));
        int int24 = polyupdate18.sm();
        int int25 = polyupdate18.sm();
        int int26 = polyupdate18.sm();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 189 + "'", int24 == 189);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 189 + "'", int25 == 189);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 189 + "'", int26 == 189);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        polyupdate33.add3(9, 10, (-2), (-6));
        polyupdate33.clear();
        polyupdate33.a(109);
        int int42 = polyupdate33.sm();
        polyupdate33.a(202);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 218 + "'", int42 == 218);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        polyupdate0.a(308);
        polyupdate0.add3(6, 775, 0, (int) (short) 100);
        polyupdate0.a(135);
        polyupdate0.a(2476);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.a(3);
        polyupdate0.a(7);
        polyupdate0.add3(577, 373, 202, 564);
        java.lang.Class<?> wildcardClass12 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        polyupdate0.clear();
        polyupdate0.add3(427, 1473, 314, 150);
        polyupdate0.add3(577, 208, (int) '4', 485);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        polyupdate8.a((-10));
        polyupdate8.clear();
        int int12 = polyupdate8.sm();
        polyupdate8.a(8);
        polyupdate8.a(58);
        polyupdate8.add3((-100), 1451, 1882, 1551);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(69, 209, 6, (-100));
        polyupdate25.add3(264, 202, 58, 440);
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        int int10 = polyupdate0.sm();
        polyupdate0.add3(82, 44, (-9), 92);
        polyupdate0.a(132);
        int int18 = polyupdate0.sm();
        polyupdate0.add3(280, 694, 132, (-6));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 473 + "'", int18 == 473);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        polyupdate33.a((int) (byte) 1);
        polyupdate33.a(1142);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate12.clear();
        polyupdate12.add3(3017, 1188, 86, 199);
        int int19 = polyupdate12.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4490 + "'", int19 == 4490);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        polyupdate25.clear();
        polyupdate25.a(1339);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a((-6));
        polyupdate0.a(9);
        polyupdate0.a((int) '#');
        polyupdate0.add3(141, 109, 0, (int) (short) 1);
        polyupdate0.clear();
        polyupdate0.add3(102, 0, 0, 41);
        int int28 = polyupdate0.sm();
        int int29 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 143 + "'", int28 == 143);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 143 + "'", int29 == 143);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.clear();
        polyupdate10.add3(150, 112, 369, (-92));
        polyupdate10.clear();
        polyupdate10.a(3307);
        polyupdate10.a(499);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        polyupdate12.a(5);
        polyupdate12.add3((int) 'a', 758, 1744, 540);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        polyupdate0.add3(138, 101, 21, 101);
        polyupdate0.a(7);
        polyupdate0.a((-2));
        polyupdate0.add3(18, (int) (short) 0, 520, 144);
        polyupdate0.a(659);
        java.lang.Class<?> wildcardClass23 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.a((int) (byte) 100);
        polyupdate10.add3(91, 5, 226, 10);
        int int18 = polyupdate10.sm();
        polyupdate10.a(10);
        polyupdate10.clear();
        polyupdate10.clear();
        polyupdate10.add3(1873, 805, 141, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 332 + "'", int18 == 332);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 244);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 290);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 109);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 607);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 1111);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 426);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 251);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        java.lang.Class<?> wildcardClass30 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 189);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 118);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 182);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 1757);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 4);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 177);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 197);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        polyupdate29.a(315);
        int int32 = polyupdate29.sm();
        int int33 = polyupdate29.sm();
        polyupdate29.clear();
        polyupdate29.add3(0, 5, 2880, 3514);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 742 + "'", int32 == 742);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 742 + "'", int33 == 742);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        polyupdate25.clear();
        polyupdate25.a(149);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 664);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        polyupdate10.clear();
        int int12 = polyupdate10.sm();
        int int13 = polyupdate10.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        polyupdate31.add3(154, 707, 177, (int) (short) -1);
        java.lang.Class<?> wildcardClass37 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 3670);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        polyupdate0.a(218);
        polyupdate0.add3(261, 929, 793, 1092);
        int int26 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3075 + "'", int26 == 3075);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 109);
        int int32 = polyupdate31.sm();
        java.lang.Class<?> wildcardClass33 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 218 + "'", int32 == 218);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 572);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 659);
        int int42 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 768 + "'", int42 == 768);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 161);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 390);
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 418);
        java.lang.Class<?> wildcardClass13 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        polyupdate0.clear();
        polyupdate0.a(197);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        polyupdate31.clear();
        int int33 = polyupdate31.sm();
        polyupdate31.clear();
        java.lang.Class<?> wildcardClass35 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 112);
        polyupdate35.a(267);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 44);
        polyupdate29.add3(0, 1308, 493, 258);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.a(164);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 197);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 10);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 177);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 3);
        polyupdate12.a(2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.add3(577, 58, 154, 7);
        java.lang.Class<?> wildcardClass35 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 1122);
        int int13 = polyupdate12.sm();
        polyupdate12.add3(0, 641, 561, 122);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1113 + "'", int13 == 1113);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 531);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 481);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 161);
        polyupdate39.a((int) (byte) 10);
        int int42 = polyupdate39.sm();
        polyupdate39.a(384);
        polyupdate39.a(1280);
        polyupdate39.a(758);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 290 + "'", int42 == 290);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a(1);
        polyupdate0.a(1308);
        int int20 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2620 + "'", int20 == 2620);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        int int32 = polyupdate31.sm();
        polyupdate31.add3((-10), 69, 0, (int) (byte) -1);
        int int38 = polyupdate31.sm();
        polyupdate31.clear();
        polyupdate31.add3((-2), 803, 148, 581);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 141 + "'", int32 == 141);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 58 + "'", int38 == 58);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.add3(85, 727, 342, 135);
        polyupdate33.add3(212, 135, 179, 229);
        polyupdate33.clear();
        java.lang.Class<?> wildcardClass45 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        polyupdate10.add3(108, 226, 21, (-6));
        polyupdate10.add3(164, 91, 97, 9);
        java.lang.Class<?> wildcardClass21 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        polyupdate8.a((-10));
        polyupdate8.clear();
        polyupdate8.add3((int) 'a', (-6), 103, 318);
        polyupdate8.a((int) (short) 100);
        polyupdate8.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 20);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 532);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        polyupdate29.add3(0, 577, 98, (-17));
        polyupdate29.add3(318, 101, (int) (byte) 0, 7);
        polyupdate29.clear();
        polyupdate29.a((-5));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        int int34 = polyupdate33.sm();
        polyupdate33.a(1494);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 161 + "'", int34 == 161);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        int int27 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 98);
        polyupdate35.a(775);
        int int38 = polyupdate35.sm();
        polyupdate35.add3((int) (byte) 100, 0, 4, 311);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1757 + "'", int38 == 1757);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        polyupdate10.add3(1, 182, 253, 104);
        polyupdate10.add3(424, 491, 204, 118);
        int int21 = polyupdate10.sm();
        polyupdate10.add3(101, (-7), (int) (byte) 0, 10);
        polyupdate10.add3(1873, 895, 624, 223);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1237 + "'", int21 == 1237);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a(1);
        polyupdate0.a((-10));
        polyupdate0.add3(103, 69, 260, 102);
        polyupdate0.clear();
        polyupdate0.a((-17));
        java.lang.Class<?> wildcardClass28 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        polyupdate8.clear();
        int int10 = polyupdate8.sm();
        int int11 = polyupdate8.sm();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(549, 493, 0, 102);
        java.lang.Class<?> wildcardClass17 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 251);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1280);
        polyupdate43.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 132);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 109);
        java.lang.Class<?> wildcardClass15 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 300);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (byte) 10);
        int int42 = polyupdate41.sm();
        polyupdate41.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 119 + "'", int42 == 119);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a((int) (byte) 1);
        int int30 = polyupdate27.sm();
        polyupdate27.add3(1352, 641, 1199, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 211 + "'", int30 == 211);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) (short) 100);
        polyupdate39.clear();
        polyupdate39.a((int) (short) 0);
        polyupdate39.a(2358);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 360);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        polyupdate29.a(129);
        java.lang.Class<?> wildcardClass32 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1039);
        polyupdate31.clear();
        polyupdate31.add3(0, 581, 224, 154);
        polyupdate31.a(742);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        polyupdate37.add3((int) (byte) 100, 0, 2, (-17));
        polyupdate37.add3(504, (-15), (int) (short) 0, (-8));
        int int48 = polyupdate37.sm();
        polyupdate37.add3(318, 318, (-1), (-8));
        polyupdate37.clear();
        int int55 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 481 + "'", int48 == 481);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        polyupdate35.a((int) (short) 1);
        int int38 = polyupdate35.sm();
        int int39 = polyupdate35.sm();
        java.lang.Class<?> wildcardClass40 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 118 + "'", int38 == 118);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 118 + "'", int39 == 118);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 161);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1090);
        polyupdate37.add3(86, 107, 182, 10);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        polyupdate25.a(717);
        int int31 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.a(928);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1541 + "'", int31 == 1541);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        int int29 = polyupdate25.sm();
        polyupdate25.add3(1, 2, 97, 1);
        int int35 = polyupdate25.sm();
        polyupdate25.a((-109));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 18);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 427);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1744);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        int int28 = polyupdate25.sm();
        polyupdate25.clear();
        int int30 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 323 + "'", int28 == 323);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 164);
        int int34 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 273 + "'", int34 == 273);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3(161, (-7), (int) (short) 100, (-1));
        int int33 = polyupdate27.sm();
        polyupdate27.a(770);
        polyupdate27.add3(105, 226, 0, 2099);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 253 + "'", int33 == 253);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 144);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 385);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 132);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a(98);
        polyupdate29.a((int) (byte) 100);
        java.lang.Class<?> wildcardClass34 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(0, 141, (int) (short) 0, 69);
        polyupdate0.clear();
        polyupdate0.a(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.a((int) (byte) 0);
        polyupdate29.a(132);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.add3((-100), 100, 3, 4);
        polyupdate29.add3(3722, 708, 869, 197);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 502);
        polyupdate35.a(1339);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        polyupdate37.add3(0, (-6), 135, (-8));
        polyupdate37.clear();
        int int44 = polyupdate37.sm();
        polyupdate37.clear();
        polyupdate37.a(112);
        polyupdate37.a(40);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.clear();
        polyupdate0.a(0);
        polyupdate0.add3((-7), 1, 41, 164);
        polyupdate0.add3(491, 858, 427, 499);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        polyupdate12.a(92);
        polyupdate12.a(892);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a(100);
        polyupdate27.a(964);
        int int32 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2228 + "'", int32 == 2228);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.a((int) (byte) 100);
        polyupdate10.clear();
        polyupdate10.add3(561, 109, 4, 101);
        int int19 = polyupdate10.sm();
        polyupdate10.clear();
        polyupdate10.add3(1109, 239, 15, 108);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 775 + "'", int19 == 775);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        polyupdate31.add3(161, 10, 154, 104);
        polyupdate31.clear();
        int int38 = polyupdate31.sm();
        polyupdate31.a(101);
        java.lang.Class<?> wildcardClass41 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        polyupdate37.add3((int) (byte) 100, 0, 2, (-17));
        polyupdate37.add3(504, (-15), (int) (short) 0, (-8));
        int int48 = polyupdate37.sm();
        polyupdate37.a(641);
        polyupdate37.a((int) (short) 100);
        polyupdate37.add3(549, 130, 436, 2678);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 481 + "'", int48 == 481);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (byte) 0);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 532);
        java.lang.Class<?> wildcardClass44 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 154);
        java.lang.Class<?> wildcardClass42 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 251);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 796);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 299);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 4490);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.a(0);
        polyupdate0.add3((int) (short) 1, 15, 1199, 0);
        polyupdate0.a(607);
        polyupdate0.clear();
        int int15 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass16 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        polyupdate12.a((int) (short) 1);
        polyupdate12.add3(43, 440, 199, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 426);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 7);
        polyupdate39.a(0);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 300);
        polyupdate8.a(177);
        java.lang.Class<?> wildcardClass11 = polyupdate8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((-100), 0, 8, 0);
        polyupdate0.a((-8));
        polyupdate0.clear();
        polyupdate0.a(1494);
        java.lang.Class<?> wildcardClass11 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 211);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 223);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.add3(8, 107, 0, (int) (short) 100);
        int int12 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.clear();
        polyupdate0.add3(15, (int) (byte) 10, 108, 1);
        java.lang.Class<?> wildcardClass9 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        polyupdate27.a((-3));
        polyupdate27.a(0);
        polyupdate27.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a((-6));
        polyupdate0.a(9);
        polyupdate0.a(20);
        polyupdate0.a(97);
        polyupdate0.a(1719);
        polyupdate0.a(379);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1761);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 124);
        polyupdate35.a(1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-92));
        polyupdate35.clear();
        polyupdate35.a((int) (byte) 10);
        java.lang.Class<?> wildcardClass39 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 94);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 0);
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.add3(108, (int) (byte) 0, 0, 1);
        polyupdate0.add3(1057, 895, 1237, (-3));
        polyupdate0.a(106);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 921);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 212);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 199);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 44);
        polyupdate29.a(290);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-15));
        polyupdate35.a(114);
        polyupdate35.a(1473);
        polyupdate35.add3(239, 488, 132, 101);
        java.lang.Class<?> wildcardClass45 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 244);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 290);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 109);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 299);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a(98);
        polyupdate29.a((int) (byte) 100);
        polyupdate29.clear();
        polyupdate29.a(20);
        polyupdate29.clear();
        int int38 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.a(135);
        polyupdate33.a((int) (byte) 1);
        polyupdate33.a(0);
        polyupdate33.clear();
        polyupdate33.clear();
        polyupdate33.a(114);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 877);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.add3(0, (-10), (int) (short) -1, (-5));
        polyupdate0.add3((int) (short) 100, (int) (byte) 0, 112, 226);
        polyupdate0.add3(1015, 858, 2, 258);
        polyupdate0.add3(2678, 214, 3670, 758);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1719);
        polyupdate37.add3(212, 664, 444, 1480);
        java.lang.Class<?> wildcardClass43 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        polyupdate0.add3(138, 101, 21, 101);
        polyupdate0.a(7);
        polyupdate0.clear();
        int int15 = polyupdate0.sm();
        polyupdate0.a(9);
        polyupdate0.add3(118, 1784, 17, 260);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 251);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 0);
        polyupdate41.add3(223, 102, (-6), (-10));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        polyupdate27.add3(9, (-10), 4, 161);
        polyupdate27.clear();
        int int36 = polyupdate27.sm();
        java.lang.Class<?> wildcardClass37 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.clear();
        polyupdate0.add3((-5), 258, (int) (byte) -1, 3670);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 440);
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 664);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 905);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 630);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 290);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        polyupdate35.clear();
        java.lang.Class<?> wildcardClass37 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.a((-7));
        int int8 = polyupdate0.sm();
        int int9 = polyupdate0.sm();
        polyupdate0.add3(1112, 1039, 390, 607);
        int int15 = polyupdate0.sm();
        polyupdate0.add3(318, 939, 251, 1015);
        polyupdate0.a(543);
        polyupdate0.add3(1364, 1333, 446, 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8 == (-7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3148 + "'", int15 == 3148);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 7);
        polyupdate41.clear();
        polyupdate41.a(426);
        polyupdate41.add3(1293, (int) (short) 0, 225, 338);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate35.clear();
        int int37 = polyupdate35.sm();
        polyupdate35.a(385);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a(98);
        polyupdate29.a((int) (byte) 100);
        polyupdate29.add3((int) '4', 9, 141, (-1));
        polyupdate29.a(332);
        polyupdate29.add3(41, 805, 829, 1342);
        int int46 = polyupdate29.sm();
        polyupdate29.a(196);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3017 + "'", int46 == 3017);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 117);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1441);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.clear();
        int int39 = polyupdate27.sm();
        polyupdate27.add3((-1), (int) (short) 100, 5, (-1));
        polyupdate27.clear();
        java.lang.Class<?> wildcardClass46 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 264);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 199);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 597);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 3017);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.a((int) (short) 10);
        polyupdate0.clear();
        int int12 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.add3(100, 0, 257, 0);
        polyupdate33.clear();
        polyupdate33.a(794);
        polyupdate33.a(300);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        polyupdate0.add3((int) (byte) 10, (-17), 244, (int) (byte) 10);
        polyupdate0.add3((-1), 8, 10, (-2));
        polyupdate0.a(0);
        java.lang.Class<?> wildcardClass20 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-4));
        int int38 = polyupdate37.sm();
        polyupdate37.a(121);
        java.lang.Class<?> wildcardClass41 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 105 + "'", int38 == 105);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a(98);
        java.lang.Class<?> wildcardClass32 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(0);
        polyupdate0.add3(0, 549, 267, 226);
        int int17 = polyupdate0.sm();
        polyupdate0.a(1293);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1042 + "'", int17 == 1042);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 315);
        java.lang.Class<?> wildcardClass34 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 161);
        polyupdate39.a((int) (byte) 10);
        int int42 = polyupdate39.sm();
        polyupdate39.clear();
        polyupdate39.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 290 + "'", int42 == 290);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        polyupdate31.a(8);
        polyupdate31.a(9);
        polyupdate31.a(1092);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 94);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 112);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1122);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.a(0);
        polyupdate0.clear();
        polyupdate0.add3(206, 258, 176, 43);
        polyupdate0.add3(216, (-92), 803, 0);
        java.lang.Class<?> wildcardClass18 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 796);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        polyupdate31.a(0);
        polyupdate31.a(102);
        polyupdate31.a(271);
        int int38 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 952 + "'", int38 == 952);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(20);
        int int8 = polyupdate0.sm();
        polyupdate0.add3((-9), 182, 109, 116);
        polyupdate0.add3(119, 365, 426, (int) (short) -1);
        polyupdate0.add3((int) (byte) 0, 2880, 1583, 415);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        polyupdate0.add3(138, 101, 21, 101);
        polyupdate0.a(7);
        polyupdate0.clear();
        int int15 = polyupdate0.sm();
        polyupdate0.a(9);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 664);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 905);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 379);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 1441);
        int int50 = polyupdate49.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1550 + "'", int50 == 1550);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a(86);
        polyupdate0.add3(0, 0, 409, 1990);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        polyupdate31.a((-6));
        polyupdate31.a(104);
        polyupdate31.add3(4, (-100), 21, 251);
        polyupdate31.add3(150, (-3), 4, 8);
        polyupdate31.a(244);
        polyupdate31.add3(502, 111, 150, 118);
        polyupdate31.a(424);
        polyupdate31.add3(473, 308, 1541, 98);
        int int60 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2420 + "'", int60 == 2420);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        polyupdate33.a((int) (byte) 1);
        polyupdate33.add3(1092, 300, 581, 737);
        polyupdate33.clear();
        polyupdate33.add3(877, 0, 540, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-100));
        polyupdate8.clear();
        polyupdate8.a(1183);
        polyupdate8.add3(188, 921, (int) (short) -1, 380);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        int int30 = polyupdate29.sm();
        polyupdate29.clear();
        int int32 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 20);
        polyupdate12.add3(91, 742, 553, 432);
        polyupdate12.add3(1015, 299, 745, 686);
        java.lang.Class<?> wildcardClass23 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2);
        polyupdate35.add3(4, 1, 135, 577);
        int int41 = polyupdate35.sm();
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 717 + "'", int41 == 717);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        int int30 = polyupdate29.sm();
        int int31 = polyupdate29.sm();
        polyupdate29.clear();
        int int33 = polyupdate29.sm();
        polyupdate29.a(100);
        java.lang.Class<?> wildcardClass36 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 109 + "'", int31 == 109);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 161);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1090);
        java.lang.Class<?> wildcardClass38 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        int int11 = polyupdate10.sm();
        int int12 = polyupdate10.sm();
        int int13 = polyupdate10.sm();
        polyupdate10.add3((-6), (-1), 91, 531);
        polyupdate10.a(961);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 91 + "'", int11 == 91);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 251);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 21);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1352);
        polyupdate43.add3(1873, 2678, 362, 742);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        int int34 = polyupdate33.sm();
        polyupdate33.add3(226, 251, 561, (int) (short) 1);
        polyupdate33.a(207);
        polyupdate33.add3(1112, 85, 280, 1012);
        java.lang.Class<?> wildcardClass47 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 109 + "'", int34 == 109);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 260);
        int int38 = polyupdate37.sm();
        polyupdate37.clear();
        polyupdate37.clear();
        polyupdate37.a((-5));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 369 + "'", int38 == 369);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        int int38 = polyupdate37.sm();
        polyupdate37.add3(0, (int) (short) 10, (-100), 94);
        polyupdate37.add3(150, 624, 202, (-6));
        int int49 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 970 + "'", int49 == 970);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.a((-15));
        polyupdate0.add3((int) (byte) 10, (int) ' ', 384, 1293);
        polyupdate0.a(2735);
        polyupdate0.a(577);
        polyupdate0.a(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 247);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 114);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.a(251);
        polyupdate27.add3((-6), 502, (-5), 40);
        polyupdate27.add3(114, 211, 418, 164);
        int int45 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 907 + "'", int45 == 907);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate31.a(1294);
        java.lang.Class<?> wildcardClass34 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 441);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-109));
        polyupdate33.add3(16, 549, 577, (-3));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (byte) 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 196);
        polyupdate37.add3(1744, 1201, 427, 267);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        polyupdate37.add3((int) (byte) 100, 0, 2, (-17));
        polyupdate37.add3(504, (-15), (int) (short) 0, (-8));
        int int48 = polyupdate37.sm();
        polyupdate37.a(641);
        polyupdate37.add3(360, (-5), 134, (-4));
        int int56 = polyupdate37.sm();
        int int57 = polyupdate37.sm();
        polyupdate37.add3(506, 1014, 10, 540);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 481 + "'", int48 == 481);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 485 + "'", int56 == 485);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 485 + "'", int57 == 485);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 212);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(775, 132, 379, 7);
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        int int12 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1293 + "'", int10 == 1293);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1293 + "'", int11 == 1293);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1293 + "'", int12 == 1293);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        polyupdate31.a(0);
        polyupdate31.a(102);
        polyupdate31.add3((-1), 859, 1294, (-92));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        polyupdate25.add3(223, (-6), (-6), (int) (byte) 10);
        polyupdate25.clear();
        polyupdate25.add3(2937, 2272, 473, 858);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.add3(108, (int) (byte) 0, 0, 1);
        polyupdate0.a(69);
        polyupdate0.add3(161, 365, 749, 607);
        polyupdate0.a(0);
        polyupdate0.add3(737, (int) (byte) -1, (int) ' ', 624);
        int int28 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1392 + "'", int28 == 1392);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 154);
        polyupdate41.add3(202, 0, 103, (-9));
        polyupdate41.a(299);
        polyupdate41.a(229);
        polyupdate41.add3(766, 17, 1090, 211);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((-100), 0, 8, 0);
        polyupdate0.a(775);
        polyupdate0.add3(647, 0, 141, 429);
        java.lang.Class<?> wildcardClass13 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((int) ' ');
        polyupdate0.add3(5, (-1), 3, (-100));
        polyupdate0.add3(773, 306, 1014, 607);
        int int19 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2700 + "'", int19 == 2700);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        int int32 = polyupdate31.sm();
        polyupdate31.a(117);
        polyupdate31.add3(380, 226, 4, 97);
        java.lang.Class<?> wildcardClass40 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 109 + "'", int32 == 109);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(69, 209, 6, (-100));
        polyupdate25.add3(264, 202, 58, 440);
        polyupdate25.a(229);
        polyupdate25.add3(770, 444, 104, 86);
        java.lang.Class<?> wildcardClass44 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 20);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 379);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, (-6));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 796);
        polyupdate18.clear();
        java.lang.Class<?> wildcardClass20 = polyupdate18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a(2417);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-15));
        polyupdate35.a(114);
        polyupdate35.a(280);
        java.lang.Class<?> wildcardClass40 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.a((int) (byte) 100);
        polyupdate10.clear();
        polyupdate10.add3(561, 109, 4, 101);
        polyupdate10.a(3820);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        int int29 = polyupdate25.sm();
        polyupdate25.a(253);
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 264);
        int int36 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 373 + "'", int36 == 373);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.add3((-100), 100, 3, 4);
        int int35 = polyupdate29.sm();
        int int36 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 7 + "'", int35 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 44);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 2620);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        polyupdate0.a((int) (short) 1);
        polyupdate0.a((-6));
        polyupdate0.clear();
        polyupdate0.clear();
        int int17 = polyupdate0.sm();
        polyupdate0.add3(3075, 805, 1, 229);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        polyupdate31.add3(224, 577, (int) (short) 1, 94);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        int int10 = polyupdate0.sm();
        polyupdate0.add3(98, 1, 7, (-17));
        polyupdate0.clear();
        polyupdate0.a(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.add3((int) '4', 9, (int) (short) 1, 7);
        int int9 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(109);
        polyupdate0.add3(251, (int) 'a', 502, (int) 'a');
        polyupdate0.a(660);
        polyupdate0.add3(21, 533, 86, (int) '4');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a(98);
        polyupdate29.a((int) (byte) 100);
        polyupdate29.add3((int) '4', 9, 141, (-1));
        polyupdate29.a(332);
        polyupdate29.add3(41, 805, 829, 1342);
        polyupdate29.add3(647, (-15), 1, 1859);
        int int51 = polyupdate29.sm();
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2492 + "'", int51 == 2492);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        int int34 = polyupdate33.sm();
        polyupdate33.clear();
        polyupdate33.add3((-9), 894, 1111, 952);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 119 + "'", int34 == 119);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        polyupdate31.add3((-92), (-5), 251, (int) (byte) 10);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-92));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 92);
        polyupdate37.clear();
        polyupdate37.a(803);
        polyupdate37.clear();
        polyupdate37.a((int) 'a');
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 141);
        polyupdate35.clear();
        polyupdate35.a(9);
        int int39 = polyupdate35.sm();
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18 + "'", int39 == 18);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 244);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-15));
        java.lang.Class<?> wildcardClass38 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 7);
        polyupdate33.add3((-100), 5, 300, 664);
        polyupdate33.a((-15));
        int int41 = polyupdate33.sm();
        polyupdate33.add3(251, 121, 520, 40);
        java.lang.Class<?> wildcardClass47 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 854 + "'", int41 == 854);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 20);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 379);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 318);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 418);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 950);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 258);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 103);
        int int46 = polyupdate45.sm();
        polyupdate45.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 212 + "'", int46 == 212);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        polyupdate35.a((int) ' ');
        polyupdate35.a(202);
        polyupdate35.add3(1882, 165, 119, 202);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        polyupdate37.add3(10, (int) ' ', (int) (short) -1, (int) ' ');
        polyupdate37.add3(481, 134, (int) (short) 0, 179);
        polyupdate37.add3(69, 1342, 201, 308);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.a((int) (byte) 0);
        polyupdate29.a(132);
        int int34 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 425 + "'", int34 == 425);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1719);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 92);
        polyupdate41.a((int) (short) 10);
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 251);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 299);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 267);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 1257);
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 261);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 201);
        java.lang.Class<?> wildcardClass54 = polyupdate53.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        int int9 = polyupdate8.sm();
        polyupdate8.clear();
        int int11 = polyupdate8.sm();
        polyupdate8.clear();
        java.lang.Class<?> wildcardClass13 = polyupdate8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 577);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1294);
        java.lang.Class<?> wildcardClass30 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        java.lang.Class<?> wildcardClass30 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 154);
        polyupdate45.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 129);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 109);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 109);
        polyupdate37.clear();
        polyupdate37.add3(514, 1794, 663, 597);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        polyupdate27.add3(9, (-10), 4, 161);
        polyupdate27.a(101);
        polyupdate27.a(10);
        polyupdate27.clear();
        int int40 = polyupdate27.sm();
        polyupdate27.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        polyupdate0.add3(3, (-10), (int) (short) 100, (-1));
        polyupdate0.a(577);
        java.lang.Class<?> wildcardClass14 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-17));
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass11 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        polyupdate31.a((-6));
        polyupdate31.a(104);
        polyupdate31.add3(4, (-100), 21, 251);
        int int41 = polyupdate31.sm();
        polyupdate31.add3(117, 134, 1679, 805);
        int int47 = polyupdate31.sm();
        java.lang.Class<?> wildcardClass48 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 176 + "'", int41 == 176);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2735 + "'", int47 == 2735);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        polyupdate27.a((-3));
        polyupdate27.a(0);
        polyupdate27.add3(664, (-9), 132, 204);
        polyupdate27.a(624);
        int int39 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2239 + "'", int39 == 2239);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(441, 802, 905, 261);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        polyupdate29.add3(40, 164, (int) (byte) 0, (-7));
        java.lang.Class<?> wildcardClass35 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 20);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 532);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, (-4));
        int int44 = polyupdate43.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 105 + "'", int44 == 105);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 858);
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 967 + "'", int38 == 967);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        int int30 = polyupdate29.sm();
        java.lang.Class<?> wildcardClass31 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 119 + "'", int30 == 119);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a((-6));
        polyupdate0.add3(107, 110, 103, (-4));
        polyupdate0.clear();
        polyupdate0.add3((-6), 308, 260, 332);
        polyupdate0.a(91);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 9);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 110);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 69);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 803);
        polyupdate51.clear();
        java.lang.Class<?> wildcardClass53 = polyupdate51.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-17));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1092);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 504);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 85);
        int int42 = polyupdate41.sm();
        int int43 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 194 + "'", int42 == 194);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 194 + "'", int43 == 194);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.add3(109, 8, (int) 'a', (int) ' ');
        polyupdate0.a(531);
        polyupdate0.add3(854, 226, 970, (-6));
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        polyupdate33.add3(950, 1146, 489, 224);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        polyupdate39.a(20);
        polyupdate39.a(1237);
        polyupdate39.clear();
        java.lang.Class<?> wildcardClass45 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        polyupdate31.a((-6));
        java.lang.Class<?> wildcardClass34 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 121);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 794);
        polyupdate41.clear();
        java.lang.Class<?> wildcardClass43 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 307);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 499);
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 608 + "'", int38 == 608);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-92));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 92);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) (byte) -1);
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 108 + "'", int40 == 108);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.a((int) (byte) 0);
        int int32 = polyupdate29.sm();
        int int33 = polyupdate29.sm();
        java.lang.Class<?> wildcardClass34 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 161 + "'", int32 == 161);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 161 + "'", int33 == 161);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate31.add3(502, (-4), (int) 'a', 3);
        int int37 = polyupdate31.sm();
        polyupdate31.a(624);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 598 + "'", int37 == 598);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 109);
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        polyupdate31.a(107);
        polyupdate31.add3(144, 10, 21, 504);
        int int41 = polyupdate31.sm();
        java.lang.Class<?> wildcardClass42 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 218 + "'", int32 == 218);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 218 + "'", int33 == 218);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 679 + "'", int41 == 679);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        polyupdate37.add3(895, 1112, 1128, (-100));
        polyupdate37.a((-100));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 1113);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        int int34 = polyupdate33.sm();
        polyupdate33.add3(226, 251, 561, (int) (short) 1);
        int int40 = polyupdate33.sm();
        polyupdate33.a(3004);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 109 + "'", int34 == 109);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1039 + "'", int40 == 1039);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 796);
        polyupdate45.a(3722);
        polyupdate45.a(532);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 4);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 177);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 197);
        int int40 = polyupdate39.sm();
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 306 + "'", int40 == 306);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 20);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1113);
        int int36 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1222 + "'", int36 == 1222);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 858);
        int int38 = polyupdate37.sm();
        polyupdate37.a(470);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 967 + "'", int38 == 967);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        int int34 = polyupdate33.sm();
        polyupdate33.clear();
        polyupdate33.a(0);
        java.lang.Class<?> wildcardClass38 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 102 + "'", int34 == 102);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 1090);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 1201);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 318);
        polyupdate31.add3(969, 524, 100, 1142);
        polyupdate31.add3(223, 793, 1146, 770);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 32);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1039);
        int int38 = polyupdate37.sm();
        polyupdate37.clear();
        polyupdate37.a(3307);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1148 + "'", int38 == 1148);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 418);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 132);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1007);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 207);
        java.lang.Class<?> wildcardClass46 = polyupdate45.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.add3(8, (-2), 10, 3);
        polyupdate29.add3(253, (-8), (-15), (-5));
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass41 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        int int17 = polyupdate16.sm();
        int int18 = polyupdate16.sm();
        polyupdate16.add3((int) (byte) 100, 577, (-100), 290);
        java.lang.Class<?> wildcardClass24 = polyupdate16.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 577 + "'", int17 == 577);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 577 + "'", int18 == 577);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 488);
        int int38 = polyupdate37.sm();
        java.lang.Class<?> wildcardClass39 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 597 + "'", int38 == 597);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 129);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 189);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 12);
        polyupdate37.a(1601);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        polyupdate25.a(103);
        java.lang.Class<?> wildcardClass35 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.a((int) ' ');
        polyupdate25.a(129);
        polyupdate25.a(104);
        polyupdate25.add3(607, 69, 251, 1294);
        polyupdate25.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        int int30 = polyupdate29.sm();
        int int31 = polyupdate29.sm();
        polyupdate29.add3((int) '4', 10, 6, 10);
        polyupdate29.add3(16, 78, 362, 194);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 108 + "'", int30 == 108);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 108 + "'", int31 == 108);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        polyupdate33.add3(0, 577, (int) (byte) 1, 82);
        polyupdate33.clear();
        polyupdate33.clear();
        polyupdate33.add3(659, 1042, 338, 1010);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 182);
        int int36 = polyupdate35.sm();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 291 + "'", int36 == 291);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 179);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 9);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1652);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 863);
        java.lang.Class<?> wildcardClass38 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        polyupdate33.clear();
        polyupdate33.a((-15));
        polyupdate33.a(1744);
        int int39 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3473 + "'", int39 == 3473);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 149);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 564);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate10.add3(488, (-9), 20, 134);
        polyupdate10.add3(0, 308, 11, 21);
        polyupdate10.clear();
        polyupdate10.a(91);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 561);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 212);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 841);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.clear();
        int int39 = polyupdate27.sm();
        polyupdate27.add3((-1), (int) (short) 100, 5, (-1));
        polyupdate27.a(209);
        polyupdate27.clear();
        polyupdate27.a(2476);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 107);
        int int38 = polyupdate37.sm();
        polyupdate37.a(110);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 216 + "'", int38 == 216);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        int int29 = polyupdate25.sm();
        polyupdate25.add3(1, 2, 97, 1);
        int int35 = polyupdate25.sm();
        polyupdate25.add3((int) (short) 0, 102, 154, 481);
        polyupdate25.add3(0, 436, 1652, 251);
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(134);
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass13 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.add3((int) '4', 9, (int) (short) 1, 7);
        int int9 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass12 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(577, (int) (byte) -1, (-9), (-6));
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(804, 1294, 197, 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (byte) 0);
        polyupdate41.a(20);
        polyupdate41.clear();
        polyupdate41.clear();
        java.lang.Class<?> wildcardClass46 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (byte) 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 196);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(9);
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass8 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-100));
        int int9 = polyupdate8.sm();
        int int10 = polyupdate8.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-109) + "'", int9 == (-109));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-109) + "'", int10 == (-109));
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate31.a(100);
        polyupdate31.add3(318, 318, (int) ' ', 69);
        polyupdate31.a(101);
        polyupdate31.a(1983);
        java.lang.Class<?> wildcardClass43 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 440);
        int int36 = polyupdate35.sm();
        int int37 = polyupdate35.sm();
        polyupdate35.a(717);
        polyupdate35.add3(368, 86, 1146, 192);
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 549 + "'", int36 == 549);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 549 + "'", int37 == 549);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 148);
        polyupdate43.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 150);
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass31 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 18);
        int int44 = polyupdate43.sm();
        int int45 = polyupdate43.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 127 + "'", int44 == 127);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 127 + "'", int45 == 127);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        polyupdate27.add3(9, (-10), 4, 161);
        polyupdate27.clear();
        int int36 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 176);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1793);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-6));
        polyupdate37.a(365);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1280);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 143);
        polyupdate33.clear();
        polyupdate33.a(2937);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-17));
        polyupdate0.add3(20, (int) (byte) 1, 18, 481);
        int int15 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 520 + "'", int15 == 520);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 315);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1261);
        polyupdate37.add3(1293, 803, 969, 216);
        java.lang.Class<?> wildcardClass43 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 226);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 86);
        polyupdate43.add3(150, 322, 98, 1146);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        int int35 = polyupdate29.sm();
        polyupdate29.clear();
        polyupdate29.clear();
        polyupdate29.add3(365, (int) '4', 384, (int) (short) -1);
        int int43 = polyupdate29.sm();
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 800 + "'", int43 == 800);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        polyupdate35.a(8);
        int int38 = polyupdate35.sm();
        polyupdate35.add3((-15), 15, 182, 82);
        int int44 = polyupdate35.sm();
        polyupdate35.clear();
        polyupdate35.a(758);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 260 + "'", int38 == 260);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 264 + "'", int44 == 264);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 244);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 301);
        java.lang.Class<?> wildcardClass40 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        polyupdate27.clear();
        int int29 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 264);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(7, 119, 97, 161);
        int int26 = polyupdate0.sm();
        polyupdate0.clear();
        int int28 = polyupdate0.sm();
        polyupdate0.a(564);
        java.lang.Class<?> wildcardClass31 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 384 + "'", int26 == 384);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 426);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 11);
        polyupdate39.add3(290, 385, 118, (-5));
        int int45 = polyupdate39.sm();
        polyupdate39.a(545);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 788 + "'", int45 == 788);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.clear();
        polyupdate0.add3(961, 215, 5, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        polyupdate33.clear();
        java.lang.Class<?> wildcardClass35 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 214);
        polyupdate37.a((-7));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 103);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 315);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 43);
        java.lang.Class<?> wildcardClass44 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        int int15 = polyupdate14.sm();
        polyupdate14.clear();
        int int17 = polyupdate14.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15) + "'", int15 == (-15));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a((-17));
        polyupdate0.a(2);
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass17 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 659);
        int int42 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 768 + "'", int42 == 768);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 664);
        int int34 = polyupdate33.sm();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 773 + "'", int34 == 773);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.clear();
        int int39 = polyupdate27.sm();
        polyupdate27.add3((-1), (int) (short) 100, 5, (-1));
        int int45 = polyupdate27.sm();
        int int46 = polyupdate27.sm();
        int int47 = polyupdate27.sm();
        polyupdate27.add3(176, (-5), 582, 647);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 103 + "'", int45 == 103);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 103 + "'", int46 == 103);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 103 + "'", int47 == 103);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 3);
        polyupdate35.a(229);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 99);
        java.lang.Class<?> wildcardClass34 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a((-6));
        polyupdate0.a(9);
        polyupdate0.a((int) '#');
        polyupdate0.a(0);
        polyupdate0.add3(332, 332, 308, 134);
        java.lang.Class<?> wildcardClass24 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        polyupdate31.add3(99, 318, 164, 427);
        int int37 = polyupdate31.sm();
        polyupdate31.add3(1042, (-3), 2735, (-15));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1008 + "'", int37 == 1008);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 182);
        polyupdate35.clear();
        polyupdate35.a(481);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.clear();
        polyupdate0.add3(299, 0, 1293, (-9));
        polyupdate0.add3(318, 1451, 288, 323);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 41);
        polyupdate14.a(103);
        polyupdate14.add3(301, 426, 122, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = polyupdate14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        polyupdate35.a(504);
        polyupdate35.a(182);
        int int40 = polyupdate35.sm();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1480 + "'", int40 == 1480);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        int int9 = polyupdate8.sm();
        polyupdate8.clear();
        int int11 = polyupdate8.sm();
        polyupdate8.a(663);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.a((int) (byte) 0);
        int int32 = polyupdate29.sm();
        polyupdate29.clear();
        polyupdate29.add3(209, 426, 540, 1057);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 161 + "'", int32 == 161);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 8);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 143);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        int int40 = polyupdate39.sm();
        polyupdate39.add3(531, 1473, 3017, 177);
        polyupdate39.add3(17, 727, 2700, 929);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 2937);
        int int28 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3046 + "'", int28 == 3046);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        polyupdate0.a(3);
        polyupdate0.clear();
        polyupdate0.a(1113);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 717);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a((-6));
        int int13 = polyupdate0.sm();
        int int14 = polyupdate0.sm();
        int int15 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        int int18 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 91 + "'", int14 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 91 + "'", int15 == 91);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 20);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 2735);
        polyupdate37.add3(963, 1294, (-17), 2678);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 177);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 577);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a((int) (short) 0);
        int int12 = polyupdate0.sm();
        polyupdate0.add3(964, 429, 1983, 100);
        polyupdate0.a(86);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 124 + "'", int12 == 124);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 20);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 8);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 582);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(1342, 182, 251, 701);
        java.lang.Class<?> wildcardClass10 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate12.add3(110, (-10), (-1), (-8));
        int int18 = polyupdate12.sm();
        int int19 = polyupdate12.sm();
        polyupdate12.a(303);
        java.lang.Class<?> wildcardClass22 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 91 + "'", int18 == 91);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 91 + "'", int19 == 91);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3((int) (byte) 1, 150, (int) (byte) 100, 2);
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass12 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 253 + "'", int10 == 253);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 253 + "'", int11 == 253);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 176);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.a(91);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        polyupdate10.add3(108, 226, 21, (-6));
        polyupdate10.add3(164, 91, 97, 9);
        polyupdate10.add3(1793, 577, 9, 1148);
        java.lang.Class<?> wildcardClass26 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-7));
        int int32 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 102 + "'", int32 == 102);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        polyupdate25.a(577);
        polyupdate25.a(624);
        polyupdate25.add3(636, 427, 597, 0);
        polyupdate25.a(91);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate33.add3(161, 1451, 440, 770);
        polyupdate33.add3(1794, 1008, 1100, 1014);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 253);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 415);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 132);
        java.lang.Class<?> wildcardClass34 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 189);
        java.lang.Class<?> wildcardClass11 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        int int36 = polyupdate35.sm();
        polyupdate35.a(270);
        polyupdate35.add3(491, 211, 273, 165);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 244 + "'", int36 == 244);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(950, 905, 854, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 101);
        polyupdate33.a(223);
        polyupdate33.add3(290, 44, (int) (byte) 100, 138);
        polyupdate33.clear();
        polyupdate33.add3(0, 4490, 1042, 300);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 91);
        polyupdate10.a(2);
        polyupdate10.clear();
        int int14 = polyupdate10.sm();
        polyupdate10.a((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 110);
        polyupdate33.a(503);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.a(101);
        polyupdate0.clear();
        int int18 = polyupdate0.sm();
        int int19 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass20 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        int int34 = polyupdate33.sm();
        polyupdate33.add3(694, 1583, 0, 2753);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 119 + "'", int34 == 119);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        int int29 = polyupdate25.sm();
        polyupdate25.a(253);
        polyupdate25.a(1293);
        polyupdate25.add3(923, 425, 600, 658);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 572);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 659);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 481);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 154);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(69, 209, 6, (-100));
        polyupdate25.add3(127, 6, 1744, 1193);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        polyupdate29.add3(0, 577, 98, (-17));
        polyupdate29.add3(318, 101, (int) (byte) 0, 7);
        int int40 = polyupdate29.sm();
        int int41 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 426 + "'", int40 == 426);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 426 + "'", int41 == 426);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 308);
        polyupdate39.add3(97, (-1), 154, 209);
        polyupdate39.a((int) (byte) 100);
        polyupdate39.a(322);
        polyupdate39.add3(1793, (int) (short) 100, (int) '#', (-8));
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 150);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 360);
        int int38 = polyupdate37.sm();
        java.lang.Class<?> wildcardClass39 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 469 + "'", int38 == 469);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate35.clear();
        int int37 = polyupdate35.sm();
        polyupdate35.a(12);
        java.lang.Class<?> wildcardClass40 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        int int35 = polyupdate29.sm();
        polyupdate29.clear();
        polyupdate29.clear();
        polyupdate29.a(91);
        polyupdate29.add3(775, 161, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass45 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        int int8 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 134 + "'", int8 == 134);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1);
        int int42 = polyupdate41.sm();
        int int43 = polyupdate41.sm();
        polyupdate41.clear();
        polyupdate41.a(424);
        int int47 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 110 + "'", int42 == 110);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 110 + "'", int43 == 110);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 848 + "'", int47 == 848);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        int int29 = polyupdate25.sm();
        polyupdate25.add3(1, 2, 97, 1);
        int int35 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        polyupdate31.a(0);
        polyupdate31.a(102);
        polyupdate31.a(659);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.a((int) (byte) 0);
        int int35 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.add3(69, (int) (short) -1, (-7), (int) (short) 0);
        polyupdate27.clear();
        int int43 = polyupdate27.sm();
        int int44 = polyupdate27.sm();
        java.lang.Class<?> wildcardClass45 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 135 + "'", int35 == 135);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1601);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((-100), 0, 8, 0);
        polyupdate0.a((-8));
        int int8 = polyupdate0.sm();
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        polyupdate0.add3(113, 521, 2834, 531);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-100) + "'", int8 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-100) + "'", int10 == (-100));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate35.clear();
        polyupdate35.a(226);
        polyupdate35.a(607);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        polyupdate0.add3(138, 101, 21, 101);
        polyupdate0.a(0);
        polyupdate0.a(134);
        java.lang.Class<?> wildcardClass16 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 223);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 520);
        polyupdate37.add3((int) (byte) -1, 485, 161, 564);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(10);
        polyupdate0.add3(164, 308, (int) (byte) 10, 0);
        polyupdate0.add3(6, 7, (-100), 1);
        polyupdate0.clear();
        int int21 = polyupdate0.sm();
        polyupdate0.a(270);
        polyupdate0.add3(829, 1, 2937, 1241);
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-5));
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 775);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 204);
        polyupdate16.a(758);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a((-17));
        polyupdate0.clear();
        polyupdate0.add3(332, 440, 770, 101);
        polyupdate0.a(144);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        int int34 = polyupdate31.sm();
        polyupdate31.add3(332, 2492, 253, 82);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 209 + "'", int32 == 209);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 209 + "'", int33 == 209);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 209 + "'", int34 == 209);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 440);
        polyupdate35.add3(5, 892, 264, 854);
        int int41 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2015 + "'", int41 == 2015);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 134);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 108);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.a((int) (short) 10);
        polyupdate0.a(770);
        polyupdate0.a(436);
        java.lang.Class<?> wildcardClass15 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate31.add3(10, 0, 892, 1008);
        int int37 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1910 + "'", int37 == 1910);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 91);
        polyupdate10.a(2);
        polyupdate10.clear();
        int int14 = polyupdate10.sm();
        java.lang.Class<?> wildcardClass15 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.add3(577, 58, 154, 7);
        polyupdate29.add3(300, 258, 727, 369);
        polyupdate29.clear();
        polyupdate29.add3(729, 10, 493, 427);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 40);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 426);
        int int15 = polyupdate14.sm();
        polyupdate14.add3(0, 1014, (-8), 270);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 950 + "'", int15 == 950);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 418);
        polyupdate33.clear();
        int int35 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        polyupdate31.a(209);
        int int34 = polyupdate31.sm();
        polyupdate31.add3(1100, 385, 717, 742);
        polyupdate31.clear();
        polyupdate31.a(304);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 532 + "'", int34 == 532);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 300);
        polyupdate37.a(290);
        polyupdate37.clear();
        int int41 = polyupdate37.sm();
        polyupdate37.a(113);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        polyupdate0.add3(100, (-10), 9, 7);
        polyupdate0.clear();
        polyupdate0.a(694);
        java.lang.Class<?> wildcardClass19 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 101);
        polyupdate33.a(223);
        polyupdate33.add3(290, 44, (int) (byte) 100, 138);
        polyupdate33.a(138);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(0, 0, 223, 1);
        polyupdate0.a(0);
        polyupdate0.add3(561, (-1), 97, 1494);
        int int22 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2151 + "'", int22 == 2151);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        polyupdate33.add3(0, (int) (short) 100, 20, (-100));
        int int39 = polyupdate33.sm();
        polyupdate33.add3(581, (-5), 502, 308);
        polyupdate33.add3(1828, 1, 717, 766);
        polyupdate33.a(97);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 18);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 100);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.add3(100, (int) (byte) 100, (-1), 3);
        int int35 = polyupdate25.sm();
        int int36 = polyupdate25.sm();
        polyupdate25.add3(768, 230, 1042, (-9));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 202 + "'", int35 == 202);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 202 + "'", int36 == 202);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a(100);
        int int30 = polyupdate27.sm();
        java.lang.Class<?> wildcardClass31 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 300 + "'", int30 == 300);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        polyupdate8.a((int) (short) 10);
        polyupdate8.add3(0, 98, 664, 117);
        java.lang.Class<?> wildcardClass16 = polyupdate8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3(0, 0, 7, 8);
        polyupdate0.a(766);
        polyupdate0.a(259);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 150);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }
}

