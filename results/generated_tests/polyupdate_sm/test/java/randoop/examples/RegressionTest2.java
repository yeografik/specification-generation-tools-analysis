package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        polyupdate0.add3(100, (-10), 9, 7);
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.lang.Class<?> wildcardClass45 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        polyupdate37.clear();
        int int39 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        polyupdate35.a(154);
        polyupdate35.clear();
        java.lang.Class<?> wildcardClass39 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        polyupdate29.a(315);
        java.lang.Class<?> wildcardClass32 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        java.lang.Class<?> wildcardClass45 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        polyupdate31.add3(379, (-15), (-6), 91);
        polyupdate31.add3(1199, 85, 23, 154);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-7));
        java.lang.Class<?> wildcardClass32 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        polyupdate31.add3(99, 318, 164, 427);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.a(101);
        polyupdate0.clear();
        polyupdate0.add3(108, 154, 21, 121);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-3));
        polyupdate12.clear();
        polyupdate12.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 150);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        java.lang.Class<?> wildcardClass47 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3017 + "'", int46 == 3017);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 101);
        polyupdate31.a(1015);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a((-17));
        polyupdate0.a(2);
        polyupdate0.a((-9));
        int int18 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 112 + "'", int18 == 112);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        java.lang.Class<?> wildcardClass32 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 43);
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        polyupdate0.a(0);
        int int29 = polyupdate0.sm();
        int int30 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(192);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 6);
        polyupdate33.add3(103, 161, 197, 141);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        java.lang.Class<?> wildcardClass11 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass43 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.a((int) (short) 10);
        polyupdate0.a(3);
        int int8 = polyupdate0.sm();
        polyupdate0.a(104);
        int int11 = polyupdate0.sm();
        polyupdate0.add3(150, 111, (int) (byte) 10, 43);
        int int17 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 229 + "'", int11 == 229);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 314 + "'", int17 == 314);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 100);
        int int13 = polyupdate12.sm();
        polyupdate12.add3((int) ' ', 260, 41, 561);
        polyupdate12.clear();
        polyupdate12.add3(110, 58, 209, 1008);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) (byte) 0, 109, (int) (byte) 0, 0);
        polyupdate29.add3((int) (short) 1, 1, 114, (int) (short) 0);
        java.lang.Class<?> wildcardClass40 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((-100), 0, 8, 0);
        polyupdate0.a(775);
        polyupdate0.clear();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 20);
        polyupdate43.add3(0, 624, 116, 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        int int37 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        polyupdate41.clear();
        int int43 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(9);
        int int4 = polyupdate0.sm();
        polyupdate0.add3(260, 803, 109, 488);
        java.lang.Class<?> wildcardClass10 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.lang.Class<?> wildcardClass27 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        polyupdate37.a((int) (byte) 100);
        java.lang.Class<?> wildcardClass40 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        int int42 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 176 + "'", int41 == 176);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 176 + "'", int42 == 176);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 577);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 271);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 290);
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 399 + "'", int40 == 399);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.a(164);
        int int36 = polyupdate33.sm();
        java.lang.Class<?> wildcardClass37 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 429 + "'", int36 == 429);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate31.a(929);
        java.lang.Class<?> wildcardClass34 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        polyupdate29.clear();
        polyupdate29.add3(1541, 800, 514, 82);
        int int41 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2937 + "'", int41 == 2937);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        java.lang.Class<?> wildcardClass46 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        polyupdate31.add3(543, 132, (int) '4', 251);
        java.lang.Class<?> wildcardClass37 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        int int29 = polyupdate25.sm();
        int int30 = polyupdate25.sm();
        polyupdate25.add3(493, 749, 0, 111);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((int) ' ');
        polyupdate0.a(369);
        int int11 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 802 + "'", int11 == 802);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        polyupdate39.add3(329, 737, 551, 1100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        polyupdate27.add3((int) (byte) 100, (-9), 1859, 218);
        java.lang.Class<?> wildcardClass52 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(1007, 1308, 0, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(69, 209, 6, (-100));
        polyupdate25.add3(264, 202, 58, 440);
        int int37 = polyupdate25.sm();
        java.lang.Class<?> wildcardClass38 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 964 + "'", int37 == 964);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        polyupdate29.add3(0, 577, 98, (-17));
        polyupdate29.add3(318, 101, (int) (byte) 0, 7);
        int int40 = polyupdate29.sm();
        polyupdate29.a(504);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 426 + "'", int40 == 426);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.add3(69, 209, 1, (int) (byte) 100);
        polyupdate0.a(154);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        polyupdate41.add3(1793, 164, 1601, 1994);
        java.lang.Class<?> wildcardClass51 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 110 + "'", int42 == 110);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 110 + "'", int43 == 110);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate10.add3(9, 5, 226, 41);
        polyupdate10.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        int int30 = polyupdate27.sm();
        polyupdate27.clear();
        int int32 = polyupdate27.sm();
        java.lang.Class<?> wildcardClass33 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 211 + "'", int30 == 211);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        int int11 = polyupdate10.sm();
        polyupdate10.clear();
        polyupdate10.clear();
        java.lang.Class<?> wildcardClass14 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-9) + "'", int11 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.clear();
        polyupdate10.add3(150, 112, 369, (-92));
        polyupdate10.clear();
        polyupdate10.a(892);
        polyupdate10.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        polyupdate27.clear();
        java.lang.Class<?> wildcardClass29 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        polyupdate27.add3(4, 9, 1280, 1892);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 135 + "'", int35 == 135);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.a((-15));
        polyupdate0.add3((int) (byte) 10, (int) ' ', 384, 1293);
        java.lang.Class<?> wildcardClass10 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.add3(369, (int) 'a', (-10), 727);
        polyupdate25.add3(97, 177, (-7), 427);
        int int40 = polyupdate25.sm();
        java.lang.Class<?> wildcardClass41 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 694 + "'", int40 == 694);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        polyupdate33.a(729);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-100));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        polyupdate10.add3(1859, 504, 365, 43);
        polyupdate10.clear();
        java.lang.Class<?> wildcardClass17 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        polyupdate39.a((-1));
        polyupdate39.add3(368, 1112, 97, 858);
        java.lang.Class<?> wildcardClass47 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        polyupdate0.a(308);
        int int12 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(390);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 770 + "'", int12 == 770);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 3017);
        polyupdate39.add3(207, 119, (int) (short) 1, 109);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 132);
        int int13 = polyupdate12.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 123 + "'", int13 == 123);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 100);
        int int13 = polyupdate12.sm();
        polyupdate12.add3((int) ' ', 260, 41, 561);
        polyupdate12.clear();
        int int20 = polyupdate12.sm();
        polyupdate12.a(647);
        int int23 = polyupdate12.sm();
        java.lang.Class<?> wildcardClass24 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1294 + "'", int23 == 1294);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate12.add3(110, (-10), (-1), (-8));
        int int18 = polyupdate12.sm();
        polyupdate12.a(91);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 91 + "'", int18 == 91);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 424);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 212);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.add3(1, (int) (short) 0, 7, 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        polyupdate39.a(429);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 141);
        java.lang.Class<?> wildcardClass34 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 202);
        java.lang.Class<?> wildcardClass30 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(0, 253, 9, (-3));
        polyupdate0.a(318);
        int int11 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 895 + "'", int11 == 895);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        polyupdate29.add3(0, 577, 98, (-17));
        polyupdate29.a(9);
        polyupdate29.a(488);
        int int39 = polyupdate29.sm();
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1652 + "'", int39 == 1652);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 624);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        polyupdate39.a(8);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3(41, (int) '#', (int) 'a', 135);
        polyupdate0.a((int) 'a');
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass14 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        polyupdate25.clear();
        polyupdate25.a(551);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        polyupdate37.add3(189, (-1), 365, 308);
        java.lang.Class<?> wildcardClass43 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        polyupdate0.add3(0, 0, 432, (-2));
        java.lang.Class<?> wildcardClass22 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 21);
        polyupdate31.add3(796, 134, (-9), 86);
        int int37 = polyupdate31.sm();
        java.lang.Class<?> wildcardClass38 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1007 + "'", int37 == 1007);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        polyupdate35.add3(1859, 520, 210, 749);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 291 + "'", int36 == 291);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-10));
        polyupdate31.add3(135, 271, 105, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.add3((-10), 0, (int) '4', (int) (byte) 1);
        int int43 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.a(9);
        polyupdate27.a(58);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 43 + "'", int43 == 43);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        int int34 = polyupdate33.sm();
        polyupdate33.clear();
        polyupdate33.clear();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 109 + "'", int34 == 109);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        int int30 = polyupdate29.sm();
        polyupdate29.add3(129, 10, 135, 267);
        polyupdate29.a(91);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 119 + "'", int30 == 119);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 577);
        polyupdate27.add3(1342, 360, (int) (byte) 10, 114);
        java.lang.Class<?> wildcardClass33 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 114);
        java.lang.Class<?> wildcardClass42 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.a(101);
        polyupdate0.clear();
        int int18 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass19 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 114);
        polyupdate41.clear();
        java.lang.Class<?> wildcardClass43 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.add3((int) '4', (-1), 4, 209);
        polyupdate27.add3(775, 641, 141, 7);
        java.lang.Class<?> wildcardClass38 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(0, 0, 223, 1);
        polyupdate0.a(69);
        int int17 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass18 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 362 + "'", int17 == 362);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        java.lang.Class<?> wildcardClass34 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 244 + "'", int32 == 244);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 244 + "'", int33 == 244);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        java.lang.Class<?> wildcardClass38 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3(41, (int) '#', (int) 'a', 135);
        polyupdate0.a((int) 'a');
        int int13 = polyupdate0.sm();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass15 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 502 + "'", int13 == 502);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        polyupdate39.a(577);
        java.lang.Class<?> wildcardClass42 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(134);
        polyupdate0.add3(86, 429, 92, 0);
        polyupdate0.clear();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 271);
        polyupdate47.a(1899);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        int int39 = polyupdate37.sm();
        polyupdate37.add3(1092, (-100), 18, 624);
        polyupdate37.a((int) ' ');
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 109 + "'", int38 == 109);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 109 + "'", int39 == 109);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.a(5);
        polyupdate0.a((-6));
        polyupdate0.add3(15, (-10), (int) (byte) 1, (-15));
        polyupdate0.clear();
        polyupdate0.add3(261, 1342, 0, 624);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(91);
        int int10 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass11 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 182 + "'", int10 == 182);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        polyupdate25.a(577);
        polyupdate25.a(141);
        polyupdate25.clear();
        polyupdate25.add3(0, 362, 426, (int) (short) 0);
        polyupdate25.a(112);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 436);
        java.lang.Class<?> wildcardClass32 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 289);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(134);
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass12 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate33.clear();
        int int35 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        polyupdate39.a(2395);
        polyupdate39.add3(368, 0, 660, 1146);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 290 + "'", int42 == 290);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 436);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        polyupdate35.clear();
        java.lang.Class<?> wildcardClass38 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 597);
        java.lang.Class<?> wildcardClass34 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(20);
        int int8 = polyupdate0.sm();
        polyupdate0.a(1679);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a(770);
        polyupdate0.add3(0, 251, (-2), (int) (byte) 1);
        int int8 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 250 + "'", int8 == 250);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        int int28 = polyupdate27.sm();
        polyupdate27.a((int) (byte) 100);
        polyupdate27.add3(97, 82, (-2), 664);
        int int36 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 841 + "'", int36 == 841);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-5));
        polyupdate12.a(607);
        java.lang.Class<?> wildcardClass15 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        java.lang.Class<?> wildcardClass20 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 253);
        polyupdate33.add3((int) (short) -1, 129, 1, 2);
        polyupdate33.add3(1188, 82, 132, 161);
        polyupdate33.a((int) (short) 10);
        int int46 = polyupdate33.sm();
        polyupdate33.add3(10, 1146, 100, 267);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1583 + "'", int46 == 1583);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        polyupdate37.clear();
        java.lang.Class<?> wildcardClass39 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 502);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 271);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        polyupdate35.a(141);
        int int38 = polyupdate35.sm();
        java.lang.Class<?> wildcardClass39 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 491 + "'", int38 == 491);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        java.lang.Class<?> wildcardClass40 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 109 + "'", int34 == 109);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate31.a((-10));
        java.lang.Class<?> wildcardClass34 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 20);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 101);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, (int) (byte) 100);
        int int13 = polyupdate12.sm();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 624 + "'", int13 == 624);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.add3(108, (int) (byte) 0, 0, 1);
        polyupdate0.a(1793);
        java.lang.Class<?> wildcardClass16 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        int int30 = polyupdate29.sm();
        int int31 = polyupdate29.sm();
        polyupdate29.a(2);
        polyupdate29.a(308);
        java.lang.Class<?> wildcardClass36 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 109 + "'", int31 == 109);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        java.lang.Class<?> wildcardClass39 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 107 + "'", int32 == 107);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 107 + "'", int33 == 107);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        int int30 = polyupdate27.sm();
        int int31 = polyupdate27.sm();
        java.lang.Class<?> wildcardClass32 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 211 + "'", int30 == 211);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 211 + "'", int31 == 211);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 390);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 418);
        java.lang.Class<?> wildcardClass34 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3(41, (int) '#', (int) 'a', 135);
        polyupdate0.a((int) 'a');
        int int13 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass14 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 502 + "'", int13 == 502);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.add3(440, 110, 300, 149);
        polyupdate0.add3(1757, 3, 18, 1679);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.a((int) (byte) 0);
        int int35 = polyupdate27.sm();
        polyupdate27.a(124);
        java.lang.Class<?> wildcardClass38 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 135 + "'", int35 == 135);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        int int13 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(299, 561, (-8), (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 369);
        java.lang.Class<?> wildcardClass13 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a(318);
        polyupdate0.a(796);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        polyupdate29.add3(40, 1652, 308, 829);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 116 + "'", int40 == 116);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        polyupdate10.add3(1, 182, 253, 104);
        polyupdate10.add3(424, 491, 204, 118);
        polyupdate10.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        int int10 = polyupdate0.sm();
        polyupdate0.add3(6, (int) '#', 104, 3);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 154 + "'", int10 == 154);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a(1899);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        polyupdate43.clear();
        int int45 = polyupdate43.sm();
        polyupdate43.a(686);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(577, (int) (byte) -1, (-9), (-6));
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.lang.Class<?> wildcardClass38 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 299);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        int int50 = polyupdate49.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 99 + "'", int50 == 99);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        int int43 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 103 + "'", int42 == 103);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 103 + "'", int43 == 103);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 427);
        int int32 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 536 + "'", int32 == 536);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        java.lang.Class<?> wildcardClass39 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 108 + "'", int38 == 108);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        int int4 = polyupdate0.sm();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass6 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5) + "'", int4 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.add3((-9), 0, 98, (-7));
        int int13 = polyupdate0.sm();
        int int14 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 82 + "'", int13 == 82);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 82 + "'", int14 == 82);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 40);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 426);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, (-100));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList5, 858);
        polyupdate18.add3(270, 301, 444, 2735);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.a((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate27.add3((int) '#', 114, 98, (-3));
        int int33 = polyupdate27.sm();
        polyupdate27.clear();
        java.lang.Class<?> wildcardClass35 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 244 + "'", int33 == 244);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        polyupdate0.a(32);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        polyupdate41.add3(384, 1237, 154, 107);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 91);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) '4');
        polyupdate12.add3(197, 258, 0, 415);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        polyupdate33.add3(9, 10, (-2), (-6));
        polyupdate33.add3(86, 264, 86, 117);
        java.lang.Class<?> wildcardClass44 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.a(0);
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(41);
        polyupdate0.a(192);
        java.lang.Class<?> wildcardClass13 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 543);
        int int34 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 652 + "'", int34 == 652);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        int int30 = polyupdate29.sm();
        polyupdate29.clear();
        polyupdate29.a(531);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.lang.Class<?> wildcardClass20 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 894 + "'", int19 == 894);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        int int8 = polyupdate0.sm();
        polyupdate0.a(112);
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass13 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 322 + "'", int11 == 322);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        polyupdate0.a((-3));
        java.lang.Class<?> wildcardClass12 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.a((-7));
        polyupdate0.add3(8, 775, 641, 444);
        java.lang.Class<?> wildcardClass13 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        polyupdate41.add3(86, 10, (-15), 531);
        java.lang.Class<?> wildcardClass47 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        int int30 = polyupdate29.sm();
        polyupdate29.add3(117, 150, 805, 103);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 161 + "'", int30 == 161);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.a(0);
        int int19 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass20 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 101 + "'", int19 == 101);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.a(101);
        polyupdate0.clear();
        int int18 = polyupdate0.sm();
        int int19 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3(161, (-7), (int) (short) 100, (-1));
        int int33 = polyupdate27.sm();
        polyupdate27.a(770);
        int int36 = polyupdate27.sm();
        int int37 = polyupdate27.sm();
        java.lang.Class<?> wildcardClass38 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 253 + "'", int33 == 253);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1793 + "'", int36 == 1793);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1793 + "'", int37 == 1793);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(0);
        polyupdate0.clear();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass10 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        polyupdate33.add3(432, 69, 749, 7);
        polyupdate33.add3(3017, 113, 1364, (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        int int30 = polyupdate29.sm();
        polyupdate29.add3(561, 257, (-9), 2);
        polyupdate29.add3((int) (short) 0, 481, 1, 32);
        java.lang.Class<?> wildcardClass41 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 110 + "'", int30 == 110);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        polyupdate39.clear();
        polyupdate39.clear();
        java.lang.Class<?> wildcardClass42 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 40);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 426);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, (-100));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList5, 858);
        polyupdate18.a(304);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.add3(368, 202, 551, 197);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-17));
        polyupdate0.clear();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass8 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.add3((-10), 0, (int) '4', (int) (byte) 1);
        polyupdate27.add3(315, 424, (int) (short) 10, 132);
        java.lang.Class<?> wildcardClass48 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        int int27 = polyupdate25.sm();
        int int28 = polyupdate25.sm();
        polyupdate25.add3((-3), 21, 154, 69);
        polyupdate25.a(244);
        polyupdate25.a(543);
        polyupdate25.a(1280);
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(775, 132, 379, 7);
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        int int12 = polyupdate0.sm();
        polyupdate0.a(303);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1293 + "'", int10 == 1293);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1293 + "'", int11 == 1293);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1293 + "'", int12 == 1293);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.lang.Class<?> wildcardClass38 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        polyupdate0.add3(315, 426, 135, (int) (byte) 1);
        int int13 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 877 + "'", int13 == 877);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 98);
        int int36 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 207 + "'", int36 == 207);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        int int29 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 717 + "'", int26 == 717);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1333 + "'", int29 == 1333);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        polyupdate41.add3(794, 1757, 0, 4);
        polyupdate41.a(149);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        polyupdate31.add3(99, 318, 164, 427);
        polyupdate31.a(150);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        java.lang.Class<?> wildcardClass43 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate27.clear();
        polyupdate27.a(182);
        polyupdate27.a(108);
        java.lang.Class<?> wildcardClass33 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        java.lang.Class<?> wildcardClass21 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 100);
        int int13 = polyupdate12.sm();
        polyupdate12.add3((int) ' ', 260, 41, 561);
        polyupdate12.add3((int) (short) 100, (-4), 0, (int) ' ');
        polyupdate12.add3((-5), 124, 267, 91);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        int int13 = polyupdate0.sm();
        polyupdate0.add3(415, 365, 4, 300);
        polyupdate0.a(134);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.a((-7));
        polyupdate0.add3((int) 'a', 521, 905, 694);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-17));
        polyupdate0.add3(20, (int) (byte) 1, 18, 481);
        int int15 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass16 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 520 + "'", int15 == 520);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 94 + "'", int38 == 94);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        polyupdate33.clear();
        int int41 = polyupdate33.sm();
        polyupdate33.clear();
        polyupdate33.clear();
        java.lang.Class<?> wildcardClass44 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        polyupdate0.a(0);
        polyupdate0.add3(189, 1882, 177, 3017);
        polyupdate0.add3(223, 543, 1601, 894);
        polyupdate0.clear();
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        polyupdate35.a(599);
        int int40 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1198 + "'", int40 == 1198);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 441);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        int int40 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 381 + "'", int40 == 381);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        polyupdate31.add3(110, 150, 318, 150);
        polyupdate31.add3(7, 488, 251, 9);
        java.lang.Class<?> wildcardClass42 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a((-17));
        polyupdate0.a(2);
        int int16 = polyupdate0.sm();
        int int17 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 121 + "'", int16 == 121);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 121 + "'", int17 == 121);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.lang.Class<?> wildcardClass36 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 504 + "'", int34 == 504);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 504 + "'", int35 == 504);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        java.lang.Class<?> wildcardClass44 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        polyupdate39.add3(15, 289, (-100), (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 209);
        polyupdate31.clear();
        int int33 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 290);
        java.lang.Class<?> wildcardClass40 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        java.lang.Class<?> wildcardClass46 = polyupdate45.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        java.lang.Class<?> wildcardClass48 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 177);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 3);
        polyupdate12.clear();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.add3((int) '4', 9, (int) (short) 1, 7);
        polyupdate0.a((-7));
        java.lang.Class<?> wildcardClass11 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        int int35 = polyupdate29.sm();
        int int36 = polyupdate29.sm();
        polyupdate29.add3(543, 164, 150, (-1));
        polyupdate29.add3(0, 104, 99, 504);
        int int47 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 150 + "'", int36 == 150);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 707 + "'", int47 == 707);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.a((int) (byte) 100);
        polyupdate10.clear();
        polyupdate10.add3(561, 109, 4, 101);
        polyupdate10.a((int) ' ');
        polyupdate10.a(86);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(134);
        polyupdate0.a(424);
        polyupdate0.clear();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass14 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 578);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        int int7 = polyupdate6.sm();
        polyupdate6.a((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-17) + "'", int7 == (-17));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 314);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        polyupdate41.a((int) 'a');
        int int44 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 304 + "'", int44 == 304);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.add3(108, (int) (byte) 0, 0, 1);
        polyupdate0.a(69);
        int int16 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 247 + "'", int16 == 247);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 117);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        java.lang.Class<?> wildcardClass48 = polyupdate45.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        polyupdate37.clear();
        java.lang.Class<?> wildcardClass39 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        polyupdate39.add3(299, (-1), 502, 92);
        int int45 = polyupdate39.sm();
        java.lang.Class<?> wildcardClass46 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 892 + "'", int45 == 892);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 426);
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 535 + "'", int38 == 535);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 154);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 514);
        java.lang.Class<?> wildcardClass32 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        int int20 = polyupdate12.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 894 + "'", int19 == 894);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 894 + "'", int20 == 894);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        int int6 = polyupdate0.sm();
        polyupdate0.a((int) '4');
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        java.lang.Class<?> wildcardClass46 = polyupdate45.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        java.lang.Class<?> wildcardClass23 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.add3((-100), 100, 3, 4);
        polyupdate29.a(141);
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass38 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        int int40 = polyupdate35.sm();
        java.lang.Class<?> wildcardClass41 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18 + "'", int39 == 18);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 18 + "'", int40 == 18);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        int int30 = polyupdate29.sm();
        polyupdate29.a(368);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 318 + "'", int30 == 318);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(69, 209, 6, (-100));
        polyupdate25.clear();
        polyupdate25.add3((int) (byte) -1, 561, 7, 805);
        polyupdate25.a(6);
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        java.lang.Class<?> wildcardClass41 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 150 + "'", int36 == 150);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        polyupdate31.add3(32, (-92), (int) 'a', 0);
        polyupdate31.clear();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        int int48 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3017 + "'", int46 == 3017);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3017 + "'", int47 == 3017);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3017 + "'", int48 == 3017);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        polyupdate27.add3(436, 581, 712, 176);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 15);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 85);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 315);
        polyupdate33.add3(0, 32, 134, 491);
        polyupdate33.add3(373, 432, 2303, 854);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 161);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-10));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 100);
        int int13 = polyupdate12.sm();
        polyupdate12.add3((int) ' ', 260, 41, 561);
        polyupdate12.clear();
        int int20 = polyupdate12.sm();
        polyupdate12.a(399);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        polyupdate10.a(429);
        polyupdate10.add3(1364, 1793, 314, 399);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a(107);
        int int30 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 314 + "'", int30 == 314);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        polyupdate39.a(2395);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 290 + "'", int42 == 290);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        polyupdate35.clear();
        polyupdate35.a(189);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a((-6));
        polyupdate0.clear();
        polyupdate0.a((-15));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        int int11 = polyupdate10.sm();
        int int12 = polyupdate10.sm();
        polyupdate10.a((int) '4');
        polyupdate10.a(134);
        polyupdate10.a(100);
        java.lang.Class<?> wildcardClass19 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 91 + "'", int11 == 91);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3(260, 0, (-5), 2);
        int int11 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass12 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 257 + "'", int11 == 257);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        polyupdate35.a(112);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.a(561);
        int int6 = polyupdate0.sm();
        polyupdate0.a(99);
        polyupdate0.a(660);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1142 + "'", int6 == 1142);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        polyupdate39.a(1757);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        polyupdate31.add3(399, 597, 182, 514);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 141 + "'", int32 == 141);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 58 + "'", int38 == 58);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 109);
        int int32 = polyupdate31.sm();
        java.lang.Class<?> wildcardClass33 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 218 + "'", int32 == 218);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1042);
        polyupdate33.a(239);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 365);
        polyupdate41.a(5);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 21);
        java.lang.Class<?> wildcardClass32 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 109 + "'", int34 == 109);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        polyupdate31.clear();
        polyupdate31.add3(543, 418, 134, 86);
        java.lang.Class<?> wildcardClass38 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 260);
        polyupdate31.add3(10, 1092, (-2), 0);
        int int37 = polyupdate31.sm();
        polyupdate31.clear();
        int int39 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1100 + "'", int37 == 1100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        polyupdate29.clear();
        polyupdate29.a(543);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.a(0);
        int int7 = polyupdate0.sm();
        int int8 = polyupdate0.sm();
        polyupdate0.add3(290, 362, 0, 381);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        int int27 = polyupdate25.sm();
        polyupdate25.add3(253, 102, 58, 223);
        java.lang.Class<?> wildcardClass33 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        int int42 = polyupdate41.sm();
        polyupdate41.clear();
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 641 + "'", int42 == 641);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 267);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.a((-15));
        polyupdate0.add3((int) (byte) 10, (int) ' ', 384, 1293);
        polyupdate0.a(2735);
        polyupdate0.a(577);
        polyupdate0.add3(97, 1039, 369, 929);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        java.lang.Class<?> wildcardClass39 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 150);
        polyupdate29.add3(270, 1183, 839, 121);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 100);
        int int13 = polyupdate12.sm();
        polyupdate12.add3((int) ' ', 260, 41, 561);
        polyupdate12.add3(549, 300, 1112, 737);
        java.lang.Class<?> wildcardClass24 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(69, 209, 6, (-100));
        polyupdate25.add3(264, 202, 58, 440);
        polyupdate25.a(229);
        polyupdate25.add3(770, 444, 104, 86);
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 260);
        java.lang.Class<?> wildcardClass32 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        polyupdate0.a(369);
        int int18 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1111 + "'", int18 == 1111);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        polyupdate37.clear();
        java.lang.Class<?> wildcardClass39 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(0);
        polyupdate0.add3(0, 549, 267, 226);
        polyupdate0.add3(424, 58, 717, 0);
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass23 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        int int47 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 659 + "'", int47 == 659);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        polyupdate0.a(3);
        polyupdate0.clear();
        polyupdate0.a(69);
        java.lang.Class<?> wildcardClass24 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) (byte) 0, 109, (int) (byte) 0, 0);
        polyupdate29.add3((int) (short) 1, 1, 114, (int) (short) 0);
        int int40 = polyupdate29.sm();
        polyupdate29.add3(796, 597, 98, 373);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 116 + "'", int40 == 116);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a(107);
        polyupdate27.a(2);
        polyupdate27.add3(737, 950, 381, 385);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(69, 92, 299, 226);
        java.lang.Class<?> wildcardClass10 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        polyupdate31.add3(21, 964, 436, 119);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 141 + "'", int32 == 141);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 141 + "'", int33 == 141);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.add3(440, 110, 300, 149);
        polyupdate0.clear();
        polyupdate0.a(1241);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.a(101);
        int int17 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass18 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 426 + "'", int17 == 426);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2);
        polyupdate35.add3((int) (byte) -1, 103, 100, 0);
        polyupdate35.clear();
        int int42 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((int) ' ');
        polyupdate0.add3(1012, 1, 141, 4);
        java.lang.Class<?> wildcardClass14 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 581);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.clear();
        polyupdate33.add3(176, (int) (byte) 10, (-92), 94);
        int int40 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 188 + "'", int40 == 188);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-5));
        java.lang.Class<?> wildcardClass13 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        int int42 = polyupdate41.sm();
        int int43 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 360 + "'", int42 == 360);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 360 + "'", int43 == 360);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        int int10 = polyupdate0.sm();
        polyupdate0.a((-7));
        polyupdate0.add3(742, 572, 111, (-15));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 154 + "'", int10 == 154);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a(98);
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        int int30 = polyupdate29.sm();
        int int31 = polyupdate29.sm();
        polyupdate29.a(2);
        polyupdate29.a((-10));
        polyupdate29.add3(1, 141, 0, (int) '#');
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 109 + "'", int31 == 109);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(10);
        polyupdate0.clear();
        int int11 = polyupdate0.sm();
        polyupdate0.add3((-9), 10, (int) 'a', 8);
        int int17 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 106 + "'", int17 == 106);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        int int34 = polyupdate33.sm();
        polyupdate33.add3(98, (int) '#', 1039, 129);
        polyupdate33.a(69);
        java.lang.Class<?> wildcardClass42 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 99 + "'", int34 == 99);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(2303, 1882, 770, 7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate10.add3(424, 491, 1793, 1719);
        polyupdate10.add3(97, 216, 1333, 521);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        polyupdate37.clear();
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a(647);
        polyupdate0.clear();
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        polyupdate35.a(141);
        polyupdate35.clear();
        polyupdate35.a(829);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.a(3);
        polyupdate0.a(7);
        polyupdate0.add3((int) (short) 10, (-9), 0, (-4));
        polyupdate0.clear();
        polyupdate0.add3(0, 361, 271, 8);
        polyupdate0.a(23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.add3(108, (int) (byte) 0, 0, 1);
        polyupdate0.a(1793);
        polyupdate0.add3((-1), 863, 2735, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        polyupdate0.clear();
        polyupdate0.a((-3));
        java.lang.Class<?> wildcardClass11 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 0);
        int int42 = polyupdate41.sm();
        int int43 = polyupdate41.sm();
        polyupdate41.add3(533, 536, (int) (short) 10, 143);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 109 + "'", int42 == 109);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 109 + "'", int43 == 109);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-5));
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 112);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 94);
        java.lang.Class<?> wildcardClass17 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 110);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 209);
        polyupdate35.a(1793);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        polyupdate27.add3(9, (-10), 4, 161);
        polyupdate27.a(0);
        polyupdate27.clear();
        polyupdate27.a(839);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.a((int) (short) 10);
        polyupdate0.a(154);
        java.lang.Class<?> wildcardClass8 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.a((int) (short) 10);
        polyupdate0.a((int) (byte) 10);
        polyupdate0.a(0);
        polyupdate0.add3(189, 1882, 177, 3017);
        polyupdate0.add3(223, 543, 1601, 894);
        polyupdate0.a(10);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) 100);
        polyupdate35.a(141);
        polyupdate35.clear();
        int int39 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        java.lang.Class<?> wildcardClass44 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 315);
        polyupdate33.add3(0, 32, 134, 491);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 308);
        java.lang.Class<?> wildcardClass40 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        polyupdate29.a((-9));
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 108 + "'", int30 == 108);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 44 + "'", int36 == 44);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 44 + "'", int37 == 44);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        polyupdate31.add3(289, 301, 1128, 202);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 112);
        polyupdate43.add3(271, 226, 514, (int) '#');
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        polyupdate39.a((-1));
        polyupdate39.add3(368, 1112, 97, 858);
        polyupdate39.a(436);
        int int49 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3307 + "'", int49 == 3307);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        polyupdate39.a(599);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 164);
        polyupdate33.clear();
        polyupdate33.add3(369, 1828, 8, (-5));
        polyupdate33.add3(1541, 85, 361, 368);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 488);
        java.lang.Class<?> wildcardClass32 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 373);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 82);
        java.lang.Class<?> wildcardClass34 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.lang.Class<?> wildcardClass40 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        polyupdate29.clear();
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass32 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        polyupdate29.a(118);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 549);
        polyupdate35.a(182);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 577);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 40);
        int int13 = polyupdate12.sm();
        polyupdate12.a(3017);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 564 + "'", int13 == 564);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        java.lang.Class<?> wildcardClass36 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.add3((-100), 100, 3, 4);
        polyupdate29.a(141);
        int int37 = polyupdate29.sm();
        polyupdate29.a(132);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 289 + "'", int37 == 289);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 6);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 543);
        java.lang.Class<?> wildcardClass34 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(929);
        polyupdate0.a(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.a((int) (byte) 0);
        int int35 = polyupdate27.sm();
        polyupdate27.add3(1142, 0, 69, 1261);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 135 + "'", int35 == 135);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        polyupdate33.add3(9, 251, 0, 2);
        polyupdate33.add3((int) 'a', 15, (-2), 729);
        polyupdate33.add3(322, 253, 1439, 1261);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(0, 0, 223, 1);
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(426, 361, (int) (byte) 10, 495);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(1100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 260);
        polyupdate31.add3(138, 1679, 85, 92);
        int int37 = polyupdate31.sm();
        int int38 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1994 + "'", int37 == 1994);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1994 + "'", int38 == 1994);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        int int34 = polyupdate33.sm();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        polyupdate43.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        polyupdate35.a(796);
        polyupdate35.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        polyupdate14.add3((-10), 441, 1293, 800);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 129);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        polyupdate12.add3((-100), 260, 69, 0);
        polyupdate12.clear();
        polyupdate12.clear();
        int int20 = polyupdate12.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate33.a(261);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        polyupdate31.add3(260, 368, 368, 418);
        polyupdate31.a(2303);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 218 + "'", int32 == 218);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 218 + "'", int33 == 218);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        int int42 = polyupdate29.sm();
        int int43 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 379);
        polyupdate33.a(679);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(504);
        int int8 = polyupdate0.sm();
        int int9 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass10 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1008 + "'", int8 == 1008);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1008 + "'", int9 == 1008);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((int) ' ');
        polyupdate0.add3(5, (-1), 3, (-100));
        polyupdate0.add3(105, 905, 0, 204);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 481);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 578);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-3));
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(491);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.add3((int) '4', 9, (int) (short) 1, 7);
        int int9 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(109);
        polyupdate0.add3(251, (int) 'a', 502, (int) 'a');
        polyupdate0.a(660);
        polyupdate0.add3(1784, 224, (int) (byte) 0, 41);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        polyupdate0.add3(1652, 1122, 82, 481);
        java.lang.Class<?> wildcardClass12 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        polyupdate31.add3(244, (int) (short) 0, 320, 247);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        polyupdate37.a(212);
        java.lang.Class<?> wildcardClass45 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        polyupdate10.add3(108, 226, 21, (-6));
        polyupdate10.add3(164, 91, 97, 9);
        int int21 = polyupdate10.sm();
        polyupdate10.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 361 + "'", int21 == 361);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        int int30 = polyupdate29.sm();
        int int31 = polyupdate29.sm();
        polyupdate29.a(2);
        polyupdate29.a((-10));
        polyupdate29.a(533);
        polyupdate29.clear();
        polyupdate29.add3(144, 1719, 380, 1201);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 109 + "'", int31 == 109);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) -1);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((-100), 0, 8, 0);
        polyupdate0.a((-8));
        polyupdate0.clear();
        int int9 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(577, (int) (byte) -1, (-9), (-6));
        int int7 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass8 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        polyupdate25.clear();
        polyupdate25.add3(369, (int) 'a', (-10), 727);
        polyupdate25.add3(97, 177, (-7), 427);
        polyupdate25.a(289);
        java.lang.Class<?> wildcardClass42 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 101 + "'", int38 == 101);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        int int32 = polyupdate31.sm();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 109 + "'", int32 == 109);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 134);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.add3(577, 58, 154, 7);
        polyupdate29.a(113);
        polyupdate29.a(612);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(100, (int) '4', (int) (short) -1, (-3));
        polyupdate0.add3(481, 92, (-100), (int) ' ');
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        int int11 = polyupdate10.sm();
        polyupdate10.add3(304, 92, 380, 264);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-9) + "'", int11 == (-9));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 44);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1793);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 717);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        int int21 = polyupdate0.sm();
        polyupdate0.a(543);
        polyupdate0.a(379);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 581 + "'", int20 == 581);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 581 + "'", int21 == 581);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 491);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 0);
        int int40 = polyupdate39.sm();
        int int41 = polyupdate39.sm();
        polyupdate39.a(607);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 109 + "'", int40 == 109);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 109 + "'", int41 == 109);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 134);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 239);
        java.lang.Class<?> wildcardClass38 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a((-17));
        polyupdate0.a(2);
        int int16 = polyupdate0.sm();
        polyupdate0.add3(299, (int) (byte) -1, 597, (int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 121 + "'", int16 == 121);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        polyupdate39.add3(607, 122, 20, 1100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        polyupdate0.add3(1652, 114, (int) 'a', 300);
        polyupdate0.a((int) (short) 100);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 18);
        polyupdate51.add3(0, 332, 32, 251);
        polyupdate51.add3(549, 1757, 113, 150);
        java.lang.Class<?> wildcardClass62 = polyupdate51.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        java.lang.Class<?> wildcardClass49 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 204);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 436);
        java.lang.Class<?> wildcardClass44 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 514);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.a(1);
        int int30 = polyupdate27.sm();
        int int31 = polyupdate27.sm();
        polyupdate27.a(164);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 211 + "'", int30 == 211);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 211 + "'", int31 == 211);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        java.lang.Class<?> wildcardClass20 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 91 + "'", int18 == 91);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 91 + "'", int19 == 91);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1039);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 773);
        polyupdate33.a(100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        int int30 = polyupdate29.sm();
        polyupdate29.add3(0, 161, 116, 98);
        polyupdate29.a(21);
        polyupdate29.add3(362, (-8), 701, (-2));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 112 + "'", int30 == 112);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass7 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        int int18 = polyupdate12.sm();
        java.lang.Class<?> wildcardClass19 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 315 + "'", int17 == 315);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 315 + "'", int18 == 315);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 9);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        polyupdate0.add3(892, 0, 0, 207);
        polyupdate0.add3(707, 320, 318, 641);
        polyupdate0.a(1092);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 101);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        polyupdate31.a(8);
        polyupdate31.add3(107, 99, 1541, 1257);
        int int39 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3004 + "'", int39 == 3004);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        int int45 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 100);
        polyupdate12.a(135);
        int int15 = polyupdate12.sm();
        polyupdate12.a(318);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 361 + "'", int15 == 361);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        java.lang.Class<?> wildcardClass37 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 493 + "'", int36 == 493);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        polyupdate8.a((-10));
        polyupdate8.a(6);
        int int13 = polyupdate8.sm();
        polyupdate8.add3((int) (short) 0, 0, 332, 267);
        polyupdate8.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        polyupdate25.add3(20, 102, 2, 8);
        int int33 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.add3(108, 0, 43, 1237);
        java.lang.Class<?> wildcardClass40 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 132 + "'", int33 == 132);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3(41, (int) '#', (int) 'a', 135);
        polyupdate0.clear();
        polyupdate0.add3(108, 1744, 102, 543);
        polyupdate0.add3(800, 854, 536, 303);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (short) -1);
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        polyupdate41.add3(44, (int) (byte) 1, 318, 132);
        polyupdate41.clear();
        polyupdate41.add3(1494, (int) (short) 10, 440, (-100));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 578);
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 40);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 20);
        polyupdate47.a(488);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 6);
        java.lang.Class<?> wildcardClass34 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((int) ' ');
        polyupdate0.add3(641, 531, (-8), 109);
        polyupdate0.add3(114, 135, 800, 69);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.a((-7));
        polyupdate0.add3(224, (int) (short) 1, 531, 308);
        polyupdate0.a(694);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        polyupdate31.add3(32, (-92), (int) 'a', 0);
        polyupdate31.add3(481, 112, 258, 301);
        java.lang.Class<?> wildcardClass42 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        polyupdate35.a(488);
        polyupdate35.add3(161, 384, 290, 10);
        java.lang.Class<?> wildcardClass43 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, (int) (short) 0);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList13, 97);
        polyupdate20.add3(0, 58, 20, (int) (short) 1);
        polyupdate20.clear();
        java.lang.Class<?> wildcardClass27 = polyupdate20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.lang.Class<?> wildcardClass48 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        polyupdate35.add3(854, (int) (byte) 10, 841, 504);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1480 + "'", int40 == 1480);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(206, 91, 196, 1899);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(0);
        polyupdate0.add3(0, 549, 267, 226);
        int int17 = polyupdate0.sm();
        polyupdate0.a(499);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1042 + "'", int17 == 1042);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 561);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 101);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        polyupdate37.a(244);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 469 + "'", int38 == 469);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 107);
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        polyupdate33.add3((-92), (int) 'a', 300, 209);
        int int39 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 514 + "'", int39 == 514);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        polyupdate35.add3(729, 10, 493, 1199);
        java.lang.Class<?> wildcardClass49 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 260 + "'", int38 == 260);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        int int40 = polyupdate39.sm();
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 332 + "'", int40 == 332);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.add3((-8), (int) (byte) -1, 701, 1042);
        java.lang.Class<?> wildcardClass33 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(134);
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        int int12 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3((int) (short) 100, (-4), (int) (short) 0, (-8));
        polyupdate0.a(7);
        polyupdate0.a(135);
        polyupdate0.a(214);
        polyupdate0.a(105);
        int int19 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1010 + "'", int19 == 1010);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        java.lang.Class<?> wildcardClass43 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 1042);
        polyupdate47.add3(1873, 91, 1441, 92);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        int int11 = polyupdate10.sm();
        int int12 = polyupdate10.sm();
        polyupdate10.a(1364);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 91 + "'", int11 == 91);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 204);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 436);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 894);
        java.lang.Class<?> wildcardClass46 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.a(0);
        polyupdate0.clear();
        polyupdate0.add3(206, 258, 176, 43);
        polyupdate0.a(384);
        int int15 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1451 + "'", int15 == 1451);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 202);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        int int28 = polyupdate25.sm();
        polyupdate25.clear();
        int int30 = polyupdate25.sm();
        polyupdate25.clear();
        int int32 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 323 + "'", int28 == 323);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-10));
        java.lang.Class<?> wildcardClass32 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        int int47 = polyupdate27.sm();
        polyupdate27.a(502);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 521 + "'", int47 == 521);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, (int) ' ');
        polyupdate18.clear();
        polyupdate18.a(82);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 164);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.a((int) (short) 10);
        polyupdate0.a(3);
        int int8 = polyupdate0.sm();
        polyupdate0.a(104);
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass13 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 229 + "'", int11 == 229);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        polyupdate0.a(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 189);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        int int29 = polyupdate25.sm();
        java.lang.Class<?> wildcardClass30 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 599);
        int int46 = polyupdate45.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 708 + "'", int46 == 708);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-5));
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 775);
        polyupdate14.a(380);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        int int49 = polyupdate41.sm();
        java.lang.Class<?> wildcardClass50 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        polyupdate33.a(102);
        polyupdate33.a(144);
        java.lang.Class<?> wildcardClass38 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(577, (int) (byte) -1, (-9), (-6));
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3((int) (byte) 0, 686, 379, 1293);
        int int15 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2358 + "'", int15 == 2358);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        int int13 = polyupdate12.sm();
        polyupdate12.clear();
        polyupdate12.add3((-17), (int) ' ', 793, 105);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 299 + "'", int13 == 299);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        int int30 = polyupdate29.sm();
        polyupdate29.clear();
        int int32 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        polyupdate41.clear();
        polyupdate41.a(2);
        polyupdate41.add3(244, 212, 300, 3);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        int int43 = polyupdate27.sm();
        int int44 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 199 + "'", int43 == 199);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 199 + "'", int44 == 199);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(775, 132, 379, 7);
        polyupdate0.add3(1257, 1092, 21, 308);
        int int15 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2678 + "'", int15 == 2678);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        polyupdate12.a((int) (short) 1);
        polyupdate12.a(7);
        polyupdate12.add3(110, 427, 32, 44);
        polyupdate12.a(708);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        polyupdate29.add3(1111, 1601, 3, 214);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) 'a', (int) '4', (int) (byte) 1, 0);
        polyupdate29.clear();
        polyupdate29.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        int int12 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(98);
        int int16 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 300 + "'", int12 == 300);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 196 + "'", int16 == 196);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        java.lang.Class<?> wildcardClass38 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 176);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 647);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 749);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        polyupdate41.add3(86, 10, (-15), 531);
        int int47 = polyupdate41.sm();
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 612 + "'", int47 == 612);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 10);
        polyupdate33.a((int) '4');
        java.lang.Class<?> wildcardClass36 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        java.lang.Class<?> wildcardClass40 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 1441);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 212);
        polyupdate35.add3(664, 854, 2735, 150);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate31.clear();
        polyupdate31.add3(271, 3017, 578, 216);
        java.lang.Class<?> wildcardClass38 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 303);
        java.lang.Class<?> wildcardClass34 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 101);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 647);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a(1);
        polyupdate0.a((-10));
        polyupdate0.add3(138, 138, 119, (-1));
        polyupdate0.a(440);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        java.lang.Class<?> wildcardClass34 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        polyupdate43.a(44);
        java.lang.Class<?> wildcardClass46 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1494);
        java.lang.Class<?> wildcardClass38 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        polyupdate41.a(717);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.a(5);
        polyupdate0.add3(0, (-6), 141, 91);
        int int20 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 226 + "'", int20 == 226);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        polyupdate8.add3((-6), 0, 6, 82);
        java.lang.Class<?> wildcardClass14 = polyupdate8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1652);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 664);
        java.lang.Class<?> wildcardClass34 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        polyupdate35.a(0);
        java.lang.Class<?> wildcardClass40 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 409 + "'", int38 == 409);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 69);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.lang.Class<?> wildcardClass43 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 103 + "'", int42 == 103);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        polyupdate8.a((-10));
        polyupdate8.a(6);
        int int13 = polyupdate8.sm();
        int int14 = polyupdate8.sm();
        int int15 = polyupdate8.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        int int34 = polyupdate33.sm();
        polyupdate33.add3(98, (int) '#', 1039, 129);
        polyupdate33.a(69);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 99 + "'", int34 == 99);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        int int34 = polyupdate33.sm();
        polyupdate33.a(469);
        java.lang.Class<?> wildcardClass37 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 144 + "'", int34 == 144);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        polyupdate33.add3(9, 251, 0, 2);
        polyupdate33.add3(9, 1473, 727, 863);
        polyupdate33.clear();
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 805);
        polyupdate33.a(390);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.a((int) (byte) 0);
        int int35 = polyupdate27.sm();
        int int36 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.a((-1));
        polyupdate27.add3(257, 0, 1744, 1257);
        java.lang.Class<?> wildcardClass45 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 135 + "'", int35 == 135);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 135 + "'", int36 == 135);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 44);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        polyupdate41.add3(1439, 2, 0, 373);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 315);
        polyupdate33.a(531);
        polyupdate33.add3(493, 712, 839, 679);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        polyupdate31.add3(260, 150, (-5), 1);
        java.lang.Class<?> wildcardClass37 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 1);
        java.lang.Class<?> wildcardClass11 = polyupdate10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        int int43 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1352 + "'", int43 == 1352);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        polyupdate8.a((-10));
        polyupdate8.clear();
        int int12 = polyupdate8.sm();
        polyupdate8.a(8);
        polyupdate8.clear();
        int int16 = polyupdate8.sm();
        java.lang.Class<?> wildcardClass17 = polyupdate8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        int int37 = polyupdate25.sm();
        polyupdate25.add3(775, 892, 253, 892);
        java.lang.Class<?> wildcardClass43 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 176);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 647);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 749);
        java.lang.Class<?> wildcardClass38 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        int int38 = polyupdate37.sm();
        java.lang.Class<?> wildcardClass39 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1828 + "'", int38 == 1828);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        polyupdate39.clear();
        polyupdate39.add3(176, 379, 86, 164);
        polyupdate39.clear();
        polyupdate39.a(607);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }
}

