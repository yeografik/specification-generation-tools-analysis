package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
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
        polyupdate39.a((-6));
        int int42 = polyupdate39.sm();
        polyupdate39.clear();
        polyupdate39.clear();
        polyupdate39.a(799);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 329 + "'", int42 == 329);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 264);
        polyupdate35.a(742);
        polyupdate35.a(6);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        int int30 = polyupdate29.sm();
        polyupdate29.add3(0, 161, 116, 98);
        polyupdate29.a(21);
        polyupdate29.add3(1744, (int) (byte) 1, 2492, 257);
        int int43 = polyupdate29.sm();
        polyupdate29.a(2395);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 112 + "'", int30 == 112);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4494 + "'", int43 == 4494);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(577, (int) (byte) -1, (-9), (-6));
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(624);
        polyupdate0.a(495);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 839);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 11);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 836);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList3, 1111);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 728);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
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
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.add3(132, 1064, 3695, 3873);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 9);
        int int36 = polyupdate35.sm();
        polyupdate35.clear();
        polyupdate35.add3(1910, 111, 822, 1203);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 118 + "'", int36 == 118);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
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
        java.lang.Class<?> wildcardClass19 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 839);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 11);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 973);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        polyupdate33.add3(961, 5272, 1014, 251);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(243, 766, 535, 16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.clear();
        polyupdate0.a(418);
        polyupdate0.add3(564, (int) (short) 100, 368, 226);
        polyupdate0.add3(3148, 360, 1892, 3075);
        polyupdate0.add3((-18), 197, 1945, 532);
        polyupdate0.add3(17, 148, 1405, 1579);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1007);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
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
        polyupdate39.a(796);
        int int42 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1815 + "'", int42 == 1815);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 2678);
        java.lang.Class<?> wildcardClass46 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1954);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
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
        java.lang.Class<?> wildcardClass40 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
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
        int int38 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 232 + "'", int38 == 232);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
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
        int int44 = polyupdate43.sm();
        polyupdate43.a(2388);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 218 + "'", int44 == 218);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 564);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 4);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 696);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 110);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 223);
        polyupdate35.add3(313, 1113, 395, 182);
        polyupdate35.add3(78, 875, 543, 694);
        polyupdate35.a(3719);
        polyupdate35.a(1251);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
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
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 686);
        polyupdate47.clear();
        polyupdate47.add3(410, 7816, 384, 154);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 132);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (byte) 1);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1988);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1652);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 664);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2753);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 94);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
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
        int int41 = polyupdate25.sm();
        polyupdate25.a(1875);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 737 + "'", int41 == 737);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        int int34 = polyupdate33.sm();
        int int35 = polyupdate33.sm();
        polyupdate33.add3(210, 854, (int) ' ', 892);
        polyupdate33.a(21);
        polyupdate33.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 161 + "'", int34 == 161);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 161 + "'", int35 == 161);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
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
        polyupdate0.clear();
        polyupdate0.a(6424);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 777);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 2473);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.add3(577, 58, 154, 7);
        polyupdate29.add3(300, 258, 727, 369);
        polyupdate29.clear();
        int int41 = polyupdate29.sm();
        polyupdate29.add3(197, 805, 805, 802);
        polyupdate29.add3(1425, 848, 302, 433);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 418);
        polyupdate12.clear();
        polyupdate12.add3(3873, 91, 420, 435);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 952);
        java.lang.Class<?> wildcardClass44 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        polyupdate0.add3(3, (-10), (int) (short) 100, (-1));
        int int12 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 92 + "'", int12 == 92);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        polyupdate25.clear();
        int int29 = polyupdate25.sm();
        polyupdate25.add3(15, 353, 540, 11617);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, 179);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList13, 964);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList13, 365);
        java.lang.Class<?> wildcardClass23 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
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
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 291);
        polyupdate33.add3(124, (-10), 91, 177);
        polyupdate33.clear();
        polyupdate33.add3(385, 1859, 0, 107);
        polyupdate33.clear();
        polyupdate33.a(253);
        polyupdate33.a(620);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
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
        polyupdate47.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 361);
        polyupdate31.add3(3670, 1719, 531, 1352);
        polyupdate31.add3(759, 550, 495, 259);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 109);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 424);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1293);
        polyupdate37.a(110);
        java.lang.Class<?> wildcardClass40 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        polyupdate25.a(1679);
        polyupdate25.add3(506, 572, 0, 608);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
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
        polyupdate41.add3(2431, 802, 3694, 694);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        int int32 = polyupdate31.sm();
        polyupdate31.a(775);
        polyupdate31.a(98);
        int int37 = polyupdate31.sm();
        java.lang.Class<?> wildcardClass38 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 244 + "'", int32 == 244);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1990 + "'", int37 == 1990);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(0, 253, 9, (-3));
        polyupdate0.a(535);
        polyupdate0.a(233);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.add3(950, 0, 2711, 1451);
        polyupdate29.a(38);
        int int37 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5188 + "'", int37 == 5188);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
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
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList3, 444);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList3, 0);
        polyupdate24.add3(1986, 929, 1059, 877);
        polyupdate24.a(921);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
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
        int int50 = polyupdate37.sm();
        polyupdate37.a(3723);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 376 + "'", int50 == 376);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        polyupdate31.clear();
        int int33 = polyupdate31.sm();
        int int34 = polyupdate31.sm();
        java.lang.Class<?> wildcardClass35 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 43);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 691);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 211);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1439);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 4113);
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 646);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 127);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 777);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
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
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 504 + "'", int34 == 504);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 504 + "'", int35 == 504);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
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
        polyupdate0.clear();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass20 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
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
        polyupdate45.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4517 + "'", int51 == 4517);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4517 + "'", int52 == 4517);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
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
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 1601);
        polyupdate51.clear();
        java.lang.Class<?> wildcardClass53 = polyupdate51.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        int int9 = polyupdate8.sm();
        int int10 = polyupdate8.sm();
        int int11 = polyupdate8.sm();
        polyupdate8.add3(3723, 647, (int) (short) 10, 3121);
        polyupdate8.a(4113);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 116);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 829);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        polyupdate8.add3(5, 318, 10, 315);
        int int14 = polyupdate8.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 648 + "'", int14 == 648);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
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
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 788 + "'", int40 == 788);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
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
        polyupdate39.add3(124, 111, 23, 148);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 164);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1193);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
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
        polyupdate37.add3(107, 44, (-1), 176);
        polyupdate37.add3(2, 188, 1480, 11);
        polyupdate37.a(299);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        int int9 = polyupdate8.sm();
        int int10 = polyupdate8.sm();
        polyupdate8.a(107);
        int int13 = polyupdate8.sm();
        polyupdate8.a(472);
        polyupdate8.add3(10382, 5534, 206, 5527);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 214 + "'", int13 == 214);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 398);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        int int10 = polyupdate0.sm();
        polyupdate0.add3(9, (int) ' ', (int) '4', (-10));
        polyupdate0.a(0);
        polyupdate0.add3(121, (-186), 758, 130);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 923);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 116);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 716);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1531);
        polyupdate39.clear();
        polyupdate39.a(880);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.add3((-10), 0, (int) '4', (int) (byte) 1);
        polyupdate27.a(0);
        polyupdate27.add3(108, 104, 21, (-5));
        polyupdate27.clear();
        int int51 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        polyupdate33.add3(224, 124, 1092, 1);
        polyupdate33.a(1122);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
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
        polyupdate37.a(258);
        int int40 = polyupdate37.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 851 + "'", int40 == 851);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 322);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1757);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 106);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 909);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
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
        polyupdate39.clear();
        polyupdate39.add3(194, 5, 2099, 191);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 116 + "'", int40 == 116);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 32);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 273);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 856);
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 965 + "'", int40 == 965);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.add3(5, 154, 101, 150);
        polyupdate27.clear();
        polyupdate27.a((-17));
        polyupdate27.a(1852);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 3046);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 708);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
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
        int int40 = polyupdate25.sm();
        int int41 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 624 + "'", int34 == 624);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 878 + "'", int40 == 878);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 878 + "'", int41 == 878);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 300);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1108);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 5);
        int int42 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 114 + "'", int42 == 114);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        int int32 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 104 + "'", int32 == 104);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 2834);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, (int) (byte) 100);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 280);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, 3722);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList5, 1522);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a((-17));
        polyupdate0.a(3017);
        polyupdate0.a(435);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        polyupdate0.a(32);
        polyupdate0.a(189);
        polyupdate0.a(300);
        polyupdate0.a(1892);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.clear();
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-10));
        polyupdate31.clear();
        java.lang.Class<?> wildcardClass33 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 117);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 3449);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(577, (int) (byte) -1, (-9), (-6));
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        int int9 = polyupdate0.sm();
        polyupdate0.a(124);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 839);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 2628);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 280);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList3, 3848);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 273);
        polyupdate45.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-7));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 69);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 3689);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 640);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
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
        polyupdate37.add3((int) '#', 41, 199, 5);
        int int43 = polyupdate37.sm();
        polyupdate37.a(802);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 280 + "'", int43 == 280);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1014);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1339);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
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
        polyupdate0.add3(506, 94, 499, 211);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 239 + "'", int17 == 239);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3(41, (int) '#', (int) 'a', 135);
        polyupdate0.clear();
        polyupdate0.add3(108, 1744, 102, 543);
        java.lang.Class<?> wildcardClass17 = polyupdate0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 209);
        polyupdate31.clear();
        polyupdate31.a(111);
        int int35 = polyupdate31.sm();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 222 + "'", int35 == 222);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
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
        polyupdate35.a(707);
        int int43 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1836 + "'", int43 == 1836);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 315);
        polyupdate33.add3(0, 415, 91, 40);
        polyupdate33.a(122);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        polyupdate0.add3((int) (short) 100, (-4), (int) (short) 0, (-8));
        polyupdate0.a(7);
        polyupdate0.clear();
        int int14 = polyupdate0.sm();
        polyupdate0.a(624);
        int int17 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1248 + "'", int17 == 1248);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
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
        int int52 = polyupdate51.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 210 + "'", int52 == 210);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
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
        polyupdate41.add3(323, (-9), 1551, 1146);
        polyupdate41.clear();
        polyupdate41.a(1499);
        polyupdate41.a(1339);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.add3(109, 8, (int) 'a', (int) ' ');
        polyupdate0.a(531);
        int int15 = polyupdate0.sm();
        int int16 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass17 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1308 + "'", int15 == 1308);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1308 + "'", int16 == 1308);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
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
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1417 + "'", int40 == 1417);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 43);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 97);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
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
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList3, 223);
        polyupdate20.add3(243, 0, 499, 504);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 2937);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3664);
        java.lang.Class<?> wildcardClass30 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 109);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 424);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 165);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1905);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
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
        polyupdate31.add3(446, (-7), 253, 177);
        int int47 = polyupdate31.sm();
        java.lang.Class<?> wildcardClass48 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 939 + "'", int41 == 939);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 869 + "'", int47 == 869);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
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
        polyupdate41.clear();
        polyupdate41.add3(549, 493, 558, 9867);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
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
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 600);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 4084);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        int int34 = polyupdate33.sm();
        polyupdate33.add3(905, 132, 892, 138);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 119 + "'", int34 == 119);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
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
        polyupdate39.clear();
        int int41 = polyupdate39.sm();
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        polyupdate35.a(1014);
        polyupdate35.a(472);
        int int40 = polyupdate35.sm();
        int int41 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3064 + "'", int40 == 3064);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3064 + "'", int41 == 3064);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 23);
        polyupdate41.a(38);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
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
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 64);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate31.clear();
        polyupdate31.a(0);
        polyupdate31.clear();
        polyupdate31.clear();
        int int37 = polyupdate31.sm();
        polyupdate31.a(614);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 37);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 561);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 41);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-92));
        int int36 = polyupdate35.sm();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 17 + "'", int36 == 17);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate31.a(218);
        int int34 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 597 + "'", int34 == 597);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
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
        polyupdate37.a(737);
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 905);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 234);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 2976);
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 9376);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-7));
        polyupdate33.a(6);
        polyupdate33.a(224);
        polyupdate33.add3(865, 1793, 230, 4160);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
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
        polyupdate27.add3(58, 0, 553, 105);
        int int43 = polyupdate27.sm();
        int int44 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 135 + "'", int35 == 135);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 135 + "'", int36 == 135);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 716 + "'", int43 == 716);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 716 + "'", int44 == 716);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(9);
        polyupdate0.add3(103, 0, 5, 921);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        polyupdate0.add3(138, 101, 21, 101);
        polyupdate0.a(7);
        polyupdate0.a(1494);
        polyupdate0.add3(1236, 0, 2582, 367);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, (int) (byte) 100);
        polyupdate10.a((int) (byte) 100);
        int int13 = polyupdate10.sm();
        int int14 = polyupdate10.sm();
        polyupdate10.a(3836);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 291 + "'", int13 == 291);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 291 + "'", int14 == 291);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
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
        polyupdate35.clear();
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        polyupdate8.add3((-6), 0, 6, 82);
        polyupdate8.a(488);
        polyupdate8.clear();
        polyupdate8.a(318);
        polyupdate8.a(499);
        java.lang.Class<?> wildcardClass21 = polyupdate8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
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
        polyupdate41.a(1763);
        polyupdate41.a(914);
        polyupdate41.a(1023);
        polyupdate41.a(1461);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
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
        polyupdate25.a(218);
        polyupdate25.add3(1753, 1945, 2096, 542);
        polyupdate25.a(969);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 802);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
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
        polyupdate41.a(20);
        int int45 = polyupdate41.sm();
        polyupdate41.a(1494);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 103 + "'", int42 == 103);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 143 + "'", int45 == 143);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 116);
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 549);
        polyupdate39.a(429);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate29.add3((int) (byte) 0, 109, (int) (byte) 0, 0);
        polyupdate29.add3(4, (int) (byte) 10, (-100), (-100));
        polyupdate29.clear();
        int int41 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 2374);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1057);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1293);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1308);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
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
        int int42 = polyupdate41.sm();
        polyupdate41.clear();
        int int44 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 167 + "'", int42 == 167);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        polyupdate33.clear();
        int int35 = polyupdate33.sm();
        polyupdate33.add3(216, 2611, 7955, 301);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
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
        polyupdate35.clear();
        int int39 = polyupdate35.sm();
        java.lang.Class<?> wildcardClass40 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        polyupdate25.a(1679);
        int int34 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3584 + "'", int34 == 3584);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        polyupdate33.add3(432, 69, 749, 7);
        polyupdate33.a(660);
        polyupdate33.a(3);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 3);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 143);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 4494);
        polyupdate18.a(138);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, (int) ' ');
        polyupdate18.add3((-3), 108, 101, (-17));
        int int24 = polyupdate18.sm();
        polyupdate18.clear();
        polyupdate18.add3(506, 427, 366, 709);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 189 + "'", int24 == 189);
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 41);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.add3(116, 20, 1039, (int) (short) 10);
        polyupdate0.add3(894, 1983, 1257, 2476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
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
        polyupdate12.a(1679);
        polyupdate12.a(99);
        polyupdate12.add3(264, 1188, 56, 440);
        java.lang.Class<?> wildcardClass29 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        polyupdate33.a((int) (byte) 1);
        polyupdate33.a((int) (byte) 100);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate31.add3(10, 0, 892, 1008);
        polyupdate31.a(607);
        polyupdate31.add3(495, 229, 113, 201);
        polyupdate31.add3(5, 1753, 1342, 624);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 211);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1439);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 4113);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1875);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1106);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
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
        polyupdate35.a(215);
        java.lang.Class<?> wildcardClass39 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
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
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 209 + "'", int38 == 209);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 209 + "'", int39 == 209);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(0);
        polyupdate0.clear();
        polyupdate0.a(91);
        int int11 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 182 + "'", int11 == 182);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
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
        polyupdate39.a(360);
        polyupdate39.clear();
        polyupdate39.add3(124, 987, (-10), 2760);
        polyupdate39.a(2339);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1333);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 646);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
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
        int int21 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1882 + "'", int21 == 1882);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.a((-15));
        polyupdate0.add3((int) (byte) 10, (int) ' ', 384, 1293);
        polyupdate0.a(2735);
        polyupdate0.add3(863, 803, 119, 135);
        polyupdate0.a(189);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 355);
        polyupdate35.add3(970, 473, 469, 2412);
        polyupdate35.add3(273, 1289, 1007, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 561);
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
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
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 481);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
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
        java.lang.Class<?> wildcardClass52 = polyupdate45.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4517 + "'", int51 == 4517);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 577);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 749);
        polyupdate29.add3(3024, 964, 338, 895);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        int int29 = polyupdate25.sm();
        polyupdate25.add3(1, 2, 97, 1);
        int int35 = polyupdate25.sm();
        int int36 = polyupdate25.sm();
        polyupdate25.a(2628);
        int int39 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 101 + "'", int36 == 101);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5357 + "'", int39 == 5357);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
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
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 177 + "'", int22 == 177);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a(107);
        polyupdate27.add3((-7), (int) (byte) 10, (int) '4', (int) (short) 1);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.add3((int) (byte) -1, 69, 0, 223);
        int int42 = polyupdate27.sm();
        polyupdate27.a(332);
        polyupdate27.add3(164, 1199, 686, 119);
        polyupdate27.a(1241);
        int int52 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 291 + "'", int42 == 291);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4650 + "'", int52 == 4650);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 1108);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        polyupdate31.a((int) 'a');
        int int34 = polyupdate31.sm();
        polyupdate31.clear();
        java.lang.Class<?> wildcardClass36 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 308 + "'", int34 == 308);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
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
        int int46 = polyupdate45.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 228 + "'", int46 == 228);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 40);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 426);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, 1784);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList5, (-2));
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList5, 3064);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate33.clear();
        polyupdate33.add3(1793, 796, 221, 214);
        polyupdate33.a(380);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
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
        polyupdate33.clear();
        int int41 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 369 + "'", int39 == 369);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        polyupdate31.a(179);
        polyupdate31.clear();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 2303);
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 379);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1352);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 4);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
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
        int int19 = polyupdate0.sm();
        polyupdate0.add3(5357, 6925, 261, 198);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 179 + "'", int19 == 179);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
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
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 440);
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 300);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
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
        polyupdate29.add3(5399, 0, 3722, 4698);
        int int49 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 13819 + "'", int49 == 13819);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1175);
        int int46 = polyupdate45.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1284 + "'", int46 == 1284);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(0, 0, 577, 44);
        polyupdate0.add3(892, 1092, 863, 1123);
        polyupdate0.add3(740, 1405, 3072, 762);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
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
        int int38 = polyupdate35.sm();
        polyupdate35.a(521);
        polyupdate35.add3(441, 473, 253, 841);
        polyupdate35.a(2678);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 432 + "'", int38 == 432);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(150);
        polyupdate0.add3(100, 0, 0, 1);
        polyupdate0.a(0);
        polyupdate0.a(253);
        int int21 = polyupdate0.sm();
        polyupdate0.a(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 607 + "'", int21 == 607);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(577, (int) (byte) -1, (-9), (-6));
        int int7 = polyupdate0.sm();
        polyupdate0.a(134);
        int int10 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 829 + "'", int10 == 829);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1076);
        int int44 = polyupdate43.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1185 + "'", int44 == 1185);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 21);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1859);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 3640);
        polyupdate39.clear();
        polyupdate39.add3(208, 40, 1188, 262);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(7, 124, 152, 1652);
        polyupdate0.add3(1442, (int) (byte) 1, 1106, 2142);
        polyupdate0.a(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 1905);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1);
        polyupdate31.a(928);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 230);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        int int34 = polyupdate33.sm();
        polyupdate33.clear();
        polyupdate33.a(3504);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 99 + "'", int34 == 99);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        int int32 = polyupdate31.sm();
        polyupdate31.a(775);
        polyupdate31.a(98);
        polyupdate31.clear();
        polyupdate31.add3(3004, 4952, 652, 123);
        java.lang.Class<?> wildcardClass43 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 244 + "'", int32 == 244);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.add3(5, 154, 101, 150);
        polyupdate27.clear();
        polyupdate27.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
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
        polyupdate33.add3(104, 531, 0, 3784);
        polyupdate33.clear();
        polyupdate33.a(987);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 854 + "'", int41 == 854);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
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
        polyupdate0.add3(2620, 1293, 97, (-3));
        int int21 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4007 + "'", int21 == 4007);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
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
        polyupdate37.add3(103, 102, 0, 804);
        polyupdate37.a(1199);
        polyupdate37.add3(599, 961, 847, 1797);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        polyupdate33.a(164);
        polyupdate33.clear();
        polyupdate33.a(2099);
        int int39 = polyupdate33.sm();
        polyupdate33.a(192);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4198 + "'", int39 == 4198);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 257);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 144);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 91);
        java.lang.Class<?> wildcardClass46 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 197);
        int int44 = polyupdate43.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 306 + "'", int44 == 306);
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 827);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 606);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, 179);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList13, 964);
        polyupdate20.add3(533, 794, 737, 1473);
        polyupdate20.a(1333);
        int int28 = polyupdate20.sm();
        int int29 = polyupdate20.sm();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6203 + "'", int28 == 6203);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6203 + "'", int29 == 6203);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 578);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 499);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1579);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 837);
        java.lang.Class<?> wildcardClass48 = polyupdate47.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        int int10 = polyupdate0.sm();
        polyupdate0.add3(82, 44, (-9), 92);
        polyupdate0.a(132);
        polyupdate0.a(259);
        int int20 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 991 + "'", int20 == 991);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        polyupdate0.add3(114, (int) (short) 100, 10, 0);
        polyupdate0.add3(244, (-6), 251, (-2));
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 100);
        int int23 = polyupdate0.sm();
        polyupdate0.add3(1486, 150, 0, 796);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 796);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 9867);
        polyupdate35.add3(0, 2582, 952, 1442);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a(1);
        polyupdate0.a(0);
        polyupdate0.a((-1));
        polyupdate0.clear();
        polyupdate0.add3(3149, 608, 3126, 4268);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.add3(0, 253, 9, (-3));
        polyupdate0.add3(104, 712, 264, 379);
        polyupdate0.add3(624, 540, 892, 1417);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-15));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        polyupdate35.clear();
        polyupdate35.a(4432);
        polyupdate35.add3(727, 179, 7, 4517);
        polyupdate35.add3(3235, 21, 2431, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.add3(0, 578, 109, 3820);
        int int18 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4507 + "'", int18 == 4507);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        int int30 = polyupdate29.sm();
        polyupdate29.a(1);
        polyupdate29.clear();
        polyupdate29.a(2420);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 318 + "'", int30 == 318);
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 3640);
        polyupdate39.a(1588);
        int int42 = polyupdate39.sm();
        java.lang.Class<?> wildcardClass43 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6925 + "'", int42 == 6925);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
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
        polyupdate25.a(2834);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.add3((-10), 0, (int) '4', (int) (byte) 1);
        polyupdate27.a(0);
        int int45 = polyupdate27.sm();
        polyupdate27.a(1757);
        polyupdate27.a(1370);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 43 + "'", int45 == 43);
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.add3(0, (-10), (int) (short) -1, (-5));
        polyupdate0.add3((int) (short) 100, (int) (byte) 0, 112, 226);
        polyupdate0.add3(1015, 858, 2, 258);
        java.lang.Class<?> wildcardClass21 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
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
        int int44 = polyupdate43.sm();
        polyupdate43.a(1392);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 109 + "'", int44 == 109);
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 7816);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.add3(9529, 3126, 1352, 7519);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        polyupdate0.a((-1));
        polyupdate0.a(0);
        polyupdate0.add3((int) (byte) 10, (-17), 244, (int) (byte) 10);
        polyupdate0.add3((-1), 8, 10, (-2));
        polyupdate0.a(9);
        polyupdate0.a(0);
        polyupdate0.clear();
        polyupdate0.add3(3184, 1451, 3519, 737);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.add3(577, (int) (byte) -1, (-9), (-6));
        int int7 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-3));
        int int11 = polyupdate0.sm();
        polyupdate0.a(717);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 561 + "'", int7 == 561);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3) + "'", int11 == (-3));
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
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
        java.lang.Class<?> wildcardClass40 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 624 + "'", int34 == 624);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.add3((-100), 100, 3, 4);
        polyupdate29.a(141);
        polyupdate29.add3(280, 9, 192, 630);
        polyupdate29.add3(1014, 784, 2555, 1272);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
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
        polyupdate12.a(1679);
        polyupdate12.add3(646, 247, 1652, 1109);
        polyupdate12.a(215);
        int int29 = polyupdate12.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4084 + "'", int29 == 4084);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 91);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) '4');
        int int13 = polyupdate12.sm();
        java.lang.Class<?> wildcardClass14 = polyupdate12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 43 + "'", int13 == 43);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1010);
        polyupdate43.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 970);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 11659);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        polyupdate12.a(1);
        polyupdate12.clear();
        polyupdate12.clear();
        polyupdate12.a(206);
        polyupdate12.add3(963, 895, 399, 869);
        polyupdate12.clear();
        polyupdate12.a(161);
        int int27 = polyupdate12.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 322 + "'", int27 == 322);
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 91);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 367);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 503);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
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
        polyupdate14.add3(1012, 856, 0, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate41.a((-15));
        polyupdate41.add3(0, 909, 2534, 1099);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 707);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 2476);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1679);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 225);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 2959);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.a(0);
        polyupdate0.a(507);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1193);
        polyupdate33.add3(1410, 3519, 390, 889);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
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
        polyupdate25.a(2167);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
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
        polyupdate39.add3(0, 0, 149, 749);
        polyupdate39.a(239);
        polyupdate39.clear();
        polyupdate39.clear();
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 290 + "'", int42 == 290);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
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
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
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
        polyupdate33.a(1782);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 260);
        polyupdate31.add3(138, 1679, 85, 92);
        int int37 = polyupdate31.sm();
        polyupdate31.add3(2497, 636, 476, 410);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1994 + "'", int37 == 1994);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
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
        polyupdate33.a(4517);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
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
        java.lang.Class<?> wildcardClass40 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.a(0);
        int int8 = polyupdate0.sm();
        polyupdate0.add3(108, (int) (byte) 0, 0, 1);
        polyupdate0.add3(1057, 895, 1237, (-3));
        polyupdate0.a(423);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
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
        polyupdate33.clear();
        polyupdate33.add3(244, 659, 230, 218);
        int int46 = polyupdate33.sm();
        polyupdate33.add3(540, 3580, 1148, 2096);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1351 + "'", int46 == 1351);
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 154);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2395);
        polyupdate35.a(7064);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1499);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        int int2 = polyupdate0.sm();
        polyupdate0.a(3);
        polyupdate0.a(7);
        polyupdate0.add3((int) (short) 10, (-9), 0, (-4));
        polyupdate0.a(2189);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
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
        polyupdate37.clear();
        polyupdate37.clear();
        polyupdate37.add3(2893, 869, 4651, 323);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-17));
        polyupdate0.clear();
        polyupdate0.clear();
        int int12 = polyupdate0.sm();
        polyupdate0.a(430);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.a(1);
        polyupdate0.a((-10));
        int int20 = polyupdate0.sm();
        polyupdate0.clear();
        java.lang.Class<?> wildcardClass22 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-6) + "'", int20 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.add3(8, 107, 0, (int) (short) 100);
        polyupdate0.a(41);
        polyupdate0.add3(0, 0, 427, 444);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.a((int) (short) 10);
        polyupdate0.a(3);
        int int8 = polyupdate0.sm();
        polyupdate0.a(104);
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(3090);
        polyupdate0.add3(44, 10, 208, 415);
        polyupdate0.clear();
        polyupdate0.add3(192, 2109, 253, 250);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 229 + "'", int11 == 229);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 369);
        int int13 = polyupdate12.sm();
        polyupdate12.a(58);
        polyupdate12.add3(803, (-4), 0, 543);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360 + "'", int13 == 360);
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
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
        polyupdate0.a(318);
        int int29 = polyupdate0.sm();
        int int30 = polyupdate0.sm();
        polyupdate0.add3(1693, 5198, 1138, 2316);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 636 + "'", int29 == 636);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 636 + "'", int30 == 636);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
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
        java.lang.Class<?> wildcardClass54 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 107);
        polyupdate10.clear();
        polyupdate10.add3(1364, 894, 858, 521);
        polyupdate10.clear();
        polyupdate10.a(1193);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
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
        polyupdate35.clear();
        polyupdate35.a(223);
        polyupdate35.a(106);
        polyupdate35.a(681);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 260 + "'", int38 == 260);
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1294);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 5399);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 481);
        int int34 = polyupdate33.sm();
        int int35 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 590 + "'", int34 == 590);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 590 + "'", int35 == 590);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 10);
        int int34 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 119 + "'", int34 == 119);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
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
        polyupdate39.clear();
        polyupdate39.a(499);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 646);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        int int30 = polyupdate29.sm();
        polyupdate29.add3(267, 729, 0, 118);
        int int36 = polyupdate29.sm();
        int int37 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 108 + "'", int30 == 108);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1114 + "'", int36 == 1114);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1114 + "'", int37 == 1114);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 3149);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 448);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
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
        polyupdate29.a(4);
        int int41 = polyupdate29.sm();
        int int42 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 15);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 578);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 225);
        polyupdate35.a(4100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.a((int) (short) 10);
        polyupdate0.a(3);
        int int8 = polyupdate0.sm();
        polyupdate0.clear();
        int int10 = polyupdate0.sm();
        polyupdate0.a(3184);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.add3(624, (int) '#', 108, 103);
        java.lang.Class<?> wildcardClass35 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate49.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
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
        polyupdate33.a(2);
        int int40 = polyupdate33.sm();
        polyupdate33.a(196);
        polyupdate33.a(3004);
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 385 + "'", int40 == 385);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-100));
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
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
        java.lang.Class<?> wildcardClass43 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 360 + "'", int42 == 360);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
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
        polyupdate25.add3(858, 624, 15, 800);
        polyupdate25.add3(18, 2959, 17, 1441);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 318);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1910);
        polyupdate37.a(10);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.a(0);
        polyupdate0.clear();
        polyupdate0.add3(206, 258, 176, 43);
        polyupdate0.add3(100, 2358, 473, 664);
        polyupdate0.a(481);
        polyupdate0.a(226);
        int int22 = polyupdate0.sm();
        polyupdate0.add3(247, 2893, 1680, 929);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5009 + "'", int22 == 5009);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) 1);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 1090);
        java.lang.Class<?> wildcardClass15 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        polyupdate8.a((-10));
        polyupdate8.a(6);
        int int13 = polyupdate8.sm();
        polyupdate8.add3((int) (short) 0, 0, 332, 267);
        int int19 = polyupdate8.sm();
        polyupdate8.a(291);
        int int22 = polyupdate8.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 599 + "'", int19 == 599);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1181 + "'", int22 == 1181);
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (int) (short) 1);
        polyupdate12.add3(110, (-10), (-1), (-8));
        int int18 = polyupdate12.sm();
        polyupdate12.add3(44, 308, 224, 132);
        polyupdate12.clear();
        polyupdate12.add3(551, (int) ' ', 493, 3235);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 91 + "'", int18 == 91);
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 390);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 418);
        polyupdate33.clear();
        polyupdate33.add3(0, 1007, 3664, 1092);
        int int40 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5763 + "'", int40 == 5763);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (short) 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-1));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1364);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 2582);
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
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
        polyupdate0.add3(86, 1522, 1583, 206);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 251 + "'", int22 == 251);
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
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
        polyupdate27.a(323);
        polyupdate27.clear();
        polyupdate27.a(1352);
        polyupdate27.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 103 + "'", int45 == 103);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 103 + "'", int46 == 103);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 103 + "'", int47 == 103);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        polyupdate27.add3((int) (byte) 100, 0, 0, (int) '#');
        polyupdate27.add3((-7), 7, (-6), 9);
        polyupdate27.add3((-10), 0, (int) '4', (int) (byte) 1);
        polyupdate27.clear();
        polyupdate27.a(4432);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
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
        polyupdate37.a(58);
        polyupdate37.a((-15));
        polyupdate37.a(1162);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 129);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
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
        polyupdate51.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 150);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, (-6));
        polyupdate14.a((int) 'a');
        int int17 = polyupdate14.sm();
        int int18 = polyupdate14.sm();
        polyupdate14.add3(1223, 429, 600, 775);
        polyupdate14.add3(153, 1986, 448, 3824);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 179 + "'", int17 == 179);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 179 + "'", int18 == 179);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 2208);
        polyupdate33.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 2976);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 2339);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
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
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 109 + "'", int36 == 109);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 141);
        polyupdate41.add3(253, 3670, 1106, 399);
        polyupdate41.clear();
        int int48 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) 'a');
        polyupdate41.a((-15));
        int int44 = polyupdate41.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 191 + "'", int44 == 191);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        int int9 = polyupdate8.sm();
        int int10 = polyupdate8.sm();
        polyupdate8.a(107);
        int int13 = polyupdate8.sm();
        polyupdate8.a(472);
        polyupdate8.add3(1407, 905, 2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 214 + "'", int13 == 214);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, (-5));
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 775);
        polyupdate14.a(300);
        polyupdate14.a(1039);
        polyupdate14.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (-17));
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 728);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 179);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, (-10));
        polyupdate45.clear();
        polyupdate45.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a(107);
        polyupdate27.add3((-7), (int) (byte) 10, (int) '4', (int) (short) 1);
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.add3((int) (byte) -1, 69, 0, 223);
        int int42 = polyupdate27.sm();
        polyupdate27.a(332);
        java.lang.Class<?> wildcardClass45 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 291 + "'", int42 == 291);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 144);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 572);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 3580);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 1014);
        polyupdate18.clear();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 143);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 2678);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-17));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 91);
        int int11 = polyupdate10.sm();
        polyupdate10.a(390);
        polyupdate10.a(427);
        polyupdate10.a(523);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 82 + "'", int11 == 82);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 2373);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 110);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 209);
        polyupdate35.a(369);
        polyupdate35.add3(230, 3024, 1257, 582);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1012);
        polyupdate33.add3(543, 810, 0, 121);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(134);
        int int10 = polyupdate0.sm();
        polyupdate0.a(3017);
        polyupdate0.add3(94, 229, 1342, 97);
        java.lang.Class<?> wildcardClass18 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
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
        polyupdate39.clear();
        polyupdate39.a(1114);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 707);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 2476);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1679);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 440);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 924);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 253);
        java.lang.Class<?> wildcardClass34 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (-92));
        polyupdate41.a(2395);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
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
        polyupdate37.a(905);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(69, 209, 6, (-100));
        polyupdate25.a(58);
        polyupdate25.clear();
        polyupdate25.add3(4430, 3514, 4197, 218);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        int int28 = polyupdate25.sm();
        int int29 = polyupdate25.sm();
        polyupdate25.clear();
        int int31 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 323 + "'", int28 == 323);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 323 + "'", int29 == 323);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 5491);
        java.lang.Class<?> wildcardClass44 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
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
        polyupdate33.add3(132, 10, 381, 258);
        polyupdate33.a((-186));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 99 + "'", int34 == 99);
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, 40);
        polyupdate12.add3(2526, 1294, 3047, 3075);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 390);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 418);
        polyupdate33.clear();
        int int35 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
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
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 1364);
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 3820);
        polyupdate51.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-17));
        polyupdate0.add3(244, 41, 103, (-9));
        int int15 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 379 + "'", int15 == 379);
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
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
        polyupdate37.a(520);
        polyupdate37.add3(11659, 417, 854, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
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
        polyupdate39.add3(1360, 952, 1693, 2388);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
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
        polyupdate0.add3(432, 1294, 109, 1679);
        int int34 = polyupdate0.sm();
        polyupdate0.add3(1303, 303, 803, 646);
        java.lang.Class<?> wildcardClass40 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3514 + "'", int34 == 3514);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1014);
        int int36 = polyupdate35.sm();
        int int37 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1123 + "'", int36 == 1123);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1123 + "'", int37 == 1123);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        int int7 = polyupdate6.sm();
        int int8 = polyupdate6.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-17) + "'", int7 == (-17));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-17) + "'", int8 == (-17));
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 802);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1856);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 325);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(150, 58, 260, (-100));
        int int15 = polyupdate0.sm();
        int int16 = polyupdate0.sm();
        polyupdate0.a(1740);
        java.lang.Class<?> wildcardClass19 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 368 + "'", int15 == 368);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 368 + "'", int16 == 368);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 488);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 2834);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
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
        polyupdate37.add3(1293, 1740, 3312, 258);
        polyupdate37.a(3722);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 303);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 9);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 222);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 551);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 5052);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        polyupdate0.a(99);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-17));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1092);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1000);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1451);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.a((-15));
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 135);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 561);
        polyupdate33.a(581);
        int int36 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1832 + "'", int36 == 1832);
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1744);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1293);
        polyupdate35.a(1442);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a(107);
        polyupdate27.a(2);
        polyupdate27.clear();
        polyupdate27.add3(141, 1719, 383, 301);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(148);
        int int23 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 296 + "'", int23 == 296);
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 253);
        polyupdate33.add3(535, 17, 1410, 572);
        polyupdate33.a(0);
        polyupdate33.a(369);
        java.lang.Class<?> wildcardClass43 = polyupdate33.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 839);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 811);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 894);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 192);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
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
        polyupdate35.add3(499, 961, 231, 540);
        int int42 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 116 + "'", int36 == 116);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2231 + "'", int42 == 2231);
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
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
        polyupdate33.add3(315, (int) (short) 0, 1092, 97);
        polyupdate33.a(495);
        polyupdate33.clear();
        int int48 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(10);
        polyupdate0.add3(99, (-1), 97, 107);
        polyupdate0.add3(2358, 319, (-15), 859);
        polyupdate0.clear();
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        polyupdate33.add3((-92), (int) 'a', 300, 209);
        polyupdate33.add3(404, 260, 3, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 251);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 1499);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 769);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
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
        java.lang.Class<?> wildcardClass40 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        polyupdate16.a(262);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
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
        polyupdate41.a(342);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 0);
        int int11 = polyupdate10.sm();
        polyupdate10.clear();
        polyupdate10.clear();
        polyupdate10.add3(64, 773, 1318, 3184);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-9) + "'", int11 == (-9));
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
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
        polyupdate18.clear();
        polyupdate18.a(1680);
        polyupdate18.add3(1537, 895, 799, 1417);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 323);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 892);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 2189);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate31.clear();
        polyupdate31.add3(271, 3017, 578, 216);
        polyupdate31.add3(2620, 100, 2711, 148);
        int int43 = polyupdate31.sm();
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5579 + "'", int43 == 5579);
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
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
        polyupdate33.a(130);
        int int38 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 260 + "'", int38 == 260);
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
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
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 367);
        examples.Polyupdate polyupdate49 = new examples.Polyupdate(intList22, 1122);
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 37);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
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
        polyupdate41.a(2303);
        polyupdate41.clear();
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 99);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1148);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 578);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 0);
        java.lang.Class<?> wildcardClass42 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.clear();
        int int5 = polyupdate0.sm();
        polyupdate0.add3(1, (int) (short) 1, (int) ' ', 7);
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(226);
        polyupdate0.a(2189);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
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
        polyupdate35.a(210);
        polyupdate35.clear();
        polyupdate35.add3(1968, 1289, 0, 154);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        int int30 = polyupdate29.sm();
        int int31 = polyupdate29.sm();
        polyupdate29.a(2);
        int int34 = polyupdate29.sm();
        polyupdate29.add3(380, 1023, 1203, 4517);
        java.lang.Class<?> wildcardClass40 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 109 + "'", int31 == 109);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 113 + "'", int34 == 113);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 108);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
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
        polyupdate41.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 110 + "'", int42 == 110);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 110 + "'", int43 == 110);
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 21);
        int int32 = polyupdate31.sm();
        int int33 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 130 + "'", int32 == 130);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 130 + "'", int33 == 130);
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
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
        polyupdate25.a((int) '#');
        int int50 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 270 + "'", int47 == 270);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 340 + "'", int50 == 340);
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        polyupdate0.clear();
        polyupdate0.a(0);
        polyupdate0.add3(0, 549, 267, 226);
        int int17 = polyupdate0.sm();
        int int18 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(429);
        int int22 = polyupdate0.sm();
        polyupdate0.clear();
        int int24 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1042 + "'", int17 == 1042);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1042 + "'", int18 == 1042);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 858 + "'", int22 == 858);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 10);
        polyupdate31.add3(218, 770, 10, (int) 'a');
        polyupdate31.clear();
        polyupdate31.a(1257);
        java.lang.Class<?> wildcardClass40 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 425);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 707);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 2476);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 304);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 290);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        int int13 = polyupdate12.sm();
        polyupdate12.clear();
        polyupdate12.clear();
        polyupdate12.a(204);
        polyupdate12.add3(1008, 154, 10, 2834);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 299 + "'", int13 == 299);
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 441);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-109));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 91);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
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
        polyupdate12.a(1679);
        polyupdate12.add3(646, 247, 1652, 1109);
        polyupdate12.a(56);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 91 + "'", int13 == 91);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        int int10 = polyupdate0.sm();
        polyupdate0.a((-6));
        polyupdate0.clear();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 1652);
        int int32 = polyupdate31.sm();
        polyupdate31.add3(232, 1924, 37, (-6));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1761 + "'", int32 == 1761);
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
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
        int int40 = polyupdate39.sm();
        java.lang.Class<?> wildcardClass41 = polyupdate39.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 223 + "'", int40 == 223);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 209);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 318);
        polyupdate33.clear();
        int int35 = polyupdate33.sm();
        polyupdate33.a(97);
        int int38 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 194 + "'", int38 == 194);
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-4));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 119);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 196);
        polyupdate35.clear();
        polyupdate35.a(836);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 561);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 204);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 549);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate27.add3((int) '#', 114, 98, (-3));
        polyupdate27.clear();
        int int34 = polyupdate27.sm();
        polyupdate27.a(3064);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
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
        int int40 = polyupdate25.sm();
        int int41 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 624 + "'", int34 == 624);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5855 + "'", int40 == 5855);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5855 + "'", int41 == 5855);
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(775, 132, 379, 7);
        int int10 = polyupdate0.sm();
        int int11 = polyupdate0.sm();
        polyupdate0.a(427);
        int int14 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1293 + "'", int10 == 1293);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1293 + "'", int11 == 1293);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147 + "'", int14 == 2147);
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
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
        polyupdate39.add3(258, 851, 2834, 1494);
        polyupdate39.add3(376, 481, 536, 1579);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 892 + "'", int45 == 892);
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 549);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 44);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 143);
        polyupdate41.a(264);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
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
        polyupdate25.a(429);
        polyupdate25.clear();
        polyupdate25.a(18);
        polyupdate25.add3(129, (-100), 630, 138);
        java.lang.Class<?> wildcardClass47 = polyupdate25.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 1531);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.clear();
        polyupdate0.add3((int) (short) -1, (-5), 4, 1);
        int int19 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(300);
        polyupdate0.add3((int) (byte) 100, (-1), 244, 429);
        polyupdate0.clear();
        polyupdate0.a(100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
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
        polyupdate29.clear();
        int int37 = polyupdate29.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 109 + "'", int31 == 109);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.a(561);
        polyupdate0.clear();
        polyupdate0.add3(379, 0, 0, 1541);
        polyupdate0.add3(1, (int) '4', 0, 201);
        java.lang.Class<?> wildcardClass17 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
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
        polyupdate33.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        polyupdate29.add3(0, 577, 98, (-17));
        polyupdate29.add3(318, 101, (int) (byte) 0, 7);
        polyupdate29.clear();
        polyupdate29.add3(267, 103, 20, 624);
        polyupdate29.clear();
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        int int32 = polyupdate31.sm();
        polyupdate31.a(214);
        polyupdate31.clear();
        int int36 = polyupdate31.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 114 + "'", int32 == 114);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1451);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 3898);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
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
        int int26 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-17));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
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
        int int40 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 241 + "'", int40 == 241);
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        polyupdate25.add3(20, 102, 2, 8);
        int int33 = polyupdate25.sm();
        polyupdate25.clear();
        int int35 = polyupdate25.sm();
        polyupdate25.add3(1241, 3307, 365, 291);
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 132 + "'", int33 == 132);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 211);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1439);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 673);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1111);
        java.lang.Class<?> wildcardClass44 = polyupdate43.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
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
        polyupdate37.clear();
        polyupdate37.clear();
        polyupdate37.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        int int4 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5) + "'", int4 == (-5));
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
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
        polyupdate41.clear();
        polyupdate41.add3(5399, 118, 0, 17);
        polyupdate41.add3(524, 3580, 586, 280);
        polyupdate41.a(586);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 114);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-8));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 135);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
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
        polyupdate0.clear();
        polyupdate0.add3(432, 150, 290, 342);
        polyupdate0.clear();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
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
        int int47 = polyupdate41.sm();
        polyupdate41.a(2388);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 165 + "'", int47 == 165);
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
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
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 581);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 3722);
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, 3473);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 3251);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        polyupdate0.add3(100, (-10), 9, 7);
        polyupdate0.clear();
        polyupdate0.add3(290, 0, 5, 1757);
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        int int8 = polyupdate0.sm();
        int int9 = polyupdate0.sm();
        polyupdate0.add3(1074, 1793, 582, 304);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
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
        int int42 = polyupdate33.sm();
        int int43 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 99 + "'", int34 == 99);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1439 + "'", int42 == 1439);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1439 + "'", int43 == 1439);
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 239);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(8);
        polyupdate0.a(756);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, (-100));
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 91);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 1744);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 182);
        polyupdate14.a(260);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
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
        examples.Polyupdate polyupdate51 = new examples.Polyupdate(intList22, 215);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 308);
        int int13 = polyupdate12.sm();
        polyupdate12.add3(3722, 0, 1537, 2555);
        polyupdate12.add3(196, 3251, 353, 533);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 299 + "'", int13 == 299);
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 775);
        polyupdate39.clear();
        polyupdate39.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(0);
        int int28 = polyupdate25.sm();
        int int29 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.a(41);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 2272);
        polyupdate39.add3(2147, 2504, 289, 2147);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
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
        polyupdate39.add3((int) (short) 100, 223, 114, (-8));
        polyupdate39.clear();
        polyupdate39.clear();
        polyupdate39.clear();
        int int48 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        int int10 = polyupdate0.sm();
        polyupdate0.add3(659, (int) (short) 0, 258, 493);
        int int16 = polyupdate0.sm();
        int int17 = polyupdate0.sm();
        java.lang.Class<?> wildcardClass18 = polyupdate0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1410 + "'", int16 == 1410);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1410 + "'", int17 == 1410);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 577);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 260);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 1588);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
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
        polyupdate43.add3((int) 'a', (int) (short) -1, 102, (-5));
        polyupdate43.a(3784);
        polyupdate43.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        polyupdate8.a((int) (short) 10);
        polyupdate8.add3(116, 488, 384, (int) (byte) -1);
        polyupdate8.add3(224, 0, 796, 260);
        int int21 = polyupdate8.sm();
        polyupdate8.add3(2412, 56, 108, 1983);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1280 + "'", int21 == 1280);
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
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
        polyupdate25.add3(299, 0, 707, 551);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
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
        int int38 = polyupdate37.sm();
        java.lang.Class<?> wildcardClass39 = polyupdate37.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 305 + "'", int38 == 305);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 23);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 1794);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 2066);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1719);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
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
        polyupdate35.a(5938);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate27.add3((int) '#', 114, 98, (-3));
        int int33 = polyupdate27.sm();
        int int34 = polyupdate27.sm();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.clear();
        polyupdate27.add3(4197, 1142, 119, 359);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 244 + "'", int33 == 244);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 244 + "'", int34 == 244);
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
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
        polyupdate27.a(424);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 135 + "'", int35 == 135);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 135 + "'", int36 == 135);
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.clear();
        polyupdate0.a((-5));
        polyupdate0.a((int) (short) 10);
        polyupdate0.a(3);
        polyupdate0.clear();
        polyupdate0.add3(4841, 1652, 323, 508);
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 0);
        polyupdate31.clear();
        polyupdate31.add3(1821, 1354, 369, 191);
        polyupdate31.add3(8, 427, 311, 755);
        polyupdate31.add3(1190, 319, 2960, 3519);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        polyupdate0.clear();
        int int3 = polyupdate0.sm();
        int int4 = polyupdate0.sm();
        int int5 = polyupdate0.sm();
        int int6 = polyupdate0.sm();
        polyupdate0.a(332);
        polyupdate0.add3((-100), 1122, 1342, (int) (short) 0);
        polyupdate0.a(508);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.a(100);
        polyupdate27.add3(10, (int) 'a', 2, (-10));
        int int35 = polyupdate27.sm();
        polyupdate27.a(840);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 99 + "'", int35 == 99);
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 839);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 2628);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList3, 280);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList3, 105);
        java.lang.Class<?> wildcardClass21 = polyupdate20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 877);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 365);
        java.lang.Class<?> wildcardClass36 = polyupdate35.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 44);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 161);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 440);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 338);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 362);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        polyupdate31.add3(11, 1892, 108, 0);
        polyupdate31.a((-15));
        int int39 = polyupdate31.sm();
        polyupdate31.add3((-3), 1308, 380, 134);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1996 + "'", int39 == 1996);
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 97);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 15);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 578);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 225);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 1);
        polyupdate0.add3((int) (byte) 100, (-8), 7, (-1));
        polyupdate0.add3(10, (int) (short) 10, (int) (byte) 1, (-10));
        polyupdate0.a(5);
        int int15 = polyupdate0.sm();
        polyupdate0.a(20);
        polyupdate0.add3((-1), 0, 1652, 6154);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
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
        polyupdate27.add3(508, 2467, 261, 1873);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 103 + "'", int45 == 103);
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a((-17));
        polyupdate0.clear();
        int int11 = polyupdate0.sm();
        polyupdate0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.clear();
        polyupdate25.add3(100, (int) '#', (-9), (int) (byte) 100);
        int int32 = polyupdate25.sm();
        polyupdate25.a(103);
        polyupdate25.add3(1203, 1386, 225, 390);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
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
        polyupdate0.clear();
        polyupdate0.a(258);
        polyupdate0.a(5855);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 134 + "'", int10 == 134);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 134 + "'", int11 == 134);
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
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
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList3, 444);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList3, 708);
        examples.Polyupdate polyupdate24 = new examples.Polyupdate(intList3, 577);
        examples.Polyupdate polyupdate26 = new examples.Polyupdate(intList3, 2575);
        polyupdate26.add3(7760, 40, 0, 1450);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 32);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 273);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, (-186));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
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
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 104 + "'", int36 == 104);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 104 + "'", int37 == 104);
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.a((int) (byte) 0);
        int int32 = polyupdate29.sm();
        polyupdate29.clear();
        int int34 = polyupdate29.sm();
        polyupdate29.add3(3694, 1199, 257, 232);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 161 + "'", int32 == 161);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-10));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        int int34 = polyupdate33.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 109 + "'", int34 == 109);
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
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
        polyupdate35.add3(1142, 424, 481, 1008);
        polyupdate35.a(712);
        polyupdate35.a(5527);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 5);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 253);
        int int36 = polyupdate35.sm();
        polyupdate35.clear();
        int int38 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 362 + "'", int36 == 362);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        polyupdate29.a(98);
        polyupdate29.add3(6, 110, 114, 135);
        polyupdate29.a(202);
        polyupdate29.add3(2313, 0, 3075, 238);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        int int28 = polyupdate27.sm();
        polyupdate27.a((int) (byte) 100);
        int int31 = polyupdate27.sm();
        int int32 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 300 + "'", int31 == 300);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 300 + "'", int32 == 300);
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
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
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 264);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 427);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 784);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 1, 10, 100, 1, 9, 150, (-5), (-6), 100, 114, (-1), 114 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList13, (-10));
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList13, 179);
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList13, 964);
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList13, 1550);
        java.lang.Class<?> wildcardClass23 = polyupdate22.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.add3((int) (byte) 10, (int) (short) 100, 4, 0);
        int int6 = polyupdate0.sm();
        polyupdate0.a(10);
        int int9 = polyupdate0.sm();
        polyupdate0.clear();
        polyupdate0.a(122);
        polyupdate0.add3(82, 759, 1023, 44);
        polyupdate0.add3(3206, 261, 98, 1000);
        polyupdate0.a(1486);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1012);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.Polyupdate polyupdate2 = new examples.Polyupdate(intList0, 338);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
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
        polyupdate35.clear();
        int int42 = polyupdate35.sm();
        polyupdate35.clear();
        polyupdate35.a((int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 1392);
        polyupdate45.clear();
        java.lang.Class<?> wildcardClass47 = polyupdate45.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
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
        polyupdate39.clear();
        polyupdate39.clear();
        polyupdate39.a(365);
        polyupdate39.add3(1114, 1354, 668, 658);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 543);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 597);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 1092);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
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
        polyupdate25.add3(632, 802, 0, 102);
        int int50 = polyupdate25.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 226 + "'", int32 == 226);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1536 + "'", int50 == 1536);
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 211);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 1784);
        int int36 = polyupdate35.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1893 + "'", int36 == 1893);
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
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
        polyupdate39.clear();
        polyupdate39.a(435);
        int int47 = polyupdate39.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 290 + "'", int42 == 290);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 870 + "'", int47 == 870);
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
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
        polyupdate0.add3(318, 495, 858, 114);
        int int36 = polyupdate0.sm();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114 + "'", int6 == 114);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1785 + "'", int36 == 1785);
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
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
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass43 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 150 + "'", int36 == 150);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        polyupdate0.add3((int) ' ', 100, (-1), (-9));
        polyupdate0.a(5);
        int int10 = polyupdate0.sm();
        polyupdate0.add3(82, 44, (-9), 92);
        polyupdate0.a(132);
        polyupdate0.a(259);
        polyupdate0.a(7277);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 132 + "'", int10 == 132);
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 109);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 132);
        polyupdate12.clear();
        polyupdate12.add3(188, 107, 727, 247);
        polyupdate12.add3(306, 1193, 1128, 43);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 150);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 742);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 78);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        int int30 = polyupdate29.sm();
        polyupdate29.add3(10, 41, (-3), (-4));
        int int36 = polyupdate29.sm();
        polyupdate29.clear();
        java.lang.Class<?> wildcardClass38 = polyupdate29.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 108 + "'", int30 == 108);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 44 + "'", int36 == 44);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate29.a((int) (byte) 0);
        polyupdate29.a(132);
        polyupdate29.add3(15, (-1), (int) (short) 1, 119);
        polyupdate29.a(0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 7);
        int int40 = polyupdate39.sm();
        polyupdate39.add3(259, 594, (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 116 + "'", int40 == 116);
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 315);
        polyupdate35.add3(1092, 1349, (int) '4', 102);
        polyupdate35.a(811);
        polyupdate35.add3(233, 982, 78, 829);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 161);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 1122);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 1983);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList3, 444);
        int int17 = polyupdate16.sm();
        polyupdate16.add3(5198, 1111, 209, 1450);
        int int23 = polyupdate16.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 435 + "'", int17 == 435);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7968 + "'", int23 == 7968);
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) '4');
        polyupdate31.clear();
        polyupdate31.add3(271, 3017, 578, 216);
        polyupdate31.clear();
        polyupdate31.add3(263, 288, 1023, 1499);
        polyupdate31.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
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
        polyupdate29.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
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
        polyupdate41.clear();
        int int43 = polyupdate41.sm();
        polyupdate41.add3(369, 3556, 5272, 1473);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (short) 0);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 40);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 597);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 784);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        polyupdate29.a((-7));
        polyupdate29.a((int) (byte) 100);
        polyupdate29.clear();
        polyupdate29.a(176);
        polyupdate29.add3(225, 939, 10982, 1261);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
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
        int int47 = polyupdate45.sm();
        java.lang.Class<?> wildcardClass48 = polyupdate45.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        polyupdate25.a(108);
        polyupdate25.add3(20, 102, 2, 8);
        int int33 = polyupdate25.sm();
        polyupdate25.clear();
        polyupdate25.add3(108, 0, 43, 1237);
        polyupdate25.a(1237);
        polyupdate25.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 132 + "'", int33 == 132);
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
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
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 2795);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-100));
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, (-6));
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, (int) (byte) 0);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 0);
        java.lang.Class<?> wildcardClass38 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
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
        java.lang.Class<?> wildcardClass42 = polyupdate41.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
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
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 258);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 0);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 308);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 361);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 3562);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 766);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 727);
        polyupdate31.add3(543, 132, (int) '4', 251);
        polyupdate31.add3(964, 6034, 303, 0);
        java.lang.Class<?> wildcardClass42 = polyupdate31.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
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
        polyupdate29.a(4);
        polyupdate29.a(2358);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 150 + "'", int35 == 150);
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
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
        examples.Polyupdate polyupdate47 = new examples.Polyupdate(intList22, (int) '#');
        polyupdate47.a((-9));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 4);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 100);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 108);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList3, 41);
        int int15 = polyupdate14.sm();
        int int16 = polyupdate14.sm();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
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
        polyupdate25.a(429);
        int int39 = polyupdate25.sm();
        polyupdate25.add3(32, 3694, 840, 1269);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 107 + "'", int29 == 107);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 858 + "'", int39 == 858);
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        polyupdate0.a((int) (byte) 10);
        int int3 = polyupdate0.sm();
        polyupdate0.a(3004);
        polyupdate0.add3(4890, 1782, 1238, 361);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 3);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) 'a');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 543);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 597);
        java.lang.Class<?> wildcardClass36 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-9), 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        examples.Polyupdate polyupdate6 = new examples.Polyupdate(intList3, (-8));
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList3, 9);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList3, 189);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList3, 118);
        int int13 = polyupdate12.sm();
        polyupdate12.a(1181);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 109 + "'", int13 == 109);
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
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
        examples.Polyupdate polyupdate53 = new examples.Polyupdate(intList22, 3307);
        polyupdate53.a(3035);
        polyupdate53.add3(0, 1201, 1272, 1109);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) 100);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (-5));
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 141);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 481);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 280);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 98);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, 607);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, 152);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 805);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (-9));
        polyupdate27.add3((int) '4', (-1), 4, 209);
        polyupdate27.a(315);
        int int35 = polyupdate27.sm();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 894 + "'", int35 == 894);
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) '4');
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 10);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 7);
        examples.Polyupdate polyupdate37 = new examples.Polyupdate(intList22, 211);
        examples.Polyupdate polyupdate39 = new examples.Polyupdate(intList22, 1439);
        examples.Polyupdate polyupdate41 = new examples.Polyupdate(intList22, 4113);
        examples.Polyupdate polyupdate43 = new examples.Polyupdate(intList22, 1875);
        examples.Polyupdate polyupdate45 = new examples.Polyupdate(intList22, 2228);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
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
        int int35 = polyupdate31.sm();
        polyupdate31.clear();
        polyupdate31.clear();
        polyupdate31.add3(7968, 1551, 1751, 2628);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 209 + "'", int32 == 209);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 209 + "'", int33 == 209);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
        examples.Polyupdate polyupdate0 = new examples.Polyupdate();
        int int1 = polyupdate0.sm();
        int int2 = polyupdate0.sm();
        polyupdate0.clear();
        int int4 = polyupdate0.sm();
        polyupdate0.add3(4, (-3), (int) 'a', (-1));
        polyupdate0.add3(0, 0, 223, 1);
        polyupdate0.a(0);
        polyupdate0.add3(109, 1821, 640, 2800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 209, 244, 69, 2 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        examples.Polyupdate polyupdate8 = new examples.Polyupdate(intList5, 7);
        examples.Polyupdate polyupdate10 = new examples.Polyupdate(intList5, 491);
        examples.Polyupdate polyupdate12 = new examples.Polyupdate(intList5, (int) (byte) 100);
        examples.Polyupdate polyupdate14 = new examples.Polyupdate(intList5, 280);
        examples.Polyupdate polyupdate16 = new examples.Polyupdate(intList5, 3722);
        examples.Polyupdate polyupdate18 = new examples.Polyupdate(intList5, (-1));
        examples.Polyupdate polyupdate20 = new examples.Polyupdate(intList5, (-92));
        examples.Polyupdate polyupdate22 = new examples.Polyupdate(intList5, 3113);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, (int) (byte) 100);
        polyupdate27.clear();
        polyupdate27.a(182);
        polyupdate27.add3(223, 69, 299, 488);
        java.lang.Class<?> wildcardClass36 = polyupdate27.getClass();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-5), 8, 8, 9, 7, 7, (-9), (-4), (-3), (-10), (-4), (-3), 100, 10, (-6), (-6), (-6), (-1), (-3), 10 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        examples.Polyupdate polyupdate25 = new examples.Polyupdate(intList22, (-2));
        examples.Polyupdate polyupdate27 = new examples.Polyupdate(intList22, 100);
        examples.Polyupdate polyupdate29 = new examples.Polyupdate(intList22, (int) (byte) -1);
        examples.Polyupdate polyupdate31 = new examples.Polyupdate(intList22, (int) ' ');
        examples.Polyupdate polyupdate33 = new examples.Polyupdate(intList22, 409);
        examples.Polyupdate polyupdate35 = new examples.Polyupdate(intList22, 708);
        polyupdate35.clear();
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }
}

