package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(7, 119, 97, 161);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        int int32 = polyupdate27.sm();
        polyupdate27.add3(728, 368, 561, 288);
        int int38 = polyupdate27.sm();
        polyupdate27.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1945 + "'", int38 == 1945);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        polyupdate33.add3(0, 101, 86, 182);
        int int39 = polyupdate33.sm();
        polyupdate33.add3(4100, 708, 2711, 0);
        java.lang.Class<?> wildcardClass45 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 369 + "'", int39 == 369);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate31.a1((-10));
        int int34 = polyupdate31.sm();
        int int35 = polyupdate31.sm();
        polyupdate31.a1(4197);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 196 + "'", int34 == 196);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 196 + "'", int35 == 196);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 290);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 2);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 485);
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 594 + "'", int40 == 594);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1652);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 664);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2536);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
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
        polyupdate37.a1(612);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 299);
        polyupdate39.clear();
        int int41 = polyupdate39.sm();
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 379);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1237);
        polyupdate43.add3(103, 737, 319, 0);
        polyupdate43.a1(636);
        int int51 = polyupdate43.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2431 + "'", int51 == 2431);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 436);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 97);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 116);
        polyupdate37.add3((int) (byte) 1, 418, 549, 1);
        polyupdate37.a1((int) 'a');
        polyupdate37.a1(82);
        int int47 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1327 + "'", int47 == 1327);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 258);
        polyupdate51.a1(1122);
        polyupdate51.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 148);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
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
        polyupdate39.clear();
        java.lang.Class<?> wildcardClass41 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1583);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 553);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 3206);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 106);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        int int32 = polyupdate31.sm();
        polyupdate31.a1(318);
        polyupdate31.add3(97, 432, 1757, 144);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 114 + "'", int32 == 114);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 177);
        java.lang.Class<?> wildcardClass11 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 729);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 682);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 420);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 427);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 520);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 647);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1782);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
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
        polyupdate39.add3(1744, 1, 15, 5);
        polyupdate39.add3(0, 384, 2880, 987);
        polyupdate39.add3(927, 3075, (-4), 199);
        polyupdate39.add3(154, 5763, 6203, 4698);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
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
        polyupdate33.clear();
        polyupdate33.a1(176);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        int int30 = polyupdate29.sm();
        polyupdate29.add3(117, 150, 805, 103);
        polyupdate29.add3(612, 694, 289, 679);
        java.lang.Class<?> wildcardClass41 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 161 + "'", int30 == 161);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3(41, (int) '#', (int) 'a', 135);
        polyupdate0.clear();
        polyupdate0.add3(108, 1744, 102, 543);
        int int17 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2497 + "'", int17 == 2497);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 7);
        polyupdate33.a1(2395);
        polyupdate33.add3(1588, 2880, (int) 'a', 224);
        polyupdate33.a1(2115);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 641);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 390);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 606);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-4));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        polyupdate31.add3((-92), (-5), 251, (int) (byte) 10);
        int int37 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 164 + "'", int37 == 164);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 729);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 209);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.add3(209, (-1), 161, 577);
        polyupdate0.a1(218);
        java.lang.Class<?> wildcardClass10 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(5);
        polyupdate0.a1(384);
        polyupdate0.clear();
        polyupdate0.a1(1364);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        polyupdate31.clear();
        int int33 = polyupdate31.sm();
        polyupdate31.a1(2473);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 229);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 123);
        polyupdate37.add3(32, 1859, 803, 307);
        java.lang.Class<?> wildcardClass43 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        int int33 = polyupdate25.sm();
        polyupdate25.a1(0);
        int int36 = polyupdate25.sm();
        java.lang.Class<?> wildcardClass37 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 226 + "'", int33 == 226);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 226 + "'", int36 == 226);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        int int9 = polyupdate8.sm();
        polyupdate8.clear();
        int int11 = polyupdate8.sm();
        java.lang.Class<?> wildcardClass12 = polyupdate8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a1(1199);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
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
        polyupdate41.add3(117, 32, 107, 0);
        polyupdate41.a1(1544);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 209);
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        int int34 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 318 + "'", int32 == 318);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 318 + "'", int33 == 318);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 318 + "'", int34 == 318);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        polyupdate29.a1(315);
        int int32 = polyupdate29.sm();
        polyupdate29.add3(502, 464, 1100, 1256);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 742 + "'", int32 == 742);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        polyupdate29.clear();
        polyupdate29.a1(224);
        polyupdate29.a1(194);
        int int35 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 836 + "'", int35 == 836);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((-100), 0, 8, 0);
        polyupdate0.a1((-8));
        polyupdate0.a1(1113);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 101);
        polyupdate33.add3(40, 10, 770, 1039);
        int int39 = polyupdate33.sm();
        polyupdate33.a1((-2));
        polyupdate33.add3(91, 69, 2735, 514);
        polyupdate33.clear();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1859 + "'", int39 == 1859);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 800);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 952);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 6180);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 32);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 923);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 176);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 69);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 179);
        polyupdate43.add3(1261, 927, 504, 664);
        polyupdate43.add3(1812, 784, 7064, 184);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        int int11 = polyupdate10.sm();
        int int12 = polyupdate10.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a1(107);
        polyupdate27.add3((-7), (int) (byte) 10, (int) '4', (int) (short) 1);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.add3((int) (byte) -1, 69, 0, 223);
        int int42 = polyupdate27.sm();
        polyupdate27.a1(3820);
        polyupdate27.add3(673, 1740, 620, 198);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 291 + "'", int42 == 291);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        polyupdate31.add3(99, 318, 164, 427);
        int int37 = polyupdate31.sm();
        polyupdate31.a1(122);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1008 + "'", int37 == 1008);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        polyupdate35.a1(116);
        polyupdate35.add3(116, 111, 141, 3);
        polyupdate35.add3(0, 485, 499, 612);
        polyupdate35.clear();
        int int49 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a1((-17));
        polyupdate0.clear();
        polyupdate0.a1(476);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a1(0);
        polyupdate25.add3(624, 129, 260, (-92));
        int int33 = polyupdate25.sm();
        polyupdate25.a1(489);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 921 + "'", int33 == 921);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 664);
        polyupdate33.add3(322, 0, 381, 2420);
        polyupdate33.a1(503);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a1((-6));
        polyupdate0.a1(9);
        polyupdate0.a1((int) '#');
        polyupdate0.add3(2959, 1112, 311, 514);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a1((-17));
        polyupdate0.clear();
        int int15 = polyupdate0.sm();
        int int16 = polyupdate0.sm();
        polyupdate0.a1(92);
        polyupdate0.add3(708, 766, 506, 3670);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.a1(2542);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 20);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-17));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 18);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 905);
        polyupdate43.a1(1057);
        polyupdate43.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 271);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 368);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 2839);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 226);
        polyupdate37.add3(2730, 1522, 1688, 4982);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 91);
        polyupdate35.a1(108);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 564);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 481);
        polyupdate35.clear();
        polyupdate35.add3(1327, 4520, 373, 959);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        polyupdate25.a1(577);
        polyupdate25.a1(141);
        polyupdate25.clear();
        polyupdate25.clear();
        int int39 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 86);
        polyupdate39.a1(360);
        polyupdate39.clear();
        int int43 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 561);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1983);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 572);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 2959);
        polyupdate39.add3(141, 1031, 94, 1899);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 211);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 3722);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 192);
        polyupdate37.a1(390);
        java.lang.Class<?> wildcardClass40 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 223);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 959);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 694);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1236);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 614);
        polyupdate43.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.clear();
        int int39 = polyupdate27.sm();
        polyupdate27.a1(4);
        polyupdate27.clear();
        java.lang.Class<?> wildcardClass43 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 561);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 105);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 208);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 4113);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1983);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, 179);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList13, 878);
        int int21 = polyupdate20.sm();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1465 + "'", int21 == 1465);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        polyupdate31.add3(99, 318, 164, 427);
        int int37 = polyupdate31.sm();
        polyupdate31.a1(122);
        int int40 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1008 + "'", int37 == 1008);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1252 + "'", int40 == 1252);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        polyupdate35.add3(3820, 56, 86, 3004);
        polyupdate35.a1((int) (byte) 1);
        int int43 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6968 + "'", int43 == 6968);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.a1(0);
        int int7 = polyupdate0.sm();
        int int8 = polyupdate0.sm();
        polyupdate0.clear();
        int int10 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
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
        polyupdate35.add3(716, 2473, 923, 2015);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.a1(135);
        polyupdate33.a1((int) (byte) 1);
        polyupdate33.a1(0);
        polyupdate33.clear();
        int int41 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
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
        polyupdate29.a1(100);
        polyupdate29.a1(78);
        java.lang.Class<?> wildcardClass38 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 109 + "'", int31 == 109);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        polyupdate0.clear();
        polyupdate0.a1(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.clear();
        polyupdate0.add3((int) '4', 504, (-1), 1);
        polyupdate0.clear();
        int int24 = polyupdate0.sm();
        int int25 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1(318);
        polyupdate0.a1(961);
        polyupdate0.add3(5491, 226, 1716, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        polyupdate31.add3((-92), (-5), 251, (int) (byte) 10);
        polyupdate31.add3(488, (-1), 543, 176);
        polyupdate31.a1(123);
        java.lang.Class<?> wildcardClass44 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a1(100);
        polyupdate27.add3(10, (int) 'a', 2, (-10));
        int int35 = polyupdate27.sm();
        int int36 = polyupdate27.sm();
        polyupdate27.add3(1342, 2534, 0, 366);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 99 + "'", int35 == 99);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 99 + "'", int36 == 99);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 300);
        int int17 = polyupdate16.sm();
        int int18 = polyupdate16.sm();
        polyupdate16.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 291 + "'", int17 == 291);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 291 + "'", int18 == 291);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 20);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-17));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 5938);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1203);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 787);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1782);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 58);
        polyupdate37.add3(1583, 58, (-8), 851);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
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
        polyupdate39.add3(244, 182, 0, 488);
        polyupdate39.add3((-8), 182, 251, 82);
        polyupdate39.add3((-1), 939, 342, 581);
        java.lang.Class<?> wildcardClass55 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a1(4982);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1494);
        polyupdate35.add3(0, 1112, 535, 189);
        polyupdate35.a1(261);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a1((-1));
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1(1015);
        polyupdate0.a1(1333);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        polyupdate12.clear();
        polyupdate12.a1(308);
        polyupdate12.add3(243, 1114, 963, 1042);
        java.lang.Class<?> wildcardClass21 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 2339);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 441);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 100);
        int int13 = polyupdate12.sm();
        polyupdate12.add3((int) ' ', 260, 41, 561);
        int int19 = polyupdate12.sm();
        polyupdate12.add3(0, 138, 727, 176);
        java.lang.Class<?> wildcardClass25 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 894 + "'", int19 == 894);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        polyupdate0.clear();
        polyupdate0.a1(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.clear();
        polyupdate0.add3((int) '4', 504, (-1), 1);
        polyupdate0.clear();
        int int24 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(0, 826, 3266, 430);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(10);
        polyupdate0.add3(164, 308, (int) (byte) 10, 0);
        polyupdate0.add3(6, 7, (-100), 1);
        polyupdate0.clear();
        int int21 = polyupdate0.sm();
        polyupdate0.a1(270);
        polyupdate0.add3(829, 1, 2937, 1241);
        polyupdate0.a1(3514);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 250);
        java.lang.Class<?> wildcardClass50 = polyupdate49.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a1(892);
        int int32 = polyupdate29.sm();
        polyupdate29.add3(218, 989, 1784, 1652);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1892 + "'", int32 == 1892);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (byte) 10);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1022);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1261);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 97);
        polyupdate47.add3(250, 1241, 1352, 686);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
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
        int int53 = polyupdate51.sm();
        int int54 = polyupdate51.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a1(0);
        polyupdate25.add3(624, 129, 260, (-92));
        java.lang.Class<?> wildcardClass33 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1022);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 41);
        polyupdate14.clear();
        int int16 = polyupdate14.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 229);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 123);
        polyupdate37.add3(32, 1859, 803, 307);
        polyupdate37.a1(794);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.a1(101);
        polyupdate0.clear();
        polyupdate0.clear();
        int int19 = polyupdate0.sm();
        polyupdate0.add3(189, (-5), 18, 4084);
        polyupdate0.add3(856, 1138, 2730, 533);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a1((-6));
        polyupdate0.a1(9);
        polyupdate0.a1(20);
        polyupdate0.clear();
        int int18 = polyupdate0.sm();
        polyupdate0.add3(1899, 488, 43, 770);
        polyupdate0.a1(150);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        polyupdate12.add3((-100), 260, 69, 0);
        polyupdate12.a1(20);
        polyupdate12.a1((-2));
        int int22 = polyupdate12.sm();
        int int23 = polyupdate12.sm();
        java.lang.Class<?> wildcardClass24 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 267 + "'", int22 == 267);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 267 + "'", int23 == 267);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 207);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 4430);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
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
        polyupdate41.a1(299);
        polyupdate41.a1((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        int int32 = polyupdate31.sm();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 209 + "'", int32 == 209);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        polyupdate0.add3(100, (-10), 9, 7);
        polyupdate0.clear();
        polyupdate0.add3(1039, 110, 100, 118);
        java.lang.Class<?> wildcardClass22 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 58);
        polyupdate41.a1(963);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
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
        polyupdate37.a1(9);
        int int41 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 18 + "'", int41 == 18);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 165);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-4));
        polyupdate37.add3(3449, 745, 6925, 7064);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a1((-5));
        polyupdate0.add3((int) '4', 9, (int) (short) 1, 7);
        int int9 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1(109);
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a1(1988);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
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
        polyupdate37.add3(150, 0, 20, 10);
        polyupdate37.a1(98);
        polyupdate37.add3(18, 82, 0, (-15));
        polyupdate37.a1(308);
        int int57 = polyupdate37.sm();
        polyupdate37.clear();
        polyupdate37.a1(290);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 701 + "'", int57 == 701);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a1(20);
        int int8 = polyupdate0.sm();
        polyupdate0.add3((-9), 182, 109, 116);
        polyupdate0.add3(119, 365, 426, (int) (short) -1);
        int int19 = polyupdate0.sm();
        int int20 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 909 + "'", int19 == 909);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 909 + "'", int20 == 909);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 20);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 379);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 121);
        int int19 = polyupdate18.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 112 + "'", int19 == 112);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 105);
        polyupdate12.a1((-10));
        polyupdate12.a1(1370);
        polyupdate12.a1(1032);
        int int19 = polyupdate12.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4890 + "'", int19 == 4890);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
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
        polyupdate39.a1(1092);
        polyupdate39.clear();
        polyupdate39.clear();
        java.lang.Class<?> wildcardClass44 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.a1(0);
        polyupdate0.clear();
        polyupdate0.add3(206, 258, 176, 43);
        polyupdate0.add3(216, (-92), 803, 0);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 109);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 82);
        java.lang.Class<?> wildcardClass42 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 549);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 892);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 123);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 134);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(134);
        polyupdate0.a1(660);
        int int12 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1(397);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1710 + "'", int12 == 1710);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.a1((int) (byte) 0);
        int int35 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.add3(69, (int) (short) -1, (-7), (int) (short) 0);
        polyupdate27.clear();
        int int43 = polyupdate27.sm();
        java.lang.Class<?> wildcardClass44 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 135 + "'", int35 == 135);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a1((-6));
        polyupdate0.a1(707);
        int int15 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1505 + "'", int15 == 1505);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 253);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 134);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 360);
        polyupdate37.a1(707);
        polyupdate37.add3(2492, 1316, 493, 1551);
        polyupdate37.add3(1303, 0, 7185, 1680);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.add3(244, (-6), 251, (-2));
        polyupdate0.a1(260);
        int int22 = polyupdate0.sm();
        int int23 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1007 + "'", int22 == 1007);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1007 + "'", int23 == 1007);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate10.add3(424, 491, 1793, 1719);
        polyupdate10.a1(161);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate33.add3(161, 1451, 440, 770);
        polyupdate33.add3(506, 1996, 4430, (int) '#');
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, (int) (short) 0);
        polyupdate43.add3(399, 773, 1761, 1349);
        polyupdate43.clear();
        polyupdate43.add3(204, 304, 709, 869);
        polyupdate43.add3(3307, 829, 44, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
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
        polyupdate41.add3(390, 3148, 3689, 111);
        polyupdate41.clear();
        int int48 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-5));
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 112);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 94);
        polyupdate16.a1(111);
        polyupdate16.a1(100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
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
        polyupdate39.add3(775, 1679, 805, 260);
        polyupdate39.add3(212, 1014, 1601, (-2));
        polyupdate39.a1(1154);
        polyupdate39.a1(412);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 141);
        polyupdate35.add3(98, (int) (short) -1, 226, 100);
        int int41 = polyupdate35.sm();
        polyupdate35.a1(78);
        int int44 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 423 + "'", int41 == 423);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 579 + "'", int44 == 579);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1);
        polyupdate45.a1(365);
        int int48 = polyupdate45.sm();
        polyupdate45.add3(829, (-100), 681, 709);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 840 + "'", int48 == 840);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) -1);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 2395);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 44);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 86);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1352);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1734);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (byte) 1);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 291);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1450);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 3581);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 129);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.a1((int) (short) 0);
        polyupdate0.a1(69);
        java.lang.Class<?> wildcardClass14 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
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
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 99);
        examples.Polyupdate polyupdate55 = new examples.Polyupdate(intList22, 1308);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 116);
        polyupdate37.add3((int) (byte) 1, 418, 549, 1);
        polyupdate37.a1((int) 'a');
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 244);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 271);
        polyupdate41.a1(1354);
        polyupdate41.add3(4113, 1352, 882, 1183);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.add3(577, 58, 154, 7);
        polyupdate29.a1(113);
        polyupdate29.add3(8, 138, 361, 78);
        polyupdate29.add3(679, 659, 599, 1076);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        int int28 = polyupdate27.sm();
        polyupdate27.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 2902);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 107);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 367);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, (int) (byte) 1);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 1812);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
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
        polyupdate39.a1((int) (byte) 10);
        int int42 = polyupdate39.sm();
        polyupdate39.clear();
        int int44 = polyupdate39.sm();
        polyupdate39.a1(420);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 290 + "'", int42 == 290);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 531);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 304);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 1882);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 11659);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList3, 5399);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList3, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (-6));
        int int42 = polyupdate41.sm();
        polyupdate41.a1(1293);
        polyupdate41.clear();
        int int46 = polyupdate41.sm();
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 103 + "'", int42 == 103);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
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
        polyupdate29.add3(132, 0, (int) (byte) 1, 0);
        polyupdate29.add3(470, 11659, (-9), 1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 109 + "'", int31 == 109);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
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
        polyupdate14.add3(1856, 3807, 1144, 2167);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15) + "'", int15 == (-15));
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        polyupdate8.add3(5, 318, 10, 315);
        polyupdate8.add3((int) '#', 6, 218, 2);
        polyupdate8.a1(1241);
        polyupdate8.add3(100, 1148, 91, 3312);
        int int26 = polyupdate8.sm();
        int int27 = polyupdate8.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4651 + "'", int26 == 4651);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4651 + "'", int27 == 4651);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.a1((int) ' ');
        polyupdate25.a1(129);
        polyupdate25.a1(104);
        polyupdate25.add3(607, 69, 251, 1294);
        polyupdate25.add3(632, 802, 0, 102);
        polyupdate25.add3(91, 0, 3035, 3640);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (byte) 10);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1022);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1797);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a1((-1));
        polyupdate0.add3(0, (-10), (int) (short) -1, (-5));
        polyupdate0.a1(342);
        int int13 = polyupdate0.sm();
        polyupdate0.add3(258, 1040, 380, 7);
        java.lang.Class<?> wildcardClass19 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 668 + "'", int13 == 668);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 150);
        int int30 = polyupdate29.sm();
        polyupdate29.a1(7064);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 259 + "'", int30 == 259);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 369);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 10873);
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10982 + "'", int38 == 10982);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.clear();
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1(800);
        polyupdate0.add3(3449, 952, 412, 382);
        int int15 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5195 + "'", int15 == 5195);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 148);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 836);
        polyupdate37.a1(523);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 40);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 426);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, 1784);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList5, (-2));
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList5, (-4));
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList5, 2613);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate41.clear();
        polyupdate41.add3(134, 114, (-9), (int) (byte) 1);
        polyupdate41.a1((int) ' ');
        polyupdate41.add3(424, (int) 'a', 796, 0);
        int int55 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1317 + "'", int55 == 1317);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        int int34 = polyupdate33.sm();
        int int35 = polyupdate33.sm();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 150 + "'", int34 == 150);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 117);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 211);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.a1((int) (byte) 0);
        polyupdate29.a1(132);
        polyupdate29.a1(2809);
        polyupdate29.a1(101);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 5855);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 3035);
        java.lang.Class<?> wildcardClass48 = polyupdate47.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 561);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1031);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-5));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        polyupdate35.clear();
        int int37 = polyupdate35.sm();
        polyupdate35.a1(1451);
        java.lang.Class<?> wildcardClass40 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
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
        polyupdate39.a1((int) (short) 0);
        polyupdate39.add3(612, 590, 3580, 1892);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (byte) 0);
        polyupdate35.a1(58);
        polyupdate35.a1(549);
        polyupdate35.add3((-186), 1090, 2937, 1257);
        polyupdate35.add3(0, 896, 6603, 811);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 1352);
        polyupdate51.add3(803, 740, 2115, 1899);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 577);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 532);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 805);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1753);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3((int) (byte) 1, 150, (int) (byte) 100, 2);
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1(851);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 253 + "'", int10 == 253);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 253 + "'", int11 == 253);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (byte) 10);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 106);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
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
        polyupdate39.a1(140);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1183);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 367);
        polyupdate39.add3(1038, 290, 664, 607);
        java.lang.Class<?> wildcardClass45 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        polyupdate12.a1((int) (short) 1);
        polyupdate12.a1(7);
        int int17 = polyupdate12.sm();
        int int18 = polyupdate12.sm();
        polyupdate12.a1(691);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 315 + "'", int17 == 315);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 315 + "'", int18 == 315);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        polyupdate0.a1(3);
        polyupdate0.clear();
        polyupdate0.a1(69);
        polyupdate0.add3(82, 390, 154, 86);
        polyupdate0.clear();
        int int30 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 107);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 367);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, (int) (byte) 1);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 0);
        polyupdate49.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
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
        polyupdate47.clear();
        int int49 = polyupdate47.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a1((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a1(504);
        polyupdate0.add3(323, 3588, 3722, 1793);
        polyupdate0.a1(1850);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.a1(251);
        polyupdate27.add3((-6), 502, (-5), 40);
        polyupdate27.add3(114, 211, 418, 164);
        polyupdate27.add3(384, (-1), 109, (int) (short) -1);
        polyupdate27.clear();
        int int51 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (short) 10);
        polyupdate41.add3(5, 138, 69, (-17));
        polyupdate41.clear();
        polyupdate41.a1(579);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, 964);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList13, 521);
        java.lang.Class<?> wildcardClass21 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1512);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(7, 124, 152, 1652);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 244);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 271);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 708);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 436);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 582);
        polyupdate47.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 6203);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 92);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 390);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 111);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 536);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 863);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 118);
        polyupdate49.add3(3047, 1734, 3121, 777);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 728);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 2395);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        polyupdate0.a1(390);
        int int13 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass14 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 914 + "'", int13 == 914);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
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
        java.lang.Class<?> wildcardClass37 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
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
        polyupdate35.clear();
        int int39 = polyupdate35.sm();
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 549 + "'", int36 == 549);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 549 + "'", int37 == 549);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 271);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1859);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 564);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 369);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 271);
        int int15 = polyupdate14.sm();
        polyupdate14.add3(7185, 1794, (-18), 1761);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 262 + "'", int15 == 262);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 379);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 267);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1012);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1523);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 318);
        polyupdate39.a1(668);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        polyupdate31.add3(161, 10, 154, 104);
        polyupdate31.clear();
        polyupdate31.a1(1339);
        polyupdate31.add3(0, 630, 7955, 963);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a1((-6));
        polyupdate0.a1(9);
        polyupdate0.a1((int) '#');
        polyupdate0.add3(141, 109, 0, (int) (short) 1);
        polyupdate0.clear();
        polyupdate0.add3(102, 0, 0, 41);
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(134);
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        int int13 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 86);
        polyupdate39.a1(360);
        polyupdate39.clear();
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 258);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 218);
        polyupdate53.a1(99);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 9);
        polyupdate35.add3(839, 429, (-15), 111);
        int int41 = polyupdate35.sm();
        int int42 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1364 + "'", int41 == 1364);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1364 + "'", int42 == 1364);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 144);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 2555);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 258);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 0);
        int int54 = polyupdate53.sm();
        int int55 = polyupdate53.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 109 + "'", int54 == 109);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 109 + "'", int55 == 109);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 3968);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-92));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 749);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
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
        polyupdate35.add3(105, 3307, 103, (-2));
        polyupdate35.add3(720, (int) ' ', 769, 768);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        int int8 = polyupdate0.sm();
        polyupdate0.a1(112);
        int int11 = polyupdate0.sm();
        polyupdate0.a1(535);
        int int14 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 322 + "'", int11 == 322);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1392 + "'", int14 == 1392);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 290);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 44);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 6968);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 141);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 210);
        int int36 = polyupdate35.sm();
        polyupdate35.a1(836);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 319 + "'", int36 == 319);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a1((-6));
        polyupdate0.a1(9);
        polyupdate0.a1(20);
        polyupdate0.add3(69, (int) 'a', (int) (byte) 1, (int) (byte) 10);
        int int22 = polyupdate0.sm();
        int int23 = polyupdate0.sm();
        polyupdate0.a1(398);
        int int26 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 177 + "'", int22 == 177);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 177 + "'", int23 == 177);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 973 + "'", int26 == 973);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 804);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.a1(1);
        polyupdate0.a1((-10));
        int int20 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-6) + "'", int20 == (-6));
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
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
        polyupdate33.clear();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 150 + "'", int34 == 150);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 433);
        int int46 = polyupdate45.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 542 + "'", int46 == 542);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 258);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 218);
        examples.Polyupdate polyupdate55 = new examples.Polyupdate(intList22, 1873);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 291);
        polyupdate37.a1(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 332, 177, 161, 1744, 132, 8, 117, 385, (-10), 429, 10, 69, 223, 148, (-7), (-100), 4, 257, 829, 98, 418, 923, (-9), 607, 107, 58, 4, 97, 10, 892 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        examples.Polyupdate polyupdate34 = new examples.Polyupdate(intList31, 839);
        examples.Polyupdate polyupdate36 = new examples.Polyupdate(intList31, 5);
        polyupdate36.clear();
        polyupdate36.clear();
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        int int13 = polyupdate12.sm();
        polyupdate12.a1((-8));
        polyupdate12.a1(315);
        polyupdate12.add3(607, (int) (byte) -1, 123, (int) (short) 10);
        polyupdate12.clear();
        polyupdate12.add3(1106, 441, 923, 112);
        polyupdate12.add3(535, 966, 1793, 6154);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 299 + "'", int13 == 299);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.a1((int) (short) 0);
        int int12 = polyupdate0.sm();
        polyupdate0.add3(964, 429, 1983, 100);
        int int18 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 124 + "'", int12 == 124);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3476 + "'", int18 == 3476);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        polyupdate0.clear();
        polyupdate0.a1(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.clear();
        polyupdate0.add3((int) '4', 504, (-1), 1);
        polyupdate0.clear();
        int int24 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(3379, 2374, 877, 7277);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        polyupdate0.a1(3);
        polyupdate0.clear();
        polyupdate0.a1(69);
        int int24 = polyupdate0.sm();
        polyupdate0.a1(322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 138 + "'", int24 == 138);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 561);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 301);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 1128);
        polyupdate51.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 561);
        polyupdate33.add3(261, 469, 244, 200);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 258);
        polyupdate51.a1(1122);
        int int54 = polyupdate51.sm();
        polyupdate51.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2611 + "'", int54 == 2611);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a1((-17));
        int int14 = polyupdate0.sm();
        int int15 = polyupdate0.sm();
        polyupdate0.add3(367, 9, 113, 10);
        int int21 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 117 + "'", int14 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 499 + "'", int21 == 499);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-5));
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 775);
        polyupdate14.add3(877, 1751, 1057, 2473);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 441);
        int int32 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 550 + "'", int32 == 550);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 504);
        polyupdate33.a1(244);
        polyupdate33.add3(1996, 2228, 2142, 3266);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        polyupdate33.a1(6);
        polyupdate33.clear();
        polyupdate33.clear();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 176);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 561);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1015);
        java.lang.Class<?> wildcardClass44 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-100));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 91);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 212);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 660);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 107);
        polyupdate37.a1(502);
        polyupdate37.a1(448);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(5);
        int int10 = polyupdate0.sm();
        polyupdate0.a1(0);
        polyupdate0.add3(20, (-1), 21, 379);
        polyupdate0.a1(0);
        polyupdate0.a1(921);
        polyupdate0.add3(2151, 192, 737, 11659);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
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
        polyupdate39.a1((int) (byte) 10);
        int int42 = polyupdate39.sm();
        java.lang.Class<?> wildcardClass43 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 290 + "'", int42 == 290);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 664);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 2395);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 2525);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a1(98);
        polyupdate29.add3(6, 110, 114, 135);
        polyupdate29.a1((int) (short) -1);
        polyupdate29.add3(0, 154, 11659, 681);
        polyupdate29.a1(11659);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a1((-5));
        polyupdate0.add3((int) '4', 9, (int) (short) 1, 7);
        int int9 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1(109);
        polyupdate0.add3(1852, (-92), 2388, 1793);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.clear();
        polyupdate10.add3(150, 112, 369, (-92));
        polyupdate10.add3(211, 1588, 504, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 291);
        int int34 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 400 + "'", int34 == 400);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(0, 0, 223, 1);
        polyupdate0.clear();
        polyupdate0.add3(426, 209, (int) '4', (-9));
        polyupdate0.add3(0, 426, 152, 258);
        polyupdate0.a1(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a1((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        int int11 = polyupdate0.sm();
        polyupdate0.add3(10, 97, 132, 0);
        int int17 = polyupdate0.sm();
        polyupdate0.add3(10, 271, 381, 82);
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 239 + "'", int17 == 239);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 41);
        polyupdate14.a1(164);
        int int17 = polyupdate14.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 360 + "'", int17 == 360);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 244);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 271);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 32);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 426);
        polyupdate39.clear();
        polyupdate39.add3(150, 214, 223, 964);
        polyupdate39.add3(103, 196, 440, 923);
        polyupdate39.clear();
        polyupdate39.clear();
        polyupdate39.add3(7185, 323, 0, 1461);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1761);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 905);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.a1(1237);
        polyupdate33.add3(176, 1256, 329, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        polyupdate31.a1(251);
        polyupdate31.add3(0, 577, 875, 244);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a1((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        int int13 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(2492, 123, 1761, 928);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        int int32 = polyupdate31.sm();
        polyupdate31.a1(775);
        polyupdate31.add3(1350, 18, 3689, 123);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 244 + "'", int32 == 244);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 107);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 367);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, (int) (byte) 1);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 742);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a1((-1));
        polyupdate0.a1(0);
        int int8 = polyupdate0.sm();
        polyupdate0.a1(1601);
        polyupdate0.clear();
        polyupdate0.add3(164, 380, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        polyupdate10.clear();
        polyupdate10.clear();
        polyupdate10.a1(3519);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        int int11 = polyupdate10.sm();
        int int12 = polyupdate10.sm();
        polyupdate10.a1((int) '4');
        polyupdate10.a1(134);
        polyupdate10.a1(100);
        int int19 = polyupdate10.sm();
        polyupdate10.clear();
        polyupdate10.a1(113);
        int int23 = polyupdate10.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 91 + "'", int11 == 91);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 663 + "'", int19 == 663);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 226 + "'", int23 == 226);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 361);
        int int36 = polyupdate35.sm();
        int int37 = polyupdate35.sm();
        java.lang.Class<?> wildcardClass38 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 470 + "'", int36 == 470);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 470 + "'", int37 == 470);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
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
        polyupdate35.add3(1198, 2431, 3670, 594);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a1((-17));
        polyupdate0.clear();
        int int15 = polyupdate0.sm();
        int int16 = polyupdate0.sm();
        polyupdate0.a1(92);
        int int19 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 184 + "'", int19 == 184);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        polyupdate31.add3(4, 253, 543, 3);
        polyupdate31.add3(663, 673, 290, 464);
        java.lang.Class<?> wildcardClass42 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate39.add3(161, 1494, 1679, 1744);
        polyupdate39.clear();
        int int46 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 182);
        java.lang.Class<?> wildcardClass11 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 32);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 264);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 119);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        polyupdate12.clear();
        polyupdate12.clear();
        java.lang.Class<?> wildcardClass15 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1((-17));
        polyupdate0.add3(244, 41, 103, (-9));
        int int15 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass16 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 379 + "'", int15 == 379);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1((int) ' ');
        polyupdate0.add3(1012, 1, 141, 4);
        polyupdate0.clear();
        polyupdate0.a1(0);
        polyupdate0.a1(303);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 291);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 418);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 176);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, 0);
        polyupdate16.add3(0, 701, 207, 224);
        int int22 = polyupdate16.sm();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1132 + "'", int22 == 1132);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.add3(201, 314, 1808, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a1(1);
        int int30 = polyupdate27.sm();
        polyupdate27.clear();
        int int32 = polyupdate27.sm();
        int int33 = polyupdate27.sm();
        polyupdate27.clear();
        java.lang.Class<?> wildcardClass35 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 211 + "'", int30 == 211);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 424);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 599);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 523);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        int int28 = polyupdate27.sm();
        int int29 = polyupdate27.sm();
        int int30 = polyupdate27.sm();
        int int31 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 209 + "'", int28 == 209);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 209 + "'", int29 == 209);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 209 + "'", int30 == 209);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 209 + "'", int31 == 209);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(577, (int) (byte) -1, (-9), (-6));
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        int int9 = polyupdate0.sm();
        polyupdate0.add3(0, 429, 289, 2735);
        int int15 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3453 + "'", int15 == 3453);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 182);
        polyupdate35.a1(2620);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
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
        polyupdate41.a1(612);
        polyupdate41.add3(430, 1238, 894, 1031);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(0, 0, 223, 1);
        polyupdate0.clear();
        polyupdate0.add3(426, 209, (int) '4', (-9));
        polyupdate0.add3(0, 426, 152, 258);
        polyupdate0.a1(597);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.a1((-7));
        polyupdate0.a1(829);
        polyupdate0.a1(717);
        int int9 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3085 + "'", int9 == 3085);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1039);
        polyupdate31.clear();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) (byte) 0);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 802);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 499);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 612);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 3235);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a1(100);
        polyupdate27.add3(10, (int) 'a', 2, (-10));
        int int35 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.a1(491);
        int int40 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 99 + "'", int35 == 99);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 982 + "'", int40 == 982);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 369);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 148);
        polyupdate37.add3(506, 4160, 1945, 320);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 384);
        int int36 = polyupdate35.sm();
        polyupdate35.a1(1688);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 493 + "'", int36 == 493);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.a1(0);
        polyupdate0.a1(469);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a1(0);
        polyupdate25.a1(577);
        polyupdate25.clear();
        int int31 = polyupdate25.sm();
        polyupdate25.a1(135);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        int int36 = polyupdate35.sm();
        polyupdate35.clear();
        polyupdate35.a1(2575);
        polyupdate35.a1(3640);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 92 + "'", int36 == 92);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 20);
        int int34 = polyupdate33.sm();
        int int35 = polyupdate33.sm();
        java.lang.Class<?> wildcardClass36 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 129 + "'", int34 == 129);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 129 + "'", int35 == 129);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-100));
        polyupdate8.clear();
        int int10 = polyupdate8.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        int int32 = polyupdate27.sm();
        java.lang.Class<?> wildcardClass33 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 2937);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 5061);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
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
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        int int30 = polyupdate29.sm();
        polyupdate29.add3(117, 150, 805, 103);
        polyupdate29.a1(1081);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 161 + "'", int30 == 161);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 182);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 320);
        polyupdate37.add3(415, 338, 82, 514);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
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
        polyupdate35.add3(64, 921, 2239, 768);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a1((-1));
        polyupdate0.a1(0);
        polyupdate0.a1(40);
        int int10 = polyupdate0.sm();
        polyupdate0.a1(1280);
        int int13 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2639 + "'", int13 == 2639);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        polyupdate35.a1(1114);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
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
        int int37 = polyupdate35.sm();
        int int38 = polyupdate35.sm();
        int int39 = polyupdate35.sm();
        java.lang.Class<?> wildcardClass40 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.add3((-100), 100, 3, 4);
        polyupdate29.a1(141);
        int int37 = polyupdate29.sm();
        int int38 = polyupdate29.sm();
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 289 + "'", int37 == 289);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 289 + "'", int38 == 289);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.a1(1);
        polyupdate0.a1((-10));
        polyupdate0.add3(103, 69, 260, 102);
        int int25 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 534 + "'", int25 == 534);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        polyupdate35.add3(3519, 1550, 1968, 369);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        int int6 = polyupdate0.sm();
        int int7 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 3046);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 113);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1494);
        polyupdate35.add3(2316, 476, 836, 745);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 3934);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 150);
        polyupdate33.a1(218);
        polyupdate33.add3(502, 110, (int) (byte) 0, 1261);
        int int41 = polyupdate33.sm();
        polyupdate33.a1(303);
        java.lang.Class<?> wildcardClass44 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1873 + "'", int41 == 1873);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(425, 2542, 21, 191);
        int int14 = polyupdate0.sm();
        int int15 = polyupdate0.sm();
        polyupdate0.add3(127, (-2), 524, 23);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3179 + "'", int14 == 3179);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3179 + "'", int15 == 3179);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 152);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 3670);
        examples.Polyupdate polyupdate55 = new examples.Polyupdate(intList22, 640);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
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
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a1((-1));
        polyupdate0.a1(0);
        polyupdate0.add3((int) (byte) 10, (-17), 244, (int) (byte) 10);
        polyupdate0.add3((int) (byte) -1, 3312, 18, 668);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.add3(3473, 224, 624, 1763);
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        polyupdate31.a1((int) 'a');
        polyupdate31.add3(103, 91, 110, (-1));
        int int39 = polyupdate31.sm();
        polyupdate31.clear();
        polyupdate31.a1((-92));
        polyupdate31.add3(0, 952, 1144, 0);
        int int48 = polyupdate31.sm();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 303 + "'", int39 == 303);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2096 + "'", int48 == 2096);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        polyupdate0.add3(0, 91, 218, 111);
        polyupdate0.clear();
        int int15 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.a1(101);
        polyupdate0.a1(0);
        polyupdate0.clear();
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 119);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 250);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 799);
        polyupdate49.add3(2239, 86, 640, 2536);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 127);
        polyupdate35.add3(148, 7846, 840, 1512);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a1((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.a1((-7));
        int int8 = polyupdate0.sm();
        polyupdate0.add3((-3), 226, (-9), 150);
        polyupdate0.a1(3148);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8 == (-7));
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a1(0);
        int int28 = polyupdate25.sm();
        int int29 = polyupdate25.sm();
        polyupdate25.add3(1, 2, 97, 1);
        polyupdate25.a1(129);
        polyupdate25.add3(446, 86, 1439, 1142);
        polyupdate25.a1(4520);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (short) 10);
        polyupdate41.a1(342);
        polyupdate41.a1(286);
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 41);
        polyupdate31.a1(218);
        polyupdate31.clear();
        int int35 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a1((int) (short) 10);
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.a1(308);
        polyupdate0.a1(251);
        int int14 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1272 + "'", int14 == 1272);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        polyupdate8.add3((-6), 0, 6, 82);
        polyupdate8.add3(532, 1882, 188, (-1));
        polyupdate8.a1(214);
        polyupdate8.add3(3588, 1425, 82, 1257);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
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
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 244 + "'", int36 == 244);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        polyupdate33.clear();
        polyupdate33.a1((-15));
        polyupdate33.a1(229);
        polyupdate33.a1(369);
        int int41 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1181 + "'", int41 == 1181);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        polyupdate16.add3(2228, 829, 380, 481);
        java.lang.Class<?> wildcardClass22 = polyupdate16.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 271);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 368);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 2);
        int int44 = polyupdate43.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 111 + "'", int44 == 111);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        polyupdate29.add3(0, 577, 98, (-17));
        polyupdate29.add3(318, 101, (int) (byte) 0, 7);
        polyupdate29.add3(251, 10, 20, 429);
        java.lang.Class<?> wildcardClass45 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate33.a1(3588);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 1122);
        polyupdate12.a1(929);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a1((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        int int11 = polyupdate0.sm();
        polyupdate0.a1(204);
        polyupdate0.a1(258);
        int int16 = polyupdate0.sm();
        int int17 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 965 + "'", int16 == 965);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 965 + "'", int17 == 965);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 877);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        int int36 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 109 + "'", int36 == 109);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
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
        polyupdate41.add3(226, (-6), 773, 1983);
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.add3(577, 58, 154, 7);
        polyupdate29.a1(113);
        polyupdate29.add3(8, 138, 361, 78);
        polyupdate29.add3(766, 1090, 839, 0);
        java.lang.Class<?> wildcardClass47 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 251);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 796);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        polyupdate31.add3(1289, 620, 3149, 822);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        polyupdate0.add3(322, 332, 369, 717);
        int int9 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1740 + "'", int9 == 1740);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 40);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 426);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, 1784);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList5, (-2));
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList5, 263);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 222);
        polyupdate45.a1(362);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 299);
        polyupdate39.clear();
        polyupdate39.add3(2373, 368, 1405, 2373);
        int int46 = polyupdate39.sm();
        polyupdate39.a1(1257);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 6519 + "'", int46 == 6519);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
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
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a1((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        int int13 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a1(3);
        int int19 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        polyupdate33.a1(6);
        polyupdate33.clear();
        polyupdate33.clear();
        polyupdate33.a1(895);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
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
        polyupdate33.a1(201);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 102 + "'", int34 == 102);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(150, 58, 260, (-100));
        polyupdate0.clear();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass17 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 488);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        polyupdate31.clear();
        polyupdate31.a1(214);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 206 + "'", int32 == 206);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 206 + "'", int33 == 206);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
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
        polyupdate37.add3(362, 243, 4432, 4430);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        polyupdate33.add3(121, 636, 105, 243);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 742);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.clear();
        polyupdate27.a1((int) (byte) -1);
        java.lang.Class<?> wildcardClass41 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a1((-1));
        polyupdate0.a1(0);
        polyupdate0.a1(40);
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 79 + "'", int11 == 79);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        int int36 = polyupdate35.sm();
        polyupdate35.add3(2249, 1294, 1473, 1652);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 209 + "'", int36 == 209);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a1((-6));
        polyupdate0.a1(9);
        java.lang.Class<?> wildcardClass15 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 148);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 2);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 322);
        polyupdate45.add3(2476, 271, 1679, 91);
        int int51 = polyupdate45.sm();
        int int52 = polyupdate45.sm();
        polyupdate45.a1(1442);
        polyupdate45.add3(2008, 836, 301, 1856);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4517 + "'", int51 == 4517);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4517 + "'", int52 == 4517);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 119);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 119);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 361);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 863);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a1((int) (short) 10);
        polyupdate0.a1((int) (byte) 10);
        int int10 = polyupdate0.sm();
        polyupdate0.add3((int) (byte) -1, 495, 0, 381);
        int int16 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 154 + "'", int10 == 154);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 875 + "'", int16 == 875);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.a1((int) (short) 0);
        int int12 = polyupdate0.sm();
        polyupdate0.add3(1162, 6154, 506, 2395);
        polyupdate0.add3(875, 531, 1808, 244);
        polyupdate0.a1(2959);
        int int25 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 124 + "'", int12 == 124);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9376 + "'", int25 == 9376);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 315);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 877);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 0);
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 109 + "'", int40 == 109);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 290);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 652);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 198);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 300);
        polyupdate8.clear();
        polyupdate8.a1(426);
        polyupdate8.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.add3(100, 0, 257, 0);
        polyupdate33.add3((-15), 1188, 112, 176);
        int int44 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1461 + "'", int44 == 1461);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 709);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 762);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 4160);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 641);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        int int30 = polyupdate29.sm();
        int int31 = polyupdate29.sm();
        polyupdate29.add3((int) '4', 10, 6, 10);
        polyupdate29.a1(1473);
        int int39 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 108 + "'", int30 == 108);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 108 + "'", int31 == 108);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3024 + "'", int39 == 3024);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        int int30 = polyupdate29.sm();
        int int31 = polyupdate29.sm();
        int int32 = polyupdate29.sm();
        polyupdate29.clear();
        polyupdate29.add3(481, 1261, 1761, 2395);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 110 + "'", int30 == 110);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 110 + "'", int31 == 110);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 110 + "'", int32 == 110);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a1(98);
        polyupdate29.a1((int) (byte) 100);
        polyupdate29.add3((int) '4', 9, 141, (-1));
        polyupdate29.clear();
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        polyupdate35.clear();
        int int37 = polyupdate35.sm();
        polyupdate35.a1(2525);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        polyupdate31.a1(3820);
        int int34 = polyupdate31.sm();
        polyupdate31.a1(535);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7846 + "'", int34 == 7846);
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 647);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 2503);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 399);
        polyupdate41.a1(599);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a1((-1));
        polyupdate0.a1(0);
        int int8 = polyupdate0.sm();
        polyupdate0.clear();
        int int10 = polyupdate0.sm();
        polyupdate0.add3(2504, 444, 0, 701);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
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
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 288 + "'", int38 == 288);
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a1((-6));
        polyupdate0.a1(9);
        polyupdate0.a1((int) '#');
        polyupdate0.a1(0);
        polyupdate0.add3(332, 332, 308, 134);
        polyupdate0.a1(110);
        int int26 = polyupdate0.sm();
        polyupdate0.add3(2834, 1480, 769, 1523);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1326 + "'", int26 == 1326);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) -1);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) (short) -1);
        int int38 = polyupdate37.sm();
        polyupdate37.add3(1113, 793, 1090, 7185);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 108 + "'", int38 == 108);
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 149);
        polyupdate14.a1(418);
        polyupdate14.a1(192);
        int int19 = polyupdate14.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1360 + "'", int19 == 1360);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 315);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 679);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 58);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 44);
        int int40 = polyupdate39.sm();
        java.lang.Class<?> wildcardClass41 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 153 + "'", int40 == 153);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
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
        polyupdate41.clear();
        polyupdate41.clear();
        int int44 = polyupdate41.sm();
        int int45 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 103);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 379);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 267);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1012);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 116);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1175);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) (byte) 0, 109, (int) (byte) 0, 0);
        polyupdate29.add3((int) (short) 1, 1, 114, (int) (short) 0);
        int int40 = polyupdate29.sm();
        polyupdate29.a1((int) (short) 0);
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass44 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 116 + "'", int40 == 116);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        polyupdate25.a1(577);
        polyupdate25.a1(141);
        polyupdate25.add3(969, 2526, 682, 177);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-1));
        int int38 = polyupdate37.sm();
        polyupdate37.a1(379);
        polyupdate37.add3(799, 914, 1441, 177);
        polyupdate37.clear();
        int int47 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 108 + "'", int38 == 108);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 300);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 1280);
        polyupdate18.a1(848);
        polyupdate18.a1(2412);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
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
        int int44 = polyupdate29.sm();
        polyupdate29.clear();
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass47 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 800 + "'", int43 == 800);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 800 + "'", int44 == 800);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
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
        polyupdate41.a1(141);
        polyupdate41.add3(1, 1280, (-100), 108);
        java.lang.Class<?> wildcardClass54 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        int int27 = polyupdate25.sm();
        int int28 = polyupdate25.sm();
        polyupdate25.add3(315, 299, 102, (-92));
        int int34 = polyupdate25.sm();
        polyupdate25.add3(1848, 2678, 715, 614);
        polyupdate25.a1(3934);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 624 + "'", int34 == 624);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 318);
        polyupdate35.a1(0);
        polyupdate35.clear();
        java.lang.Class<?> wildcardClass39 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.add3(368, 202, 551, 197);
        polyupdate29.a1(794);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a1((int) (short) 10);
        polyupdate0.a1(318);
        polyupdate0.a1(85);
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 10);
        java.lang.Class<?> wildcardClass32 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        polyupdate33.clear();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        int int35 = polyupdate29.sm();
        int int36 = polyupdate29.sm();
        polyupdate29.a1(481);
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass40 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 150 + "'", int36 == 150);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 379);
        polyupdate33.clear();
        polyupdate33.clear();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        polyupdate14.clear();
        java.lang.Class<?> wildcardClass16 = polyupdate14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
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
        polyupdate35.add3(202, 440, (-7), 0);
        polyupdate35.add3(737, 367, 742, 1201);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 717 + "'", int41 == 717);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        polyupdate31.a1(103);
        int int34 = polyupdate31.sm();
        int int35 = polyupdate31.sm();
        polyupdate31.add3(1859, 0, 1996, 708);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 310 + "'", int34 == 310);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 310 + "'", int35 == 310);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.add3(100, 0, 257, 0);
        polyupdate33.add3((-15), 1188, 112, 176);
        polyupdate33.add3(1074, 657, 2575, 712);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.add3((int) '4', (-1), 4, 209);
        polyupdate27.add3(775, 641, 141, 7);
        polyupdate27.a1(3126);
        int int40 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 7816 + "'", int40 == 7816);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        polyupdate35.add3(2345, 2880, 875, 1410);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-9));
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 250);
        polyupdate14.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.add3(3379, 425, 1159, 875);
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a1((-6));
        polyupdate0.a1(318);
        polyupdate0.add3(161, 21, 300, 99);
        polyupdate0.a1(264);
        int int22 = polyupdate0.sm();
        polyupdate0.add3(179, 2099, (-8), 927);
        polyupdate0.add3(1144, 4651, 1049, 1424);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1109 + "'", int22 == 1109);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        polyupdate33.a1((int) (byte) 1);
        polyupdate33.add3(1092, 300, 581, 737);
        polyupdate33.a1(1014);
        polyupdate33.a1(267);
        int int45 = polyupdate33.sm();
        java.lang.Class<?> wildcardClass46 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5272 + "'", int45 == 5272);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 260);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 464);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 257);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, (-10));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1308);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 191);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a1(94);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 244);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1451);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 177);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a1((-6));
        polyupdate0.a1(318);
        polyupdate0.add3(161, 21, 300, 99);
        int int20 = polyupdate0.sm();
        int int21 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass22 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 581 + "'", int20 == 581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 581 + "'", int21 == 581);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 495);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, (int) ' ');
        polyupdate18.add3(10, (-7), 109, 209);
        polyupdate18.a1(0);
        polyupdate18.clear();
        int int27 = polyupdate18.sm();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 1038);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
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
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 109 + "'", int40 == 109);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.clear();
        polyupdate0.a1(3519);
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.a1((int) (short) 0);
        int int12 = polyupdate0.sm();
        polyupdate0.add3(1162, 6154, 506, 2395);
        polyupdate0.clear();
        polyupdate0.a1(2800);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 124 + "'", int12 == 124);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, (int) (short) 0);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList13, 97);
        polyupdate20.add3(0, 58, 20, (int) (short) 1);
        polyupdate20.clear();
        polyupdate20.a1(2395);
        int int29 = polyupdate20.sm();
        polyupdate20.clear();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4790 + "'", int29 == 4790);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 2167);
        polyupdate41.add3(5491, 400, 989, 2492);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 109);
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        polyupdate31.a1(1199);
        polyupdate31.clear();
        int int37 = polyupdate31.sm();
        polyupdate31.a1(531);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 218 + "'", int32 == 218);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 218 + "'", int33 == 218);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 258);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 149);
        examples.Polyupdate polyupdate55 = new examples.Polyupdate(intList22, 1988);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
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
        polyupdate37.a1(540);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a1(1);
        polyupdate27.add3(9, (-10), 4, 161);
        polyupdate27.a1(0);
        polyupdate27.clear();
        int int38 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.a1(1740);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 577);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 532);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1293);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 7);
        polyupdate33.add3((-100), 5, 300, 664);
        polyupdate33.a1((-15));
        int int41 = polyupdate33.sm();
        polyupdate33.add3(251, 121, 520, 40);
        polyupdate33.clear();
        polyupdate33.add3(398, 658, 121, 204);
        java.lang.Class<?> wildcardClass53 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 854 + "'", int41 == 854);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        int int11 = polyupdate10.sm();
        int int12 = polyupdate10.sm();
        polyupdate10.a1((int) '4');
        polyupdate10.clear();
        polyupdate10.add3(663, 1007, 1954, 670);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 91 + "'", int11 == 91);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 103);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 8);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 3113);
        java.lang.Class<?> wildcardClass34 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 3586);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1439);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1116);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        int int11 = polyupdate10.sm();
        int int12 = polyupdate10.sm();
        polyupdate10.a1((int) '4');
        polyupdate10.a1(4);
        polyupdate10.add3(524, (int) ' ', 7760, 5855);
        polyupdate10.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 91 + "'", int11 == 91);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, (-7));
        polyupdate43.a1(3206);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-3));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 3);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        polyupdate31.add3(32, (-92), (int) 'a', 0);
        polyupdate31.add3(481, 112, 258, 301);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        int int13 = polyupdate12.sm();
        polyupdate12.a1((-8));
        polyupdate12.a1(315);
        int int18 = polyupdate12.sm();
        polyupdate12.add3((int) (short) 0, 3064, 367, 381);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 299 + "'", int13 == 299);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 921 + "'", int18 == 921);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1(6);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(1318);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 717);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 742);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.a1(3);
        polyupdate0.a1(7);
        polyupdate0.add3((int) (short) 10, (-9), 0, (-4));
        polyupdate0.clear();
        polyupdate0.add3(0, 361, 271, 8);
        polyupdate0.add3(2620, 921, 3723, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1494);
        polyupdate35.add3(0, 1112, 535, 189);
        polyupdate35.add3(78, 291, 581, 104);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 577);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 100);
        int int38 = polyupdate37.sm();
        int int39 = polyupdate37.sm();
        polyupdate37.add3(2467, 1439, 123, 4100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 209 + "'", int38 == 209);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 209 + "'", int39 == 209);
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 664);
        polyupdate29.add3(116, 6519, 1007, 8064);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
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
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList3, 2099);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList3, 696);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 1022);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 109);
        int int17 = polyupdate16.sm();
        polyupdate16.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 161);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 564);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 3004);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 607);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 143);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1588);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 165);
        polyupdate35.a1(1808);
        java.lang.Class<?> wildcardClass38 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.add3(37, 415, 1241, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        int int35 = polyupdate29.sm();
        polyupdate29.a1((-8));
        polyupdate29.clear();
        polyupdate29.a1(4);
        polyupdate29.clear();
        polyupdate29.a1(1794);
        polyupdate29.add3(2492, 1892, (int) (short) 100, 836);
        polyupdate29.add3(1737, 2893, 1392, 306);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1405);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 788);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a1(98);
        polyupdate29.a1((int) (byte) 100);
        polyupdate29.add3((int) '4', 9, 141, (-1));
        polyupdate29.a1(332);
        polyupdate29.add3(41, 805, 829, 1342);
        int int46 = polyupdate29.sm();
        polyupdate29.clear();
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3017 + "'", int46 == 3017);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1((int) ' ');
        polyupdate0.a1(97);
        polyupdate0.a1(1010);
        int int13 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2278 + "'", int13 == 2278);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 549);
        int int36 = polyupdate35.sm();
        polyupdate35.a1(251);
        polyupdate35.add3(302, 138, 0, 360);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 658 + "'", int36 == 658);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        polyupdate12.clear();
        polyupdate12.a1(0);
        polyupdate12.a1(590);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 426);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1015);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 507);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1873);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a1(86);
        polyupdate0.add3(322, 1146, 1198, 737);
        polyupdate0.clear();
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate31.a1((-10));
        int int34 = polyupdate31.sm();
        int int35 = polyupdate31.sm();
        polyupdate31.a1(104);
        int int38 = polyupdate31.sm();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 196 + "'", int34 == 196);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 196 + "'", int35 == 196);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 404 + "'", int38 == 404);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-5));
        int int34 = polyupdate33.sm();
        polyupdate33.clear();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 104 + "'", int34 == 104);
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 839);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 2628);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 1039);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.add3(577, 58, 154, 7);
        polyupdate29.a1(113);
        polyupdate29.add3(5534, 10, 657, 92);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 880);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a1((-6));
        polyupdate0.a1(9);
        polyupdate0.a1((int) '#');
        polyupdate0.add3(141, 109, 0, (int) (short) 1);
        polyupdate0.clear();
        polyupdate0.add3(102, 0, 0, 41);
        polyupdate0.a1((int) (short) 0);
        polyupdate0.add3(1257, 836, 3694, 251);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a1((-1));
        polyupdate0.a1(0);
        polyupdate0.add3((int) (byte) 10, (-17), 244, (int) (byte) 10);
        polyupdate0.add3((-1), 8, 10, (-2));
        int int18 = polyupdate0.sm();
        polyupdate0.a1(777);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, (int) (byte) 1);
        int int44 = polyupdate43.sm();
        polyupdate43.a1(1111);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 110 + "'", int44 == 110);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a1(1);
        polyupdate27.add3(9, (-10), 4, 161);
        polyupdate27.a1(0);
        polyupdate27.add3(117, 424, 218, (-3));
        int int42 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 756 + "'", int42 == 756);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.add3((-9), 0, 98, (-7));
        polyupdate0.clear();
        int int14 = polyupdate0.sm();
        int int15 = polyupdate0.sm();
        polyupdate0.add3(408, 1876, 3519, 521);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.a1(5);
        polyupdate0.add3(0, (-6), 141, 91);
        int int20 = polyupdate0.sm();
        int int21 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 226 + "'", int20 == 226);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 226 + "'", int21 == 226);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(5);
        int int10 = polyupdate0.sm();
        polyupdate0.a1(0);
        polyupdate0.add3(20, (-1), 21, 379);
        polyupdate0.a1(0);
        polyupdate0.a1(921);
        polyupdate0.a1(660);
        java.lang.Class<?> wildcardClass24 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-1));
        int int38 = polyupdate37.sm();
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 108 + "'", int38 == 108);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 212);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1241);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 122);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1986);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 9);
        polyupdate35.add3(839, 429, (-15), 111);
        int int41 = polyupdate35.sm();
        polyupdate35.a1(1112);
        polyupdate35.add3(973, 149, 10382, 3689);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1364 + "'", int41 == 1364);
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.add3(85, 727, 342, 135);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        int int32 = polyupdate31.sm();
        polyupdate31.a1(775);
        polyupdate31.a1(98);
        java.lang.Class<?> wildcardClass37 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 244 + "'", int32 == 244);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        int int30 = polyupdate29.sm();
        int int31 = polyupdate29.sm();
        polyupdate29.a1(2);
        int int34 = polyupdate29.sm();
        polyupdate29.add3(380, 1023, 1203, 4517);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 109 + "'", int31 == 109);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 113 + "'", int34 == 113);
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1441);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, (-3));
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1693);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        polyupdate35.a1(116);
        int int38 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 594 + "'", int38 == 594);
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        polyupdate31.clear();
        polyupdate31.a1(488);
        polyupdate31.a1(425);
        polyupdate31.add3(189, 6603, 2555, 481);
        polyupdate31.add3(3694, 927, 1198, 1848);
        polyupdate31.a1(290);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 209 + "'", int32 == 209);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 209 + "'", int33 == 209);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 15);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 578);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 225);
        polyupdate35.add3(23, 127, 1333, 288);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 44);
        int int36 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 153 + "'", int36 == 153);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 315);
        polyupdate33.a1(531);
        int int36 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1486 + "'", int36 == 1486);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        int int32 = polyupdate31.sm();
        polyupdate31.a1(304);
        polyupdate31.add3(176, 581, 221, 1236);
        java.lang.Class<?> wildcardClass40 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 161 + "'", int32 == 161);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) -1);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 360);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 234);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 606);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 117);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1882);
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1991 + "'", int40 == 1991);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a1(100);
        polyupdate27.add3(10, (int) 'a', 2, (-10));
        int int35 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        int int39 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 99 + "'", int35 == 99);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        polyupdate31.a1((int) 'a');
        polyupdate31.add3(103, 91, 110, (-1));
        int int39 = polyupdate31.sm();
        polyupdate31.clear();
        polyupdate31.a1((-92));
        polyupdate31.add3(0, 952, 1144, 0);
        polyupdate31.add3(14060, 1014, 503, 58);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 303 + "'", int39 == 303);
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 109);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 424);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 640);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 152);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 270);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 18);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 804);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        polyupdate12.a1((int) (short) 1);
        int int15 = polyupdate12.sm();
        java.lang.Class<?> wildcardClass16 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 301 + "'", int15 == 301);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a1(10);
        polyupdate0.clear();
        polyupdate0.a1(0);
        polyupdate0.a1(107);
        polyupdate0.a1(202);
        int int16 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 618 + "'", int16 == 618);
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        polyupdate29.add3(5, 161, 6, (-5));
        polyupdate29.clear();
        polyupdate29.clear();
        polyupdate29.clear();
        polyupdate29.a1(106);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 176);
        polyupdate33.clear();
        int int35 = polyupdate33.sm();
        polyupdate33.a1(1990);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
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
        polyupdate27.a1(209);
        java.lang.Class<?> wildcardClass47 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 839);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 11);
        polyupdate16.a1(9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
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
        int int53 = polyupdate41.sm();
        polyupdate41.add3(106, 2555, 630, 113);
        polyupdate41.clear();
        java.lang.Class<?> wildcardClass60 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1899 + "'", int52 == 1899);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1899 + "'", int53 == 1899);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 109);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 82);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 40);
        polyupdate43.clear();
        polyupdate43.add3(365, 69, 239, 1134);
        polyupdate43.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 390);
        polyupdate41.clear();
        int int43 = polyupdate41.sm();
        polyupdate41.add3(847, 18, 0, 1523);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        polyupdate33.clear();
        polyupdate33.add3(257, 549, 6, 1112);
        int int40 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1924 + "'", int40 == 1924);
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate31.a1(100);
        polyupdate31.add3(318, 318, (int) ' ', 69);
        polyupdate31.a1(101);
        int int41 = polyupdate31.sm();
        int int42 = polyupdate31.sm();
        polyupdate31.add3(811, 1405, 415, 5491);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 939 + "'", int41 == 939);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 939 + "'", int42 == 939);
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a1(5);
        int int10 = polyupdate0.sm();
        polyupdate0.a1(0);
        polyupdate0.a1(1092);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a1((int) (short) 10);
        polyupdate0.a1((int) (byte) 10);
        polyupdate0.a1((-3));
        polyupdate0.add3(0, 8, 839, 914);
        polyupdate0.clear();
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 260);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 216);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2536);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 7064);
        polyupdate37.add3(865, 1014, 259, 3206);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1744);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 332);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1994);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 152);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 270);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 18);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 233);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 418);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
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
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a1((int) ' ');
        polyupdate0.add3(1012, 1, 141, 4);
        polyupdate0.a1(606);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 385);
        polyupdate37.clear();
        polyupdate37.clear();
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }
}

