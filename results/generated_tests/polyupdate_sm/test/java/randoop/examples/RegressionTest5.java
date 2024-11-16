package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate31.add3(502, (-4), (int) 'a', 3);
        int int37 = polyupdate31.sm();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 598 + "'", int37 == 598);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        polyupdate27.add3(9, (-10), 4, 161);
        polyupdate27.a(0);
        polyupdate27.clear();
        int int38 = polyupdate27.sm();
        int int39 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 10);
        polyupdate33.a((int) '4');
        int int36 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 223 + "'", int36 == 223);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 2);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 216);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a(100);
        int int30 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.add3(737, 502, 939, 950);
        polyupdate27.add3(2420, 728, 485, 3670);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 300 + "'", int30 == 300);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        polyupdate12.a(303);
        polyupdate12.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 315 + "'", int17 == 315);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        java.lang.Class<?> wildcardClass32 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        polyupdate29.a(129);
        polyupdate29.add3(967, 1188, 10, 199);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 40);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 426);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, (-100));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList5, 858);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList5, 1782);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(7, 119, 97, 161);
        java.lang.Class<?> wildcardClass26 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 99);
        polyupdate35.a(0);
        polyupdate35.clear();
        polyupdate35.add3(1201, 707, 564, 493);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        polyupdate33.a(564);
        polyupdate33.clear();
        java.lang.Class<?> wildcardClass44 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 109 + "'", int34 == 109);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1039 + "'", int40 == 1039);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 2417);
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, (-7));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        polyupdate33.a(150);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.add3(440, 110, 300, 149);
        polyupdate0.a(134);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 109 + "'", int32 == 109);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 109 + "'", int33 == 109);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.add3(69, 209, 1, (int) (byte) 100);
        polyupdate0.add3(223, (int) (short) -1, (int) (short) -1, 21);
        polyupdate0.a(379);
        int int21 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 424);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 121);
        int int40 = polyupdate39.sm();
        polyupdate39.a((-100));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 230 + "'", int40 == 230);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 40);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 426);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, (-3));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 91);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) '4');
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 1859);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 4);
        polyupdate16.add3(188, 0, 859, 176);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        polyupdate39.add3(581, 332, 0, 1100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        polyupdate31.clear();
        int int33 = polyupdate31.sm();
        polyupdate31.a(802);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 194 + "'", int42 == 194);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(10);
        polyupdate0.add3(164, 308, (int) (byte) 10, 0);
        polyupdate0.add3(6, 7, (-100), 1);
        polyupdate0.add3(4, 10, 86, 257);
        polyupdate0.add3(99, 206, (int) (short) 100, 0);
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass31 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 212);
        polyupdate35.clear();
        int int37 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        polyupdate12.a(92);
        int int15 = polyupdate12.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 325 + "'", int15 == 325);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 307);
        polyupdate35.add3(1427, 3035, 577, 5);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.add3(244, (-6), 251, (-2));
        polyupdate0.clear();
        polyupdate0.add3(69, 429, (int) (byte) 100, 119);
        int int26 = polyupdate0.sm();
        polyupdate0.a(2099);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 717 + "'", int26 == 717);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-17));
        polyupdate0.add3(202, 116, 97, 143);
        polyupdate0.a(332);
        java.lang.Class<?> wildcardClass17 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        int int30 = polyupdate29.sm();
        polyupdate29.a(1);
        polyupdate29.clear();
        polyupdate29.a(4);
        polyupdate29.a(1784);
        polyupdate29.add3(1550, 100, 641, 1793);
        int int43 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 318 + "'", int30 == 318);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4084 + "'", int43 == 4084);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1719);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 612);
        polyupdate41.a(291);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3((int) (byte) 1, 150, (int) (byte) 100, 2);
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 253 + "'", int10 == 253);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.a(135);
        polyupdate33.add3((int) (short) 0, 251, (-1), 58);
        polyupdate33.a((int) (short) -1);
        int int43 = polyupdate33.sm();
        int int44 = polyupdate33.sm();
        polyupdate33.add3(841, 636, 4494, 599);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 307 + "'", int43 == 307);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 307 + "'", int44 == 307);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 564);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 481);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 100);
        int int13 = polyupdate12.sm();
        polyupdate12.clear();
        polyupdate12.add3(4517, 380, 543, 260);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 805);
        polyupdate47.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 109);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 390);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((-100), 0, 8, 0);
        polyupdate0.a((-8));
        int int8 = polyupdate0.sm();
        polyupdate0.add3(41, 3307, 858, 2303);
        java.lang.Class<?> wildcardClass14 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-100) + "'", int8 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate27.add3((int) '#', 114, 98, (-3));
        int int33 = polyupdate27.sm();
        int int34 = polyupdate27.sm();
        polyupdate27.add3(379, 0, 11, 109);
        int int40 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 244 + "'", int33 == 244);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 244 + "'", int34 == 244);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 499 + "'", int40 == 499);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 239);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 769);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        polyupdate37.a(98);
        polyupdate37.add3(18, 82, 0, (-15));
        polyupdate37.add3(8, (-6), (int) (byte) 1, (int) '#');
        int int60 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 38 + "'", int60 == 38);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        polyupdate37.a(7);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        polyupdate33.a(1342);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 150 + "'", int34 == 150);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        polyupdate41.add3(0, (-7), 1142, 1114);
        java.lang.Class<?> wildcardClass50 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        polyupdate33.add3(9, 251, 0, 2);
        polyupdate33.a(2476);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        polyupdate37.add3(182, 301, 0, 2678);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        polyupdate29.a(0);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        int int29 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-2));
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        polyupdate31.add3(144, 196, 206, 3);
        int int39 = polyupdate31.sm();
        int int40 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 107 + "'", int32 == 107);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 107 + "'", int33 == 107);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 549 + "'", int39 == 549);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 549 + "'", int40 == 549);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 109 + "'", int32 == 109);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 109 + "'", int33 == 109);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (-15));
        java.lang.Class<?> wildcardClass11 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 253);
        polyupdate16.clear();
        int int18 = polyupdate16.sm();
        polyupdate16.add3(2239, 0, 20, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.add3((-8), (int) (byte) -1, 701, 1042);
        int int33 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1734 + "'", int33 == 1734);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 225);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(134);
        int int10 = polyupdate0.sm();
        polyupdate0.a(3017);
        polyupdate0.a(322);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        polyupdate25.a(577);
        polyupdate25.a(141);
        polyupdate25.add3(58, 18, 481, 134);
        polyupdate25.a((-92));
        polyupdate25.clear();
        polyupdate25.a(135);
        int int47 = polyupdate25.sm();
        java.lang.Class<?> wildcardClass48 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 270 + "'", int47 == 270);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.a(135);
        polyupdate33.a(150);
        int int38 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 679 + "'", int38 == 679);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.clear();
        polyupdate0.add3((int) '4', 504, (-1), 1);
        polyupdate0.clear();
        int int24 = polyupdate0.sm();
        int int25 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-10));
        int int29 = polyupdate0.sm();
        polyupdate0.add3(304, 0, 3148, 315);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-10) + "'", int29 == (-10));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.a(135);
        polyupdate33.a(2015);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 504, 564, 892, 514, 113, 207, 717, 264, 564, (-2), (-5), 299, 749, 384, 1261, 803, 86, 597, 686, 176, 1, 1719, 322 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        examples.Polyupdate polyupdate28 = new examples.Polyupdate(intList25, 144);
        int int29 = polyupdate28.sm();
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11659 + "'", int29 == 11659);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 197);
        java.lang.Class<?> wildcardClass44 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 641);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 390);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 2628);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        int int42 = polyupdate29.sm();
        int int43 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 150 + "'", int36 == 150);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 894);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 368);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 260);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 216);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2536);
        polyupdate35.a(499);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        polyupdate41.a(0);
        polyupdate41.a(0);
        polyupdate41.a(717);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 110 + "'", int42 == 110);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 110 + "'", int43 == 110);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 92 + "'", int38 == 92);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1092);
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1201 + "'", int40 == 1201);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        int int40 = polyupdate29.sm();
        int int41 = polyupdate29.sm();
        polyupdate29.clear();
        polyupdate29.add3(20, 207, 1012, 1257);
        java.lang.Class<?> wildcardClass48 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 182 + "'", int40 == 182);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 182 + "'", int41 == 182);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 264);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 177);
        polyupdate37.add3(858, 3, 664, 0);
        polyupdate37.clear();
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((int) ' ');
        int int9 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a((-6));
        polyupdate0.a(9);
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        polyupdate49.clear();
        int int51 = polyupdate49.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.clear();
        polyupdate27.a((int) (byte) -1);
        polyupdate27.clear();
        polyupdate27.add3(161, 770, 218, 1198);
        polyupdate27.add3(679, 299, 499, 759);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        polyupdate35.a(543);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 424);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) (byte) -1);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (int) (short) 1);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1294);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 289);
        polyupdate43.add3(1364, (-3), 1, 1550);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        polyupdate27.add3(520, 1199, 1899, 206);
        java.lang.Class<?> wildcardClass33 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 143);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1441);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 2303);
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2412 + "'", int40 == 2412);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        polyupdate37.clear();
        polyupdate37.a(117);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        polyupdate8.add3((int) (short) 0, 829, (-3), 1199);
        polyupdate8.add3(201, 1183, 0, 1899);
        java.lang.Class<?> wildcardClass19 = polyupdate8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.a((int) (byte) 100);
        polyupdate10.clear();
        polyupdate10.add3(561, 109, 4, 101);
        polyupdate10.a(44);
        polyupdate10.a(536);
        polyupdate10.add3(100, 415, 223, (int) (byte) 0);
        polyupdate10.add3(1451, 2420, 2735, 2834);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        polyupdate43.add3(0, 578, 446, 729);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        polyupdate39.add3(261, 231, 810, 425);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        int int6 = polyupdate0.sm();
        int int7 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        int int10 = polyupdate0.sm();
        polyupdate0.a(0);
        polyupdate0.add3(20, (-1), 21, 379);
        polyupdate0.a(0);
        polyupdate0.add3(4, 641, 535, 521);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        polyupdate31.a(9);
        int int42 = polyupdate31.sm();
        polyupdate31.add3(2880, 1719, 9, 1014);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 141 + "'", int32 == 141);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 58 + "'", int38 == 58);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 18 + "'", int42 == 18);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        polyupdate35.a(253);
        polyupdate35.a(1015);
        int int45 = polyupdate35.sm();
        java.lang.Class<?> wildcardClass46 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2959 + "'", int45 == 2959);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        int int22 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(839, 127, 1122, 176);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 251 + "'", int22 == 251);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate12.add3(110, (-10), (-1), (-8));
        java.lang.Class<?> wildcardClass18 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.a((int) (byte) 0);
        polyupdate29.clear();
        int int33 = polyupdate29.sm();
        int int34 = polyupdate29.sm();
        polyupdate29.add3(549, 536, 123, 2303);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) (byte) 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (short) -1);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 759);
        java.lang.Class<?> wildcardClass44 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        polyupdate35.a(101);
        polyupdate35.add3(4, 100, 4, 770);
        polyupdate35.a(239);
        java.lang.Class<?> wildcardClass48 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 260 + "'", int38 == 260);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        polyupdate0.a((-3));
        polyupdate0.a(0);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        polyupdate27.add3(520, 1199, 1899, 206);
        int int33 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3824 + "'", int33 == 3824);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.add3(369, (int) 'a', (-10), 727);
        java.lang.Class<?> wildcardClass35 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 481);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 578);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        polyupdate37.a(390);
        java.lang.Class<?> wildcardClass41 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 108 + "'", int38 == 108);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        polyupdate37.add3(1000, 311, 794, 503);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 967 + "'", int38 == 967);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        polyupdate0.a(773);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 766);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 58);
        java.lang.Class<?> wildcardClass40 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3(260, 0, (-5), 2);
        int int11 = polyupdate0.sm();
        int int12 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass13 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 257 + "'", int11 == 257);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 257 + "'", int12 == 257);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 15);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 578);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 325);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(775, 132, 379, 7);
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a(427);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1293 + "'", int10 == 1293);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1293 + "'", int11 == 1293);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 107);
        polyupdate16.a(4517);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        java.lang.Class<?> wildcardClass34 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 251);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 597);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1237);
        polyupdate31.a(320);
        java.lang.Class<?> wildcardClass34 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        java.lang.Class<?> wildcardClass32 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        polyupdate0.add3((int) (byte) 10, (-17), 244, (int) (byte) 10);
        polyupdate0.add3((-1), 8, 10, (-2));
        int int18 = polyupdate0.sm();
        polyupdate0.a(97);
        int int21 = polyupdate0.sm();
        polyupdate0.add3(1108, 100, 770, 473);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 209 + "'", int21 == 209);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 315);
        polyupdate33.add3(0, 32, 134, 491);
        int int39 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 657 + "'", int39 == 657);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        int int11 = polyupdate0.sm();
        polyupdate0.add3(10, 97, 132, 0);
        polyupdate0.add3(0, 0, (-8), 727);
        polyupdate0.a(624);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3((int) (byte) 100, 98, 58, 1);
        polyupdate0.a(608);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.clear();
        polyupdate27.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 409);
        polyupdate33.a(212);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 141);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1873);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        polyupdate27.clear();
        polyupdate27.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass35 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        polyupdate31.clear();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        polyupdate8.a(161);
        polyupdate8.a((-8));
        polyupdate8.a(44);
        polyupdate8.add3(577, 2099, 161, 803);
        int int20 = polyupdate8.sm();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3640 + "'", int20 == 3640);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        polyupdate39.clear();
        polyupdate39.a(1892);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        int int28 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.add3(11, 4, 107, (int) (byte) 10);
        int int35 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 132 + "'", int35 == 132);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        int int36 = polyupdate35.sm();
        polyupdate35.add3(2, 1237, 499, 660);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 116 + "'", int36 == 116);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 561);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 105);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 318);
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 427 + "'", int38 == 427);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        int int35 = polyupdate29.sm();
        int int36 = polyupdate29.sm();
        polyupdate29.a((-5));
        polyupdate29.clear();
        int int40 = polyupdate29.sm();
        java.lang.Class<?> wildcardClass41 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 150 + "'", int36 == 150);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 100);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 561);
        polyupdate33.clear();
        int int35 = polyupdate33.sm();
        polyupdate33.add3(1757, 495, 6, 311);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        polyupdate35.a((-6));
        polyupdate35.add3((int) ' ', 440, 259, 373);
        polyupdate35.clear();
        polyupdate35.a(362);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        polyupdate31.clear();
        java.lang.Class<?> wildcardClass33 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(134);
        polyupdate0.a(250);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 495);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1579);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 109);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) (byte) 0, 109, (int) (byte) 0, 0);
        polyupdate29.add3(4, (int) (byte) 10, (-100), (-100));
        polyupdate29.clear();
        polyupdate29.clear();
        int int42 = polyupdate29.sm();
        polyupdate29.a((int) (byte) 10);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 107);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 3017);
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 98);
        polyupdate35.add3(299, 7, 108, (-6));
        polyupdate35.add3(69, 800, 144, 367);
        polyupdate35.a(188);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        polyupdate29.add3((-9), 8, (int) (byte) -1, 318);
        polyupdate29.add3(0, 104, 109, 58);
        polyupdate29.clear();
        polyupdate29.a(323);
        int int48 = polyupdate29.sm();
        int int49 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 646 + "'", int48 == 646);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 646 + "'", int49 == 646);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        int int27 = polyupdate25.sm();
        int int28 = polyupdate25.sm();
        polyupdate25.add3(315, 299, 102, (-92));
        int int34 = polyupdate25.sm();
        polyupdate25.add3(929, 32, (-92), 9);
        polyupdate25.add3(102, 929, 325, 660);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 624 + "'", int34 == 624);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        int int28 = polyupdate25.sm();
        polyupdate25.clear();
        int int30 = polyupdate25.sm();
        polyupdate25.clear();
        java.lang.Class<?> wildcardClass32 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 323 + "'", int28 == 323);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 300);
        polyupdate8.a(177);
        polyupdate8.a(769);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 531);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 481);
        polyupdate14.clear();
        polyupdate14.add3(122, 300, 424, (-7));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        polyupdate45.clear();
        java.lang.Class<?> wildcardClass47 = polyupdate45.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 829);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 1014);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 1100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.a(135);
        polyupdate33.add3((int) (short) 0, 251, (-1), 58);
        polyupdate33.a((int) (short) -1);
        int int43 = polyupdate33.sm();
        polyupdate33.add3(325, 1354, 4084, 427);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 307 + "'", int43 == 307);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate45.a(905);
        polyupdate45.a((-2));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        polyupdate27.add3(260, 597, 123, 94);
        polyupdate27.add3((-2), 320, 0, (int) 'a');
        polyupdate27.add3(3148, 4517, 99, 369);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(91);
        int int10 = polyupdate0.sm();
        polyupdate0.add3(712, 770, 56, (-15));
        java.lang.Class<?> wildcardClass16 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 182 + "'", int10 == 182);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 182);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        polyupdate41.a(646);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        java.lang.Class<?> wildcardClass36 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 104 + "'", int34 == 104);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        int int30 = polyupdate29.sm();
        int int31 = polyupdate29.sm();
        polyupdate29.add3((int) '4', 10, 6, 10);
        int int37 = polyupdate29.sm();
        polyupdate29.add3(1092, 144, 1042, 251);
        java.lang.Class<?> wildcardClass43 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 108 + "'", int30 == 108);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 108 + "'", int31 == 108);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 78 + "'", int37 == 78);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) (byte) 0, 109, (int) (byte) 0, 0);
        polyupdate29.add3(4, (int) (byte) 10, (-100), (-100));
        polyupdate29.clear();
        polyupdate29.clear();
        polyupdate29.a(379);
        int int44 = polyupdate29.sm();
        polyupdate29.add3((-5), 332, 659, 244);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 758 + "'", int44 == 758);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        int int7 = polyupdate0.sm();
        int int8 = polyupdate0.sm();
        int int9 = polyupdate0.sm();
        polyupdate0.a(291);
        int int12 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 114 + "'", int7 == 114);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 114 + "'", int8 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 114 + "'", int9 == 114);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 696 + "'", int12 == 696);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.a(135);
        polyupdate33.a(134);
        polyupdate33.clear();
        polyupdate33.add3(209, 58, 23, 108);
        polyupdate33.add3(315, 441, 56, 3046);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.add3(100, (int) (byte) 100, (-1), 3);
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.add3(2, 107, 44, 107);
        java.lang.Class<?> wildcardClass42 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.add3(116, 20, 1039, (int) (short) 10);
        polyupdate0.add3(123, 218, 729, 362);
        polyupdate0.add3(0, 1349, (-100), 259);
        java.lang.Class<?> wildcardClass19 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 260);
        polyupdate31.add3(138, 1679, 85, 92);
        java.lang.Class<?> wildcardClass37 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        polyupdate31.clear();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 100);
        polyupdate43.a(91);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, (int) (short) 0);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList13, 1719);
        java.lang.Class<?> wildcardClass21 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(504);
        java.lang.Class<?> wildcardClass8 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1015);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1090);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 549);
        polyupdate33.add3(107, 239, 127, 2142);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        int int9 = polyupdate8.sm();
        int int10 = polyupdate8.sm();
        polyupdate8.a(107);
        int int13 = polyupdate8.sm();
        java.lang.Class<?> wildcardClass14 = polyupdate8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 214 + "'", int13 == 214);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((int) ' ');
        polyupdate0.a(97);
        polyupdate0.a(1010);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        polyupdate39.clear();
        int int46 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        int int15 = polyupdate14.sm();
        polyupdate14.add3(409, 1280, 320, 244);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15) + "'", int15 == (-15));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 18);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1042);
        polyupdate33.add3(1342, 524, 3820, 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        int int20 = polyupdate0.sm();
        polyupdate0.add3(2015, 0, 1108, 495);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 581 + "'", int20 == 581);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.clear();
        polyupdate10.a(3514);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 303);
        polyupdate43.clear();
        polyupdate43.add3(1007, 23, 859, 161);
        java.lang.Class<?> wildcardClass50 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        java.lang.Class<?> wildcardClass30 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 440);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 3588);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        java.lang.Class<?> wildcardClass34 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.add3((-100), 100, 3, 4);
        int int35 = polyupdate29.sm();
        polyupdate29.add3(2735, (int) ' ', (-1), 100);
        java.lang.Class<?> wildcardClass41 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 7 + "'", int35 == 7);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        polyupdate0.a(300);
        polyupdate0.add3(727, (-1), 267, (-4));
        polyupdate0.add3(608, 1794, 0, 202);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 4);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-4));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1257);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        int int41 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        int int32 = polyupdate31.sm();
        polyupdate31.clear();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 223 + "'", int32 == 223);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass39 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (int) '4');
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, (-92));
        java.lang.Class<?> wildcardClass17 = polyupdate16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 44);
        polyupdate35.a(1352);
        polyupdate35.a((-3));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        polyupdate31.add3(11, 1892, 108, 0);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        polyupdate31.a(0);
        polyupdate31.a(520);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 939 + "'", int41 == 939);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 939 + "'", int42 == 939);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        polyupdate41.add3(379, 332, (-92), 69);
        polyupdate41.clear();
        int int48 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 2620);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 543);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 280);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        int int36 = polyupdate35.sm();
        int int37 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 109 + "'", int36 == 109);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 109 + "'", int37 == 109);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        java.lang.Class<?> wildcardClass8 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        polyupdate35.add3(291, 18, (int) '#', 100);
        int int41 = polyupdate35.sm();
        polyupdate35.clear();
        java.lang.Class<?> wildcardClass43 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 444 + "'", int41 == 444);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 119);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 119);
        polyupdate35.a(504);
        int int38 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1236 + "'", int38 == 1236);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.a(5);
        polyupdate0.a((-6));
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass18 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        polyupdate41.clear();
        polyupdate41.a(1819);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 110 + "'", int42 == 110);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 110 + "'", int43 == 110);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.add3(109, 8, (int) 'a', (int) ' ');
        polyupdate0.a(531);
        int int15 = polyupdate0.sm();
        int int16 = polyupdate0.sm();
        polyupdate0.add3(491, 800, 2, 0);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1308 + "'", int15 == 1308);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1308 + "'", int16 == 1308);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        int int17 = polyupdate16.sm();
        int int18 = polyupdate16.sm();
        polyupdate16.add3(1023, 3640, 803, 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 577 + "'", int17 == 577);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 577 + "'", int18 == 577);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        polyupdate27.a(892);
        java.lang.Class<?> wildcardClass45 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(0, 0, 223, 1);
        polyupdate0.a(0);
        polyupdate0.add3(561, (-1), 97, 1494);
        polyupdate0.add3(987, 4084, 3004, (-9));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.clear();
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        polyupdate10.add3(1551, 533, 56, 1782);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 332 + "'", int18 == 332);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        polyupdate0.a(300);
        java.lang.Class<?> wildcardClass18 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a(98);
        polyupdate29.a((int) (byte) 100);
        polyupdate29.clear();
        int int35 = polyupdate29.sm();
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass37 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, (int) (byte) 100);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 280);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, 1042);
        java.lang.Class<?> wildcardClass17 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) -1);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 1882);
        polyupdate14.clear();
        polyupdate14.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 1652);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 102);
        java.lang.Class<?> wildcardClass11 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        int int10 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass11 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 154 + "'", int10 == 154);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.clear();
        polyupdate0.a(418);
        polyupdate0.add3(564, (int) (short) 100, 368, 226);
        polyupdate0.clear();
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 107);
        polyupdate10.clear();
        polyupdate10.add3(1364, 894, 858, 521);
        polyupdate10.clear();
        int int18 = polyupdate10.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        polyupdate29.add3((-9), 8, (int) (byte) -1, 318);
        polyupdate29.add3(0, 104, 109, 58);
        int int45 = polyupdate29.sm();
        java.lang.Class<?> wildcardClass46 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 271 + "'", int45 == 271);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        int int32 = polyupdate31.sm();
        polyupdate31.a(775);
        java.lang.Class<?> wildcardClass35 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 244 + "'", int32 == 244);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a((int) (short) 0);
        polyupdate0.add3(97, 260, 0, 0);
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass18 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        polyupdate43.add3(134, 369, 444, 69);
        java.lang.Class<?> wildcardClass49 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.a(5);
        int int15 = polyupdate0.sm();
        polyupdate0.a(20);
        polyupdate0.a((int) (short) 100);
        polyupdate0.a(600);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.add3(729, 322, 1007, 854);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 223);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 3722);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 717);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 742);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 4);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 418);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 659);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 138);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 770);
        polyupdate43.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 223);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 624);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, 179);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList13, 964);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList13, 3004);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        polyupdate12.add3(863, (int) 'a', 1057, 92);
        polyupdate12.a(1113);
        java.lang.Class<?> wildcardClass20 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        int int9 = polyupdate8.sm();
        polyupdate8.clear();
        int int11 = polyupdate8.sm();
        polyupdate8.clear();
        polyupdate8.a(257);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        int int11 = polyupdate10.sm();
        int int12 = polyupdate10.sm();
        polyupdate10.a((int) '4');
        polyupdate10.clear();
        java.lang.Class<?> wildcardClass16 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 91 + "'", int11 == 91);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 504, 564, 892, 514, 113, 207, 717, 264, 564, (-2), (-5), 299, 749, 384, 1261, 803, 86, 597, 686, 176, 1, 1719, 322 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        examples.Polyupdate polyupdate28 = new examples.Polyupdate(intList25, 144);
        polyupdate28.a(209);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 660);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        polyupdate31.add3(154, (-5), 426, 253);
        polyupdate31.a(728);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 664);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 2395);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 3004);
        polyupdate16.add3(132, 0, 969, 1983);
        polyupdate16.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, 179);
        int int19 = polyupdate18.sm();
        polyupdate18.add3(1994, 859, 1473, 301);
        polyupdate18.clear();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 766 + "'", int19 == 766);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        int int38 = polyupdate35.sm();
        polyupdate35.a(440);
        int int41 = polyupdate35.sm();
        polyupdate35.a(98);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 308 + "'", int38 == 308);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1188 + "'", int41 == 1188);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.clear();
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass8 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.a(0);
        polyupdate0.a(253);
        polyupdate0.a(921);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.clear();
        polyupdate27.a(0);
        java.lang.Class<?> wildcardClass41 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 0);
        polyupdate35.add3(86, 224, 367, 533);
        polyupdate35.add3(2476, 624, 5, 399);
        int int46 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3504 + "'", int46 == 3504);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 188);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-109));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.add3(20, 543, 315, (-6));
        polyupdate33.a(1293);
        polyupdate33.a((-9));
        int int43 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3449 + "'", int43 == 3449);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 758);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 150);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.a(0);
        polyupdate0.a(2678);
        polyupdate0.a(952);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        polyupdate35.add3(267, 365, 179, 749);
        polyupdate35.clear();
        java.lang.Class<?> wildcardClass43 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        polyupdate37.a(1583);
        java.lang.Class<?> wildcardClass40 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.a(3);
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        int int8 = polyupdate0.sm();
        polyupdate0.a(112);
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 322 + "'", int11 == 322);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        polyupdate33.a(6);
        polyupdate33.a(2228);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        polyupdate31.add3(161, 10, 154, 104);
        polyupdate31.a(21);
        polyupdate31.a((int) (short) -1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        polyupdate29.clear();
        polyupdate29.clear();
        polyupdate29.a(506);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 109 + "'", int31 == 109);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        java.lang.Class<?> wildcardClass42 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 20);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1241);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 332);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        polyupdate10.clear();
        int int12 = polyupdate10.sm();
        polyupdate10.a(503);
        java.lang.Class<?> wildcardClass15 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 100);
        polyupdate43.clear();
        java.lang.Class<?> wildcardClass45 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        polyupdate33.add3(9, 10, (-2), (-6));
        java.lang.Class<?> wildcardClass39 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 164);
        polyupdate33.clear();
        polyupdate33.add3(694, 0, 967, 424);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        polyupdate0.a(3);
        polyupdate0.clear();
        polyupdate0.a(69);
        polyupdate0.add3(82, 390, 154, 86);
        int int29 = polyupdate0.sm();
        polyupdate0.add3(92, 98, 1, 3004);
        java.lang.Class<?> wildcardClass35 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 712 + "'", int29 == 712);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 99);
        polyupdate35.a(112);
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 424);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 121);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 3307);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 97);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(0);
        polyupdate0.a(107);
        int int14 = polyupdate0.sm();
        polyupdate0.a(531);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 214 + "'", int14 == 214);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        polyupdate0.add3(69, (int) 'a', (int) (byte) 1, (int) (byte) 10);
        int int22 = polyupdate0.sm();
        polyupdate0.add3(2015, 119, 17, 1333);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 177 + "'", int22 == 177);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        java.lang.Class<?> wildcardClass46 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        polyupdate37.a(1008);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        polyupdate37.a(98);
        polyupdate37.add3(18, 82, 0, (-15));
        polyupdate37.a(308);
        polyupdate37.add3(0, 360, 1761, 367);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(209);
        polyupdate0.a(365);
        java.lang.Class<?> wildcardClass9 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.add3(85, 727, 342, 135);
        int int39 = polyupdate33.sm();
        java.lang.Class<?> wildcardClass40 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1289 + "'", int39 == 1289);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.add3(0, (-10), (int) (short) -1, (-5));
        polyupdate0.add3((int) (short) 100, (int) (byte) 0, 112, 226);
        polyupdate0.add3(1015, 858, 2, 258);
        polyupdate0.add3(440, 521, 12, (-1));
        polyupdate0.a(362);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        polyupdate41.add3(647, 708, 1441, 399);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 854);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((int) ' ');
        polyupdate0.add3(1012, 1, 141, 4);
        polyupdate0.clear();
        int int15 = polyupdate0.sm();
        polyupdate0.add3(1014, 1541, 226, 1339);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        polyupdate12.a((int) (short) 1);
        polyupdate12.add3(11, 2735, 4, 3);
        int int20 = polyupdate12.sm();
        polyupdate12.add3(686, 869, 0, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2753 + "'", int20 == 2753);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        polyupdate29.add3(3722, 103, 223, 729);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 800 + "'", int43 == 800);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 800 + "'", int44 == 800);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        polyupdate37.add3(119, (-4), 384, 4);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 107);
        polyupdate31.add3(800, 1, 6, (-8));
        int int37 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 799 + "'", int37 == 799);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 229);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        polyupdate35.a(0);
        polyupdate35.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((-100), 0, 8, 0);
        polyupdate0.a(775);
        polyupdate0.add3(647, 0, 141, 429);
        polyupdate0.a(577);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        polyupdate29.add3(0, 577, 98, (-17));
        polyupdate29.add3(318, 101, (int) (byte) 0, 7);
        polyupdate29.add3(251, 10, 20, 429);
        polyupdate29.add3(607, 660, 424, 197);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 212);
        int int36 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 321 + "'", int36 == 321);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        polyupdate43.add3(225, 1794, 144, 1014);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate10.add3(424, 491, 1793, 1719);
        polyupdate10.add3(300, 1349, 839, 425);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 572);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 549);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 56);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 152);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 664);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 264);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        int int28 = polyupdate25.sm();
        polyupdate25.clear();
        int int30 = polyupdate25.sm();
        polyupdate25.add3(426, 32, 18, (-15));
        java.lang.Class<?> wildcardClass36 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 323 + "'", int28 == 323);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 102 + "'", int34 == 102);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 2937);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 418);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 134);
        int int15 = polyupdate14.sm();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 658 + "'", int15 == 658);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        java.lang.Class<?> wildcardClass34 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
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
        int int43 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1193);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
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
        polyupdate35.clear();
        polyupdate35.a(211);
        polyupdate35.clear();
        java.lang.Class<?> wildcardClass42 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        polyupdate31.a(0);
        polyupdate31.add3(429, 189, 572, 641);
        java.lang.Class<?> wildcardClass55 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        polyupdate39.add3((int) 'a', 1241, (-7), 0);
        polyupdate39.add3(82, 0, 572, 135);
        polyupdate39.a(1551);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.add3(114, 607, 264, 488);
        polyupdate27.a(1859);
        polyupdate27.a(2067);
        java.lang.Class<?> wildcardClass39 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 58);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        polyupdate29.add3((-1), 141, 154, (int) '4');
        polyupdate29.a(1342);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 877);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        polyupdate12.add3((-100), 260, 69, 0);
        polyupdate12.clear();
        polyupdate12.add3(624, 267, 701, 803);
        java.lang.Class<?> wildcardClass24 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 1899);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 1114);
        int int54 = polyupdate53.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1223 + "'", int54 == 1223);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.a((int) (short) 10);
        polyupdate0.a(3);
        int int8 = polyupdate0.sm();
        polyupdate0.a(104);
        int int11 = polyupdate0.sm();
        polyupdate0.a(521);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 229 + "'", int11 == 229);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        polyupdate41.add3(58, 140, 612, 288);
        polyupdate41.clear();
        java.lang.Class<?> wildcardClass48 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        polyupdate0.a(3);
        polyupdate0.clear();
        polyupdate0.a(69);
        polyupdate0.add3(82, 390, 154, 86);
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass30 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-5));
        int int36 = polyupdate35.sm();
        int int37 = polyupdate35.sm();
        polyupdate35.a(10);
        java.lang.Class<?> wildcardClass40 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 104 + "'", int36 == 104);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 104 + "'", int37 == 104);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        int int12 = polyupdate0.sm();
        polyupdate0.a(2358);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 300 + "'", int12 == 300);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 247);
        java.lang.Class<?> wildcardClass44 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 424);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 121);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.add3(0, 91, 218, 111);
        int int14 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 420 + "'", int14 == 420);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        int int34 = polyupdate33.sm();
        polyupdate33.a(9);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 110 + "'", int34 == 110);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 315);
        int int11 = polyupdate10.sm();
        java.lang.Class<?> wildcardClass12 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 306 + "'", int11 == 306);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        java.lang.Class<?> wildcardClass46 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate12.add3(110, (-10), (-1), (-8));
        polyupdate12.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(300);
        int int23 = polyupdate0.sm();
        polyupdate0.add3(1112, 895, 581, 123);
        int int29 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 600 + "'", int23 == 600);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2711 + "'", int29 == 2711);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 104);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 164);
        int int46 = polyupdate45.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 273 + "'", int46 == 273);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        int int44 = polyupdate43.sm();
        int int45 = polyupdate43.sm();
        java.lang.Class<?> wildcardClass46 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 149 + "'", int44 == 149);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 149 + "'", int45 == 149);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 197);
        polyupdate43.clear();
        polyupdate43.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        polyupdate25.a(717);
        int int31 = polyupdate25.sm();
        polyupdate25.a(1280);
        java.lang.Class<?> wildcardClass34 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1541 + "'", int31 == 1541);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        polyupdate31.add3(694, (int) ' ', 701, 367);
        int int37 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1794 + "'", int37 == 1794);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 749);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 91);
        polyupdate10.a(2);
        polyupdate10.a(206);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.add3((-15), 1551, 384, 1652);
        polyupdate25.a(652);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 258);
        polyupdate37.a(86);
        int int40 = polyupdate37.sm();
        java.lang.Class<?> wildcardClass41 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 539 + "'", int40 == 539);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
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
        polyupdate33.a(564);
        java.lang.Class<?> wildcardClass43 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 109 + "'", int34 == 109);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1039 + "'", int40 == 1039);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 209);
        polyupdate31.clear();
        polyupdate31.a(111);
        polyupdate31.a((-15));
        int int37 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 207 + "'", int37 == 207);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 335 + "'", int38 == 335);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        int int51 = polyupdate41.sm();
        polyupdate41.add3(1012, 229, 839, 218);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1352 + "'", int51 == 1352);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate31.add3(21, 0, 114, (-3));
        polyupdate31.clear();
        polyupdate31.add3(1261, 0, (int) (short) 0, 1015);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        int int38 = polyupdate35.sm();
        polyupdate35.a(440);
        int int41 = polyupdate35.sm();
        int int42 = polyupdate35.sm();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 308 + "'", int38 == 308);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1188 + "'", int41 == 1188);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1188 + "'", int42 == 1188);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        polyupdate31.clear();
        int int33 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
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
        polyupdate0.add3(148, 1015, 390, 435);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        polyupdate35.add3(154, 20, 4, 164);
        polyupdate35.add3(202, 111, 141, 10);
        int int48 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 464 + "'", int48 == 464);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 869);
        polyupdate41.a(963);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        polyupdate37.a(581);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        polyupdate31.add3((-7), 0, 794, 270);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 532 + "'", int34 == 532);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        polyupdate31.add3(44, 1057, 5, 1339);
        polyupdate31.add3(244, 311, 429, 1354);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(7, 119, 97, 161);
        polyupdate0.a(0);
        int int28 = polyupdate0.sm();
        int int29 = polyupdate0.sm();
        polyupdate0.a((int) '#');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 384 + "'", int28 == 384);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 384 + "'", int29 == 384);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 829);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 1014);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 101);
        polyupdate51.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        polyupdate0.add3(99, 135, 154, 20);
        java.lang.Class<?> wildcardClass25 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, 179);
        int int19 = polyupdate18.sm();
        int int20 = polyupdate18.sm();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 766 + "'", int19 == 766);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 766 + "'", int20 == 766);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate31.a((-10));
        polyupdate31.clear();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        polyupdate31.add3(99, 318, 164, 427);
        polyupdate31.add3(264, 303, 1793, 290);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        polyupdate25.a(717);
        int int31 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.add3(144, 485, 1241, 250);
        polyupdate25.a(506);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1541 + "'", int31 == 1541);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(0);
        int int12 = polyupdate0.sm();
        int int13 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        polyupdate37.add3(841, 304, 1994, 299);
        polyupdate37.a(1289);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 4);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, (-109));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 98);
        polyupdate35.add3(299, 7, 108, (-6));
        polyupdate35.add3(18, 2303, 800, 0);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        polyupdate45.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a(1);
        polyupdate0.a((-10));
        polyupdate0.a((int) (byte) -1);
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass23 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        polyupdate39.add3(0, 469, 409, 564);
        int int46 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1442 + "'", int46 == 1442);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        polyupdate37.add3(320, 532, 599, 424);
        int int44 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 597 + "'", int38 == 597);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1875 + "'", int44 == 1875);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 121);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1761);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        polyupdate8.add3((-6), 0, 6, 82);
        int int14 = polyupdate8.sm();
        polyupdate8.clear();
        polyupdate8.a(2834);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 82 + "'", int14 == 82);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.add3(244, (-6), 251, (-2));
        polyupdate0.clear();
        polyupdate0.add3(69, 429, (int) (byte) 100, 119);
        int int26 = polyupdate0.sm();
        polyupdate0.a(308);
        polyupdate0.a(854);
        polyupdate0.a(707);
        polyupdate0.add3(1293, 2834, 1092, 1116);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 717 + "'", int26 == 717);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 176);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2753);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 8);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 299);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
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
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
        int int38 = polyupdate37.sm();
        int int39 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 641 + "'", int38 == 641);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 641 + "'", int39 == 641);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(504);
        polyupdate0.add3(2492, 540, 1480, 488);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 103);
        java.lang.Class<?> wildcardClass30 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        int int30 = polyupdate29.sm();
        polyupdate29.add3(10, 41, (-3), (-4));
        int int36 = polyupdate29.sm();
        int int37 = polyupdate29.sm();
        int int38 = polyupdate29.sm();
        int int39 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 108 + "'", int30 == 108);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 44 + "'", int36 == 44);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 44 + "'", int37 == 44);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 44 + "'", int38 == 44);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 44 + "'", int39 == 44);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
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
        polyupdate37.a(204);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1042);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 250);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        polyupdate12.add3(270, 100, 197, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 894 + "'", int19 == 894);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.a(3);
        polyupdate0.a(7);
        polyupdate0.a((int) 'a');
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 107);
        polyupdate39.add3(1473, 545, 23, 1364);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        polyupdate37.clear();
        polyupdate37.a(202);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        int int11 = polyupdate10.sm();
        int int12 = polyupdate10.sm();
        polyupdate10.a((int) '4');
        polyupdate10.a(4);
        polyupdate10.add3(2303, 329, 0, 854);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 91 + "'", int11 == 91);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 132);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 201);
        polyupdate35.add3(1038, 92, 536, 745);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.clear();
        polyupdate0.add3(15, (int) (byte) 10, 108, 1);
        polyupdate0.add3(152, 129, 1, 624);
        polyupdate0.clear();
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        int int29 = polyupdate25.sm();
        polyupdate25.add3(1, 2, 97, 1);
        int int35 = polyupdate25.sm();
        polyupdate25.a(91);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-2));
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        int int34 = polyupdate31.sm();
        polyupdate31.a(854);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 107 + "'", int32 == 107);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 107 + "'", int33 == 107);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 107 + "'", int34 == 107);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        int int42 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.a(1);
        polyupdate0.a(1910);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.a((int) (byte) 100);
        polyupdate10.clear();
        polyupdate10.clear();
        polyupdate10.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.clear();
        polyupdate0.add3(299, 0, 1293, (-9));
        polyupdate0.a(444);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        polyupdate8.a((-10));
        int int11 = polyupdate8.sm();
        polyupdate8.add3(0, 132, 101, (-8));
        polyupdate8.a(727);
        int int19 = polyupdate8.sm();
        polyupdate8.clear();
        polyupdate8.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10) + "'", int11 == (-10));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1679 + "'", int19 == 1679);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.a(577);
        polyupdate25.clear();
        int int31 = polyupdate25.sm();
        int int32 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        int int29 = polyupdate25.sm();
        polyupdate25.add3(1, 2, 97, 1);
        polyupdate25.a(107);
        java.lang.Class<?> wildcardClass37 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.a(135);
        polyupdate33.add3((int) (short) 0, 251, (-1), 58);
        int int41 = polyupdate33.sm();
        polyupdate33.a(1782);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 308 + "'", int41 == 308);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (byte) 0);
        polyupdate35.a(58);
        int int38 = polyupdate35.sm();
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 225 + "'", int38 == 225);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 599);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 361);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) (byte) 0, 109, (int) (byte) 0, 0);
        polyupdate29.clear();
        polyupdate29.add3(858, 928, 2735, 1183);
        java.lang.Class<?> wildcardClass41 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        polyupdate35.add3(291, 18, (int) '#', 100);
        int int41 = polyupdate35.sm();
        polyupdate35.clear();
        int int43 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 444 + "'", int41 == 444);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((-100), 0, 8, 0);
        polyupdate0.a((-8));
        int int8 = polyupdate0.sm();
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-100) + "'", int8 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-100) + "'", int10 == (-100));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-100) + "'", int11 == (-100));
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        polyupdate39.add3(564, 58, 520, 56);
        java.lang.Class<?> wildcardClass49 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 290 + "'", int42 == 290);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.add3(100, (int) (byte) 100, (-1), 3);
        int int35 = polyupdate25.sm();
        polyupdate25.add3(202, 1092, 189, 132);
        polyupdate25.a(2395);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 202 + "'", int35 == 202);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(100, (int) '4', (int) (short) -1, (-3));
        polyupdate0.add3((-1), 427, 44, 543);
        polyupdate0.add3(1057, 82, 1364, 630);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        polyupdate35.add3(686, 299, 839, 325);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 318);
        polyupdate31.add3(969, 524, 100, 1142);
        java.lang.Class<?> wildcardClass37 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 134);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 104);
        polyupdate37.add3(1899, (int) (byte) -1, 1199, 664);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.a(5);
        int int15 = polyupdate0.sm();
        polyupdate0.a(20);
        polyupdate0.a((int) (short) 100);
        polyupdate0.add3(204, (int) '#', 0, 140);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 2066);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 112);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 105);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 440);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3((int) (short) 100, (-4), (int) (short) 0, (-8));
        polyupdate0.a(7);
        polyupdate0.a(135);
        polyupdate0.a(214);
        java.lang.Class<?> wildcardClass17 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 433);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 10);
        polyupdate31.add3(218, 770, 10, (int) 'a');
        polyupdate31.a((int) (short) -1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        java.lang.Class<?> wildcardClass15 = polyupdate14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 98);
        polyupdate33.add3(1719, 85, 0, 4);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 179);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 788);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 939);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        java.lang.Class<?> wildcardClass40 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 532 + "'", int34 == 532);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
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
        int int44 = polyupdate43.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 641 + "'", int44 == 641);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        polyupdate31.add3(32, (-92), (int) 'a', 0);
        polyupdate31.add3(481, 112, 258, 301);
        polyupdate31.a(553);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        java.lang.Class<?> wildcardClass42 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 488);
        polyupdate33.clear();
        polyupdate33.add3((int) (short) 100, 1112, 212, 194);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 315);
        polyupdate33.add3(244, 223, 152, (int) (byte) 1);
        polyupdate33.add3(967, 211, 202, 1010);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 134);
        int int36 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 243 + "'", int36 == 243);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
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
        polyupdate41.clear();
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a(107);
        polyupdate27.add3((-7), (int) (byte) 10, (int) '4', (int) (short) 1);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.a(2067);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-5));
        polyupdate37.a(369);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        polyupdate35.add3(141, 15, (int) ' ', 99);
        polyupdate35.add3(572, 239, 549, 58);
        java.lang.Class<?> wildcardClass46 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate31.a(100);
        polyupdate31.a(82);
        polyupdate31.a(165);
        polyupdate31.a(418);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (byte) 1);
        polyupdate35.a(38);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1899);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 536);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 44);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 113);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, (int) (short) 0);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList13, 97);
        polyupdate20.add3(0, 58, 20, (int) (short) 1);
        polyupdate20.clear();
        polyupdate20.add3(2015, 1757, 632, (-15));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        polyupdate12.add3((-100), 260, 69, 0);
        polyupdate12.a(20);
        polyupdate12.a((-2));
        int int22 = polyupdate12.sm();
        polyupdate12.add3(373, 1583, 950, 1859);
        polyupdate12.add3(1451, 369, 851, (-100));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 267 + "'", int22 == 267);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.add3(8, 107, 0, (int) (short) 100);
        polyupdate0.clear();
        polyupdate0.a((-92));
        int int15 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-92) + "'", int15 == (-92));
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
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
        polyupdate27.add3(152, 109, 717, 2);
        polyupdate27.clear();
        polyupdate27.a(369);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 135 + "'", int35 == 135);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
        polyupdate29.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-15));
        int int38 = polyupdate37.sm();
        polyupdate37.add3(481, 239, 132, 112);
        polyupdate37.a(1236);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 94 + "'", int38 == 94);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
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
        polyupdate0.add3(204, 803, 98, 41);
        int int21 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass22 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 91 + "'", int14 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 91 + "'", int15 == 91);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1146 + "'", int21 == 1146);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 135);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        int int32 = polyupdate31.sm();
        polyupdate31.clear();
        polyupdate31.add3(129, 543, 429, 177);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 244 + "'", int32 == 244);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 315);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-10));
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 99 + "'", int38 == 99);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.a(251);
        polyupdate27.add3((-6), 502, (-5), 40);
        polyupdate27.add3(114, 211, 418, 164);
        polyupdate27.add3(384, (-1), 109, (int) (short) -1);
        polyupdate27.add3(524, 0, 4, 286);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 112);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 105);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 440);
        polyupdate39.a(433);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        polyupdate39.add3((-109), 189, 118, 768);
        int int45 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 966 + "'", int45 == 966);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        polyupdate12.a(9);
        int int15 = polyupdate12.sm();
        int int16 = polyupdate12.sm();
        java.lang.Class<?> wildcardClass17 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 117 + "'", int16 == 117);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.add3((-100), 100, 3, 4);
        polyupdate29.a(1994);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 107);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 581);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 2303);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 1183);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 1188);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.a(97);
        int int32 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 355 + "'", int32 == 355);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 6);
        java.lang.Class<?> wildcardClass34 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 543);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 390);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a((int) (short) 0);
        polyupdate0.add3(97, 260, 0, 0);
        polyupdate0.add3(41, 369, 176, 1679);
        int int22 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2265 + "'", int22 == 2265);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
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
        polyupdate37.add3(0, 2976, 658, 928);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 481 + "'", int48 == 481);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        int int11 = polyupdate0.sm();
        polyupdate0.add3(10, 97, 132, 0);
        int int17 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(264, 129, 257, 440);
        polyupdate0.clear();
        int int25 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 239 + "'", int17 == 239);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
        polyupdate37.add3(1, (int) (byte) -1, 775, 577);
        polyupdate37.clear();
        java.lang.Class<?> wildcardClass44 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        polyupdate27.a((-3));
        polyupdate27.add3(91, (-1), 97, 10);
        polyupdate27.add3(600, (int) 'a', 1042, 2536);
        polyupdate27.a(707);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        polyupdate29.clear();
        polyupdate29.add3((int) (short) 100, 10, 0, (-100));
        polyupdate29.clear();
        polyupdate29.a(10);
        java.lang.Class<?> wildcardClass44 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 107);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-9));
        java.lang.Class<?> wildcardClass13 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        polyupdate33.a(531);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 15);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 578);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 225);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        polyupdate8.add3((-6), 0, 6, 82);
        polyupdate8.a(0);
        polyupdate8.a(3824);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        polyupdate33.add3(20, 543, 315, (-6));
        polyupdate33.a(1293);
        polyupdate33.a(189);
        polyupdate33.a(657);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
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
        int int40 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 882 + "'", int40 == 882);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(0, 0, 223, 1);
        polyupdate0.clear();
        polyupdate0.add3(100, 561, 308, 0);
        polyupdate0.a(851);
        java.lang.Class<?> wildcardClass23 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 553);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 129);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 189);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 3784);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(150, 58, 260, (-100));
        int int15 = polyupdate0.sm();
        polyupdate0.add3(2, 1116, 7, 318);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 368 + "'", int15 == 368);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        polyupdate14.a((int) 'a');
        polyupdate14.add3(2678, 647, 427, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        int int11 = polyupdate10.sm();
        polyupdate10.add3(108, 134, 69, 2);
        polyupdate10.add3(114, 98, (int) 'a', (-1));
        polyupdate10.clear();
        polyupdate10.clear();
        polyupdate10.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-9) + "'", int11 == (-9));
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 418);
        polyupdate33.clear();
        polyupdate33.a(0);
        polyupdate33.a(561);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        polyupdate27.add3(9, (-10), 4, 161);
        polyupdate27.clear();
        int int36 = polyupdate27.sm();
        polyupdate27.a(118);
        polyupdate27.a(132);
        polyupdate27.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        polyupdate41.add3(138, 561, 1541, 427);
        polyupdate41.add3(660, 1308, (int) '#', 2066);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.a(0);
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(41);
        polyupdate0.clear();
        polyupdate0.a(3017);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 109);
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        polyupdate31.a(1199);
        polyupdate31.clear();
        int int37 = polyupdate31.sm();
        polyupdate31.a(321);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 218 + "'", int32 == 218);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 218 + "'", int33 == 218);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass4 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 315);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 143);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 165);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        polyupdate25.add3(223, (-6), (-6), (int) (byte) 10);
        polyupdate25.clear();
        polyupdate25.clear();
        int int39 = polyupdate25.sm();
        int int40 = polyupdate25.sm();
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
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
        int int40 = polyupdate39.sm();
        int int41 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 116 + "'", int40 == 116);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 116 + "'", int41 == 116);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        int int11 = polyupdate10.sm();
        polyupdate10.clear();
        polyupdate10.clear();
        polyupdate10.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-9) + "'", int11 == (-9));
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
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
        polyupdate37.a(1793);
        java.lang.Class<?> wildcardClass41 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 369 + "'", int38 == 369);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-15));
        polyupdate37.a((-7));
        polyupdate37.add3(210, (-15), 3968, 485);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        int int47 = polyupdate29.sm();
        java.lang.Class<?> wildcardClass48 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3017 + "'", int46 == 3017);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3017 + "'", int47 == 3017);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 3580);
        java.lang.Class<?> wildcardClass44 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1092);
        int int38 = polyupdate37.sm();
        polyupdate37.add3(1784, 1354, 1882, 4952);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1201 + "'", int38 == 1201);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.add3(0, (-10), (int) (short) -1, (-5));
        polyupdate0.add3((int) (short) 100, (int) (byte) 0, 112, 226);
        polyupdate0.add3(1015, 858, 2, 258);
        int int21 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2133 + "'", int21 == 2133);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 686);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1541);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
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
        polyupdate41.add3(138, 561, 1541, 427);
        polyupdate41.add3(4841, 1223, 423, 362);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
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
        polyupdate41.add3(1392, 1308, 1280, 4952);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 113);
        int int40 = polyupdate39.sm();
        polyupdate39.add3((int) (short) 0, 597, 491, 223);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 222 + "'", int40 == 222);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 251);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 597);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1237);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 148);
        java.lang.Class<?> wildcardClass34 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 894);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 770);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 3004);
        polyupdate43.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(577, (int) (byte) -1, (-9), (-6));
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        int int9 = polyupdate0.sm();
        polyupdate0.add3(0, 429, 289, 2735);
        java.lang.Class<?> wildcardClass15 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        polyupdate0.a(332);
        polyupdate0.add3((-100), 1122, 1342, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.add3((int) '4', 9, (int) (short) 1, 7);
        int int9 = polyupdate0.sm();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass11 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
        java.lang.Class<?> wildcardClass44 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 109);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 424);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 210);
        polyupdate39.add3(1113, 106, 2976, 1128);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        polyupdate35.a(1451);
        int int40 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2902 + "'", int40 == 2902);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        java.lang.Class<?> wildcardClass18 = polyupdate16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 291 + "'", int17 == 291);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1744);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1293);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 250);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 707);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        polyupdate35.a(829);
        polyupdate35.add3(2228, 8, 3586, 2067);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
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
        polyupdate0.add3((int) (short) 1, 86, 318, 58);
        polyupdate0.a(11659);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 189);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 118);
        polyupdate12.clear();
        polyupdate12.add3(1990, 58, 4841, 1092);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 109);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(134);
        polyupdate0.a(424);
        int int12 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1238 + "'", int12 == 1238);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 664);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 2395);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 3004);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
        int int38 = polyupdate37.sm();
        polyupdate37.clear();
        polyupdate37.add3(32, 150, 660, (-17));
        polyupdate37.a(290);
        int int47 = polyupdate37.sm();
        java.lang.Class<?> wildcardClass48 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 109 + "'", int38 == 109);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1405 + "'", int47 == 1405);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }
}

